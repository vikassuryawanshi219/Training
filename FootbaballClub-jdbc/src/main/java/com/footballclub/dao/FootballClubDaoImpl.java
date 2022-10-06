package com.footballclub.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.footballclub.model.FootballClub;
import com.footballclub.util.DBQueries;



@Repository
public class FootballClubDaoImpl implements IFootballClubDao {

	
private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	} 
	
	@Override
	public void addFootballClub(FootballClub footballClub) {
         Object[] footballClubArray= {
				
				footballClub.getClubName(),footballClub.getPlayerName(),footballClub.getPlayerPosition(),
				footballClub.getPlayerWages()
		};
		jdbcTemplate.update(DBQueries.INSERTQUERY,footballClubArray);
		
	}

	@Override
	public void updateFootballClub(int playerNumber, double playerWages) {
		String sql=DBQueries.UPDATEQUERY;
		jdbcTemplate.update(sql,playerNumber,playerWages);
		
	}

	@Override
	public void deleteFootballClub(int playerNumber) {
		String sql=DBQueries.deleteQUERY;
		jdbcTemplate.update(sql,playerNumber);
	}

	@Override
	public List<FootballClub> findAll() {
		RowMapper<FootballClub> mapper=new FootballClubMapper();
		List<FootballClub> footballClubs=
				jdbcTemplate.query(DBQueries.SELECTQUERY, mapper);
		
			return footballClubs;
	}

	@Override
	public List<FootballClub> findByClubName(String clubName) {
		
				
		return jdbcTemplate.query(DBQueries.SELECTBYCLUBNAME, new FootballClubMapper());
	}
		

	@Override
	public List<FootballClub> findByPlayerName(String playerName) {
		
		return jdbcTemplate.query(DBQueries.SELECTBYPLAYERNAME, new FootballClubMapper());
	}

	@Override
	public List<FootballClub> findByPlayerPosition(String playerPosition) {
		
		return jdbcTemplate.query(DBQueries.SELECTBYPLAYERPOSITION, new FootballClubMapper());
	}

	@Override
	public List<FootballClub> findByPlayerWages(double playerWages) {
		return jdbcTemplate.query(DBQueries.SELECTBYPLAYERWAGES, new FootballClubMapper());
	}

	@Override
	public FootballClub findByPlayerID(int playerNumber) {
		FootballClub nfootballclub=jdbcTemplate.queryForObject(DBQueries.SELECTBYPLAYERNUMBER,
				(rs,rowNum)->{
					FootballClub footballClub=new FootballClub();
					footballClub.setClubName(rs.getString("club_name"));
					footballClub.setPlayerName(rs.getString("player_name"));
					footballClub.setPlayerPosition(rs.getString("player_position"));
					footballClub.setPlayerWages(rs.getDouble("player_wages"));
					footballClub.setPlayerNumber(playerNumber);
					return footballClub;
				},playerNumber);
				
		return nfootballclub;
	}

}
