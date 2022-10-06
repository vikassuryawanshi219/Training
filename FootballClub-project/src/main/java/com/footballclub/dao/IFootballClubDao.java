package com.footballclub.dao;

import java.util.List;

import com.footballclub.exception.IdNotFoundException;
import com.footballclub.exception.PlayerNotFoundException;
import com.footballclub.model.FootballClub;

public interface IFootballClubDao {
	List<FootballClub> findAll();
	List<FootballClub> findByClubName(String clubName) throws PlayerNotFoundException;
	List<FootballClub> findByPlayerName(String playerName) throws PlayerNotFoundException;
	List<FootballClub> findByPlayerPosition(String playerPosition) throws PlayerNotFoundException;
	List<FootballClub> findByPlayerWages(double playerWages) throws PlayerNotFoundException;

	FootballClub findByPlayerID(int playerNumber) throws IdNotFoundException;
	}


