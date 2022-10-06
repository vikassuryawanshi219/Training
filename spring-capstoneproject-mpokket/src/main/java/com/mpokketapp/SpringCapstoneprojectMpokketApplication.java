package com.mpokketapp;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mpokketapp.calculator.Calculator;
import com.mpokketapp.model.Loan;
import com.mpokketapp.model.LoanType;
import com.mpokketapp.model.User;
import com.mpokketapp.model.UserType;
import com.mpokketapp.service.ILoanService;
import com.mpokketapp.service.IUserService;

@SpringBootApplication
public class SpringCapstoneprojectMpokketApplication implements CommandLineRunner {

	@Autowired
	ILoanService loanService;

	@Autowired
	IUserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SpringCapstoneprojectMpokketApplication.class, args);
	}

	@Autowired
	Calculator calculator;

	@Override
	public void run(String... args) throws Exception {

		double emi = 0;
		Double principalAmount = (double) 12000;
		Integer duration = 2;
		emi = calculator.calEmiEntrepreneur(principalAmount, duration);

		double emi1 = 0;
	Double principalAmount1 = (double) 50000;
		Integer duration1 = 4;
		emi1 = calculator.calEmiBorrow(principalAmount1, duration1);


		
//	
//		Loan loan1= new Loan(LoanType.BUSINESSLOAN, "business loan", "sbi");	
//		Loan loan2= new Loan(LoanType.HOMELOAN,"home loan","icici bank");
//		Set <Loan> loanList=new HashSet<>(Arrays.asList(loan1));
//		Loan loan4= new Loan(LoanType.EDUCATIONLOAN,"education loan","icici bank");
//		Loan loan5= new Loan(LoanType.PERSONALLOAN,"personal loan","axis bank");
//		Loan loan6= new Loan(LoanType.HOMELOAN,"home loan","barodabank");
////		User user= new User("vikas", 723,LocalDate.of(2016, 9, 23), UserType.ENTREPRENEUR, "123456",principalAmount,emi,loanList);
//		Loan loan3= new Loan(LoanType.STUDENTLOAN ,"student Loan", "city bank");
//
//		Set <Loan> loanList2=new HashSet<>(Arrays.asList(loan3));
//Set <Loan> loanList3=new HashSet<>(Arrays.asList(loan5));
//Set <Loan> loanList4=new HashSet<>(Arrays.asList(loan6));
//Set <Loan> loanList5=new HashSet<>(Arrays.asList(loan4));
//Set <Loan> loanList6=new HashSet<>(Arrays.asList(loan2));
////		
////Set <Loan> loanList1=new HashSet<>(Arrays.asList(loan3));
//User user1= new User("ram", 126,LocalDate.of(1969, 10, 23), UserType.STUDENT, "81234767",principalAmount1,emi1,loanList);
//User user2= new User("ALex", 132,LocalDate.of(1970, 11, 13), UserType.ENTREPRENEUR, "98834767",principalAmount1,emi1,loanList2);
//
//  User user3= new User("Bob", 175,LocalDate.of(1965, 8, 04), UserType.EMPLOYEE,"98314767",principalAmount1,emi1,loanList3); 
//  User user4= new User("Fred",25,LocalDate.of(1973, 10, 24), UserType.ENTREPRENEUR, "72344767",principalAmount1,emi1,loanList6);
// User user5= new User("Max",715,LocalDate.of(1999, 1, 12), UserType.ENTREPRENEUR,"72344767",principalAmount1,emi1,loanList4);
// User user6= new User("Fred", 315,LocalDate.of(1989, 10, 31), UserType.STUDENT, "923474767",principalAmount1,emi1,loanList5);
// 
//////      
//userService.addUser(user1);
//
//
//userService.addUser(user2);
//
//	 userService.addUser(user3);
//	 userService.addUser(user4);
//	 	 userService.addUser(user5);
// userService.addUser(user6);
//	 
		//user Side
		/*
		 * System.out.println("By Bank");
		 * userService.getUserByBank("sbi").forEach(System.out::println);
		 * 
		 * System.out.println("loan Name");
		 * userService.getUserByLoanName("student loan").forEach(System.out::println);
		 * 
		 * System.out.println("Loan Id");
		 * userService.getUserByLoanId(2).forEach(System.out::println);
		 * 
		 * System.out.println("loan Type");
		 * userService.getUserByLoanType(LoanType.BUSINESSLOAN).forEach(System.out::
		 * println);
		 * 
		 * 
		 * //loan Side System.out.println("by DOB");
		 * loanService.getLoanByDob(LocalDate.of(2012, 10, 23)) .stream()
		 * .forEach((u)->System.out.println(u.getLoanType())); System.out.println();
		 * 
		 * System.out.println("by DOB");
		 * 
		 * 
		 */
//		 userService.getAll().forEach(System.out::println);
//		System.out.println( userService.getUserById(2));
////		 loanService.getByLoanId(2);
//		//userService.getUserByLoanId(2).forEach(System.out::println);
//		
//		loanService.getLoanByLoanType(LoanType.STUDENTLOAN).forEach(System.out::
//			println);;
	}
//	
}
