package com.playerapp.service;

import java.util.List;

import com.playerapp.model.Player;

public interface IPlayerService {
	void addplayer(Player player);
	void updateplayer(Player player);
	void deleteplayer(int playerId);
	
	Player getById(int playerId);
	
	List<Player> getAll();
	
	List<Player> getByCountry(String country);
	List<Player> getByPosition(String position);
	List<Player> getByClubName(String clubName);
	List<Player> getByHead(String head);
	List<Player> getByCountryAndHead(String country,String head);
	List<Player> getByClubNameAndHead(String clubName,String head);
	
}
