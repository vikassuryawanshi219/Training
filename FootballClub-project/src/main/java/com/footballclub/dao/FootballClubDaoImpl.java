package com.footballclub.dao;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.footballclub.exception.IdNotFoundException;
import com.footballclub.exception.PlayerNotFoundException;
import com.footballclub.model.FootballClub;


@Component
public class FootballClubDaoImpl implements IFootballClubDao {

	public List<FootballClub> findAll() {
		// TODO Auto-generated method stub
		return showAllFootballClub();
	}

	public List<FootballClub> findByClubName(String clubName) throws PlayerNotFoundException {
		// TODO Auto-generated method stub
		 return showAllFootballClub()
				.stream()
				.filter(footballClub->footballClub.getClubName().equalsIgnoreCase(clubName))
				.collect(Collectors.toList());
	}
	

	public List<FootballClub> findByPlayerName(String playerName) throws PlayerNotFoundException {
		// TODO Auto-generated method stub
		 return showAllFootballClub()
					.stream()
					.filter(footballClub->footballClub.getPlayerName().equalsIgnoreCase(playerName))
					.collect(Collectors.toList());
		}

	public List<FootballClub> findByPlayerPosition(String playerPosition) throws PlayerNotFoundException {
		// TODO Auto-generated method stub
		return showAllFootballClub()
				.stream()
				.filter(footballClub->footballClub.getPlayerPosition().equalsIgnoreCase(playerPosition))
				.collect(Collectors.toList());
	}


	public List<FootballClub> findByPlayerWages(double playerWages) throws PlayerNotFoundException {
		// TODO Auto-generated method stub
		return showAllFootballClub()
				.stream()
				.filter(footballClub->footballClub.getPlayerWages()==(playerWages))
				.collect(Collectors.toList());
	}

	@Override
	public FootballClub findByPlayerID(int playerNumber) throws IdNotFoundException {
		Optional<FootballClub> footballById= showAllFootballClub()
				.stream()
				.filter(footballClub->footballClub.getPlayerNumber()==playerNumber)
		        .findFirst();
				if(footballById.isPresent()) {
					return footballById.get();
				}
				return null;
			}

	
	
	private List<FootballClub> showAllFootballClub(){
		return Arrays.asList(
				new FootballClub("PSG","Messi","Center Forward",30,75000),
				new FootballClub("Real Madrid","Ronaldo","Center Forward",7,55000),
				new FootballClub("PSG","Neymar","Left Winger",10,50000),
				new FootballClub("Barcelona","Pedri","Center Midfilder",11,45000),
				new FootballClub("Real Madrid","Ronaldino","Right Winger",7,60000)
				);
	}
}
