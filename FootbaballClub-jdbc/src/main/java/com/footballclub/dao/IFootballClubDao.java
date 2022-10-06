package com.footballclub.dao;

import java.util.List;


import com.footballclub.model.FootballClub;

public interface IFootballClubDao {
	
	void addFootballClub(FootballClub footballClub);
	void updateFootballClub(int playerNumber,double playerWages);
	void deleteFootballClub(int playerNumber);
	
	
	List<FootballClub> findAll();

	List<FootballClub> findByClubName(String clubName);
	List<FootballClub> findByPlayerName(String playerName);
	List<FootballClub> findByPlayerPosition(String playerPosition) ;
	List<FootballClub> findByPlayerWages(double playerWages) ;
	FootballClub findByPlayerID(int playerNumber) ;
	}


