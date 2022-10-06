package com.policyapp.client;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.policyapp.exception.IdNotFoundException;
import com.policyapp.exception.PolicyNotFoundException;
import com.policyapp.service.IpolicyService;
import com.policyapp.service.PolicyServiceImpl;

public class User {

	public static void main(String[] args) throws PolicyNotFoundException {

		ApplicationContext context = new AnnotationConfigApplicationContext("com.policyapp");
		Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
		IpolicyService policyService= context.getBean(PolicyServiceImpl.class,"policyServiceImp");
		System.out.println("By all ");
		policyService.getAll().forEach(System.out::println);
		
		System.out.println("By Type");
		policyService.getByCategory("general").forEach(System.out::println);
		System.out.println("By coverage");
		policyService.getByCoverage("home").forEach(System.out::println);
		System.out.println("By SunAssured ");
		policyService.getByHighSunAssured(50000).forEach(System.out::println);
		System.out.println("By type");
		policyService.getByType("shortterm").forEach(System.out::println);
		
}
}