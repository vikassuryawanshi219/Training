package com.footballclub.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.footballclub.model.FootballClub;

public class FootballClubMapper implements RowMapper<FootballClub>{

	@Override
	public FootballClub mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		String clubName =rs.getString("club_name");
		String playerName =rs.getString("player_name");
		String playerPosition =rs.getString("player_position");
		double playerWages =rs.getDouble("player_wages");
		
		FootballClub footballClub=new FootballClub();
		footballClub.setClubName(clubName);
		footballClub.setPlayerName(playerName);
		footballClub.setPlayerPosition(playerPosition);
		footballClub.setPlayerWages(playerWages);
		
		return footballClub;
		
		
		
	}

}
