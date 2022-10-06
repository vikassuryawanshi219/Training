package com.policyapp.client;

import com.policyapp.exception.IdNotFoundException;
import com.policyapp.exception.PolicyNotFoundException;
import com.policyapp.service.IpolicyService;
import com.policyapp.service.PolicyServiceImpl;

public class User {

	public static void main(String[] args) throws PolicyNotFoundException {

		IpolicyService policyList = new PolicyServiceImpl();
		policyList.getAll().forEach(System.out::println);

		try {
			System.out.println("");
			policyList.getByType("longterm").forEach(System.out::println);
			System.out.println(" ");
			policyList.getByCategory("general").forEach(System.out::println);
			System.out.println(" ");
			policyList.getByHighSunAssured(20000).forEach(System.out::println);
			System.out.println(" ");
			policyList.getByLessPremium(5000).forEach(System.out::println);
			System.out.println(" ");
			policyList.getByCoverage("home").forEach(System.out::println);
			System.out.println(" ");
			System.out.println(policyList.getById(1001));
			
		} catch (PolicyNotFoundException | IdNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
