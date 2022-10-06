package com.policyapp.client;

import com.policyapp.exception.PolicyNotFoundException;
import com.policyapp.service.IpolicyService;
import com.policyapp.service.PolicyServiceImpl;

public class User {

	public static void main(String[] args) throws PolicyNotFoundException {
	
		IpolicyService policyList=new PolicyServiceImpl();
		policyList.getAll().forEach(System.out::println);
		
		System.out.println("");
		 policyList.getByType("long").forEach(System.out::println);
		 System.out.println(" ");
		 policyList.getByCategory("retire").forEach(System.out::println);
		 
	}

}
