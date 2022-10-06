package com.footballclub.model;

public class FootballClub {
	private String clubName;
	private String playerName;
	private String playerPosition;
	private int playerNumber;
	private double playerWages;
	
	
	
	public FootballClub() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FootballClub(String clubName, String playerName, String playerPosition, int playerNumber,
			double playerWages) {
		super();
		this.clubName = clubName;
		this.playerName = playerName;
		this.playerPosition = playerPosition;
		this.playerNumber = playerNumber;
		this.playerWages = playerWages;
	}

	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerPosition() {
		return playerPosition;
	}
	public void setPlayerPosition(String playerPosition) {
		this.playerPosition = playerPosition;
	}
	public int getPlayerNumber() {
		return playerNumber;
	}
	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	public double getPlayerWages() {
		return playerWages;
	}
	public void setPlayerWages(double playerWages) {
		this.playerWages = playerWages;
	}
	@Override
	public String toString() {
		return "FootballClub [clubName=" + clubName + ", playerName=" + playerName + ", playerPosition="
				+ playerPosition + ", playerNumber=" + playerNumber + ", playerWages=" + playerWages + "]";
	}
	
	
	

}
