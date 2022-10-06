package com.playerapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

public class Player {

	@Column(length = 30)
	private String playerName;

	@Id
	@GeneratedValue(generator = "player_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "player_gen", sequenceName = "player_seq", initialValue = 1, allocationSize = 1)
	private Integer playerId;

	@Column(length = 30)
	private String country;
	
	@Column(length = 30)
	private String position;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="club_id")
	private Club club;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(String playerName, String country, String position, Club club) {
		super();
		this.playerName = playerName;
		this.country = country;
		this.position = position;
		this.club = club;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Integer getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", playerId=" + playerId + ", country=" + country + ", position="
				+ position + "]";
	}
	
	
}
