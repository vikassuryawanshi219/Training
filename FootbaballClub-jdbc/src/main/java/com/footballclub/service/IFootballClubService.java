package com.footballclub.service;

import java.util.List;


import com.footballclub.model.FootballClub;

public interface IFootballClubService {
	
	void addFootballClub(FootballClub footballClub);
	void updateFootballClub(int playerNumber,double playerWages);
	void deleteFootballClub(int playerNumber);
	
List<FootballClub> getAll();
List<FootballClub> getByClubName(String clubName); 
List<FootballClub> getByPlayerName(String playerName); 
List<FootballClub> getByPlayerPosition(String playerPosition); 
List<FootballClub> getByPlayerWages(double playerWages) ;

FootballClub getByPlayerID(int playerNumber) ;
}
