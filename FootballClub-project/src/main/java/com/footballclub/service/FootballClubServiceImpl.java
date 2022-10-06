package com.footballclub.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.footballclub.dao.IFootballClubDao;
import com.footballclub.exception.IdNotFoundException;
import com.footballclub.exception.PlayerNotFoundException;
import com.footballclub.model.FootballClub;
@Service
public class FootballClubServiceImpl implements IFootballClubService {
	
	IFootballClubDao footballClubDao;

	public List<FootballClub> getAll() {
		List <FootballClub> football=footballClubDao.findAll();
		List<FootballClub>footballList=football
				.stream()
				.sorted((FootballClub f1,FootballClub f2)-> f1.getPlayerName().compareTo(f2.getPlayerName()))
				.collect(Collectors.toList());
		return footballList;
	}

	public List<FootballClub> getByClubName(String clubName) throws PlayerNotFoundException {
		List <FootballClub> football=footballClubDao.findByClubName(clubName);
		List<FootballClub>footballList=football
				.stream()
				.sorted((FootballClub f1,FootballClub f2)-> f1.getClubName().compareTo(f2.getClubName()))
				.collect(Collectors.toList());
		
		if(footballList.isEmpty()) {
			throw new PlayerNotFoundException("this player is not there");
			
		}
		return footballList;
	}

	public List<FootballClub> getByPlayerName(String playerName) throws PlayerNotFoundException {
		List <FootballClub> football=footballClubDao.findByPlayerName(playerName);
		List<FootballClub>footballList=football
				.stream()
				.sorted((FootballClub f1,FootballClub f2)-> f1.getPlayerName().compareTo(f2.getPlayerName()))
				.collect(Collectors.toList());
		
		if(footballList.isEmpty()) {
			throw new PlayerNotFoundException("this player is not there");
			
		}
		return footballList;
	}

	public List<FootballClub> getByPlayerPosition(String playerPosition) throws PlayerNotFoundException {
		List <FootballClub> football=footballClubDao.findByPlayerPosition(playerPosition);
		List<FootballClub>footballList=football
				.stream()
				.sorted((FootballClub f1,FootballClub f2)-> f1.getPlayerPosition().compareTo(f2.getPlayerPosition()))
				.collect(Collectors.toList());
		
		if(footballList.isEmpty()) {
			throw new PlayerNotFoundException("this player is not there");
			
		}
		return footballList;
	}

	public List<FootballClub> getByPlayerWages(double playerWages) throws PlayerNotFoundException {
		List <FootballClub> football=footballClubDao.findByPlayerWages(playerWages);
		List<FootballClub>footballList=football
				.stream()
				.sorted((FootballClub f1,FootballClub f2)-> f1.getPlayerName().compareTo(f2.getPlayerName()))
				.collect(Collectors.toList());
		
		if(footballList.isEmpty()) {
			throw new PlayerNotFoundException("this player is not there");
			
		}
		return footballList;
	}

	

	@Override
	public FootballClub getByPlayerID(int playerNumber) throws IdNotFoundException {
		FootballClub playerById=footballClubDao.findByPlayerID(playerNumber);
		if(playerById!=null) {
			return playerById;
		}
		
		throw new IdNotFoundException("Id not found exception");
	}

}
