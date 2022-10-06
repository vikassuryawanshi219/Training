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
		Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
		IFootballClubService footballService= context.getBean(FootballClubServiceImpl.class,"footballClubServiceImpl");
	System.out.println("By all");
	footballService.getAll().forEach(System.out::println);
	
	System.out.println("");
	footballService.getByClubName("PSG").forEach(System.out::println);
	
    System.out.println(" ");
    footballService.getByPlayerName("Messi").forEach(System.out::println);
    
    System.out.println("");
    footballService.getByPlayerPosition("Center Forword").forEach(System.out::println);
    
    System.out.println("");
    footballService.getByPlayerWages(75000).forEach(System.out::println);
    
    System.out.println("");
    System.out.println(footballService.getByPlayerID(30));
	}

}
