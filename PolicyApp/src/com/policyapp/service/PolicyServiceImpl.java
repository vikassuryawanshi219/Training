package com.policyapp.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.policyapp.duo.IpolicyDao;
import com.policyapp.duo.PolicyDaoImpl;
import com.policyapp.exception.IdNotFoundException;
import com.policyapp.exception.PolicyNotFoundException;
import com.policyapp.model.Policy;

public class PolicyServiceImpl implements IpolicyService {
	IpolicyDao policyDAO= new PolicyDaoImpl();
	

	@Override
	public List<Policy> getAll() {
		List<Policy>policies=policyDAO.findAll();
		List<Policy> policyList=policies
			.stream()
			.sorted((Policy p1,Policy p2)-> p1.getPolicyName().compareTo(p2.getPolicyName()))
                .collect(Collectors.toList());
                
		return policyList;
	}

	@Override
	public List<Policy> getByType(String type) throws PolicyNotFoundException {
		List<Policy>policies=policyDAO.findByType(type);
		List<Policy> policyList=policies
				.stream()
				.sorted((Policy p1,Policy p2)-> p1.getType().compareTo(p2.getType()))
	                .collect(Collectors.toList());
		if(policyList.isEmpty()) {
			throw new PolicyNotFoundException("this policy not found");
		}
		
		return policyList;
	}

	@Override
	public List<Policy> getByCategory(String category) throws PolicyNotFoundException {
		List<Policy>policies=policyDAO.findByCategory(category);
		List<Policy> policyList=policies
				.stream()
				.sorted((Policy p1,Policy p2)-> p1.getCategory().compareTo(p2.getCategory()))
	                .collect(Collectors.toList());
		if(policyList.isEmpty()) {
			throw new PolicyNotFoundException("this policy not found");
		}
		return policyList;
	}

	@Override
	public List<Policy> getByHighSunAssured(double sumAssured) throws PolicyNotFoundException {
		List<Policy>policies=policyDAO.findByHighSunAssured(sumAssured);
		List<Policy> policyList=policies
				.stream()
				.sorted((Policy p1,Policy p2)-> p1.getPolicyName().compareTo(p2.getPolicyName()))
	                .collect(Collectors.toList());
		if(policyList.isEmpty()) {
			throw new PolicyNotFoundException("this policy not found");
		}
		return policyList;
	}

	@Override
	public List<Policy> getByCoverage(String coverage) throws PolicyNotFoundException {
		List<Policy>policies=policyDAO.findByCoverage(coverage);
		List<Policy> policyList=policies
				.stream()
				.sorted((Policy p1,Policy p2)-> p1.getCoverage().compareTo(p2.getCoverage()))
	                .collect(Collectors.toList());
		if(policyList.isEmpty()) {
			throw new PolicyNotFoundException("this policy not found");
		}
		return policyList;
	}

	@Override
	public List<Policy> getByLessPremium(double premium) throws PolicyNotFoundException {
		List<Policy>policies=policyDAO.findByHighSunAssured(premium);
		List<Policy> policyList=policies
				.stream()
				.sorted((Policy p1,Policy p2)-> p1.getPolicyName().compareTo(p2.getPolicyName()))
	                .collect(Collectors.toList());
		if(policyList.isEmpty()) {
			throw new PolicyNotFoundException("this policy not found");
		}
		return policyList;
	}

	@Override
	public Policy getById(int policyId) throws IdNotFoundException {
		Policy policyById=policyDAO.findById(policyId);
		if(policyById!=null) {
		return policyById;
	
		}
		throw new IdNotFoundException("id not found Exception");	
	}

}
