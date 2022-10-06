package com.policyapp.duo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.policyapp.exception.IdNotFoundException;
import com.policyapp.exception.PolicyNotFoundException;
import com.policyapp.model.Policy;

public class PolicyDaoImpl implements IpolicyDao {
	
	@Override
	public List<Policy> findAll() {
		// TODO Auto-generated method stub
		return showAllPolicies();
	}

	@Override
	public List<Policy> findByType(String type) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return showAllPolicies()
				.stream()
				.filter(policy->policy.getType().equalsIgnoreCase(type))
				.collect(Collectors.toList());
	}

	@Override
	public List<Policy> findByCategory(String category) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return showAllPolicies()
				.stream()
				.filter(policy->policy.getCategory().equalsIgnoreCase(category))
				.collect(Collectors.toList());
	}
	

	@Override
	public List<Policy> findByHighSunAssured(double sumAssured) throws PolicyNotFoundException {
		
		return showAllPolicies()
				.stream()
				.filter(policy->policy.getSumAssured()==(sumAssured))
				.collect(Collectors.toList());
	}

	@Override
	public List<Policy> findByCoverage(String coverage) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return showAllPolicies()
				.stream()
				.filter(policy->policy.getCoverage()==(coverage))
				.collect(Collectors.toList());
	}

	@Override
	public List<Policy> findByLessPremium(double premium) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return  showAllPolicies()
				.stream()
				.filter(policy->policy.getPremium()==(premium))
				.collect(Collectors.toList());
	}

	@Override
	public Policy findById(int policyId) throws IdNotFoundException {
		Optional<Policy> policyById= showAllPolicies()
		.stream()
		.filter(policy->policy.getPolicyNumber()==policyId)
        .findFirst();
		if(policyById.isPresent()) {
			return policyById.get();
		}
		return null;
	}
private List<Policy> showAllPolicies(){
	return Arrays.asList(
			new Policy("jeevan sathi",1001,2000,"shortterm",5,"marrige","general",200000),
			new Policy("jeevan raksha",1002,4000,"longterm",40,"life","general",1000000),
			new Policy("motor raksha",1003,1000,"shortterm",6,"vehicle","general",50000),
			new Policy("educatinon giver",1004,4000,"shortterm",5,"education","general",700000),
			new Policy("house raksha",1005,5000,"longterm",40,"home","general",9000000)
			);
			
			
}}
