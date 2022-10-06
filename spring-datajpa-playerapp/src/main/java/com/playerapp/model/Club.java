package com.playerapp.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Club {
	@Id
	@GeneratedValue(generator = "club_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "club_gen", sequenceName = "club_sequence", initialValue = 1, allocationSize = 1)
    private Integer clubId;
	
	@Column(length = 30)
	private String clubName;
	
	@Column(length = 30)
	private String head;

	public Club() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Club(String clubName, String head) {
		super();
		this.clubName = clubName;
		this.head = head;
	}

	public Integer getClubId() {
		return clubId;
	}

	public void setClubId(Integer clubId) {
		this.clubId = clubId;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	@Override
	public String toString() {
		return "Club [clubId=" + clubId + ", clubName=" + clubName + ", head=" + head + "]";
	}
	
	
}
