package com.footballclub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.footballclub.model.FootballClub;
import com.footballclub.service.IFootballClubService;

@SpringBootApplication
public class FootbaballClubJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FootbaballClubJdbcApplication.class, args);
	}

	@Autowired
	IFootballClubService footballClubService;

	public void setIFootballClubService(IFootballClubService footballClubService) {
		this.footballClubService = footballClubService;
	}

	@Override
	public void run(String... args) throws Exception {

//		FootballClub footballClub = new FootballClub("Barcelona", "Messi", "forward", 10, 75000);
//		FootballClub footballClub1 = new FootballClub("Real Madrid", "Ronaldo", "forward", 7, 55000);
//		FootballClub footballClub3 = new FootballClub("psg", "Neymar", "Left Wing", 30, 5000);
//
//		footballClubService.addFootballClub(footballClub);
//		footballClubService.addFootballClub(footballClub1);
//		footballClubService.addFootballClub(footballClub3);
		
		System.out.println("By All");
		footballClubService.getAll().forEach(System.out::println);
		
		System.out.println("By Club Name");
		footballClubService.getByClubName("Barcelona");
		
		System.out.println("By Player Name");
		footballClubService.getByPlayerName("Messi");
		
		System.out.println("By player position");
		footballClubService.getByPlayerPosition("forward");
		
		System.out.println("By player Wages");
		footballClubService.getByPlayerWages(55000);
		
		System.out.println("By player Id");
		System.out.println(footballClubService.getByPlayerID(1));
		
	}

}
