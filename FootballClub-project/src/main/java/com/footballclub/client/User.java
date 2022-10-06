package com.footballclub.client;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.footballclub.exception.PlayerNotFoundException;
import com.footballclub.service.FootballClubServiceImpl;
import com.footballclub.service.IFootballClubService;


public class User {

	public static void main(String[] args) throws PlayerNotFoundException{
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.footballClub");
		
		IFootballClubService footballService= context.getBean(FootballClubServiceImpl.class,"footballClubServiceImpl");
		
	System.out.println("By All");
	footballService.getAll().forEach(System.out::println);
	
	System.out.println("By Club Name");
	footballService.getByClubName("PSG").forEach(System.out::println);
	
    System.out.println("By Player Name ");
    footballService.getByPlayerName("Messi").forEach(System.out::println);
    
    System.out.println("By Position");
    footballService.getByPlayerPosition("Center Midfilder").forEach(System.out::println);
    
    System.out.println("By wages");
    footballService.getByPlayerWages(75000).forEach(System.out::println);
    
    System.out.println("BY ID");
    System.out.println(footballService.getByPlayerID(30));
	}

}
