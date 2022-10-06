package com.playerapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.playerapp.model.Player;
import com.playerapp.repository.IPlayerRepository;
@Service
public class PlayerServiceImpl implements IPlayerService {
 
	IPlayerRepository playerRepository;
	@Override
	public void addplayer(Player player) {
		playerRepository.save(player);

	}

	@Override
	public void updateplayer(Player player) {
		playerRepository.save(player);

	}

	@Override
	public void deleteplayer(int playerId) {
		playerRepository.deleteById(playerId);

	}

	@Override
	public Player getById(int playerId) {
//		
//	//	Optional<Player> playerOpt= playerRepository.findById(playerId);
//		if(playerOpt.isPresent()) {
//			return playerOpt.get();
//		}
		return null;
	}

	@Override
	public List<Player> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getByCountry(String country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getByPosition(String position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getByClubName(String clubName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getByHead(String head) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getByCountryAndHead(String country, String head) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getByClubNameAndHead(String clubName, String head) {
		// TODO Auto-generated method stub
		return null;
	}

}
