package com.playerapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.playerapp.service.IPlayerService;

@SpringBootApplication
public class SpringDatajpaPlayerappApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaPlayerappApplication.class, args);
	}
	@Autowired
	IPlayerService playerService;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	

}
