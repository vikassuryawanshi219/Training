package com.footballclub.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.footballclub.dao.IFootballClubDao;

import com.footballclub.model.FootballClub;
import com.footballclub.util.DBQueries;

@Service
public class FootballClubServiceImpl implements IFootballClubService {
    
	public IFootballClubDao footballClubDao;
	
	@Autowired
	public void setFootballClubDao(IFootballClubDao footballClubDao) {
		this.footballClubDao=footballClubDao;
	}
	
	
	@Override
	public void addFootballClub(FootballClub footballClub) {
		footballClubDao.addFootballClub(footballClub);
	}

	@Override
	public void updateFootballClub(int playerNumber, double playerWages) {
		footballClubDao.updateFootballClub(playerNumber, playerWages);
	}

	@Override
	public void deleteFootballClub(int playerNumber) {
		footballClubDao.deleteFootballClub(playerNumber);
	}

	@Override
	public List<FootballClub> getAll() {
		// TODO Auto-generated method stub
		return footballClubDao.findAll();	}

	@Override
	public List<FootballClub> getByClubName(String clubName) {
		
		return footballClubDao.findByClubName(clubName);
	}

	@Override
	public List<FootballClub> getByPlayerName(String playerName) {
		
		return footballClubDao.findByPlayerName(playerName);
	}

	@Override
	public List<FootballClub> getByPlayerPosition(String playerPosition) {
		
		return footballClubDao.findByPlayerPosition(playerPosition);
	}

	@Override
	public List<FootballClub> getByPlayerWages(double playerWages) {
		
		return footballClubDao.findByPlayerWages(playerWages);
	}

	@Override
	public FootballClub getByPlayerID(int playerNumber) {
		// TODO Auto-generated method stub
		return footballClubDao.findByPlayerID(playerNumber);
	}

	
}
