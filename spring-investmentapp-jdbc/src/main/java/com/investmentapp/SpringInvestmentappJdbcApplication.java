package com.investmentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.investmentapp.model.Investment;
import com.investmentapp.model.Nominee;
import com.investmentapp.model.PlanType;
import com.investmentapp.model.Purpose;
import com.investmentapp.model.Risk;
import com.investmentapp.repository.IInvestmentRepository;
import com.investmentapp.service.IInvestmentService;

@SpringBootApplication
public class SpringInvestmentappJdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringInvestmentappJdbcApplication.class, args);
	}
	
	IInvestmentService investmentService;
	
	@Autowired
	public void setInvestmentService(IInvestmentService investmentService) {
		this.investmentService=investmentService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		
//	Investment investment=new  Investment("Voya Mutual", 10, PlanType.mutual.type, 9000,Purpose.MARRIAGE.name(),Risk.HIGH.name(),Nominee.SON.name(), 10);
//	Investment investment2=new  Investment("TATA Mutual", 4, PlanType.fd.type, 5000,Purpose.EDUCATION.name(),Risk.LOW.name(),Nominee.WIFE.name(), 8);
//	investmentService.addInvestment(investment);
//	investmentService.addInvestment(investment);
		
	investmentService.getAll().forEach(System.out::println);
	System.out.println();
	investmentService.getbyType("Mutual Fund").forEach(System.out::println);
	System.out.println();
	investmentService.getbyPurpose("Marriage").forEach(System.out::println);
	System.out.println();
	System.out.println(investmentService.getById(4));
	}}









