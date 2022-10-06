package com.voterapp.main;

import java.util.Scanner;

import com.voterapp.service.ElectionBoothImpl;
import com.voterapp.service.IElectionBooth;

public class VoteMain {

	public static void main(String[] args) {
		
		IElectionBooth election=new ElectionBoothImpl();
		Scanner sc= new Scanner (System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		System.out.println("enter your locality");
		String locality=sc.next();
		System.out.println("enter your voterId");
		int voterId=sc.nextInt();
		
	try {
			boolean check=election.checkEligibility(age,locality, voterId);
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
		}
	
	}

}
