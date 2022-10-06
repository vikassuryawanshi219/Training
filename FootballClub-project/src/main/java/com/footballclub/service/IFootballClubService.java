package com.footballclub.service;

import java.util.List;

import com.footballclub.exception.IdNotFoundException;
import com.footballclub.exception.PlayerNotFoundException;
import com.footballclub.model.FootballClub;

public interface IFootballClubService {
	
List<FootballClub> getAll();
List<FootballClub> getByClubName(String clubName) throws PlayerNotFoundException;
List<FootballClub> getByPlayerName(String playerName) throws PlayerNotFoundException;
List<FootballClub> getByPlayerPosition(String playerPosition) throws PlayerNotFoundException;
List<FootballClub> getByPlayerWages(double playerWages) throws PlayerNotFoundException;

FootballClub getByPlayerID(int playerNumber) throws IdNotFoundException;
}
