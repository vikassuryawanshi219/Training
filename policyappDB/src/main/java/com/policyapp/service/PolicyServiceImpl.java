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

	@Override
	public List<Policy> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Policy> getByType(String type) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Policy> getByCategory(String category) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Policy> getByHighSunAssured(double sumAssured) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Policy> getByCoverage(String coverage) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Policy> getByBrand(String brand) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Policy> getByLessPremium(double premium) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Policy getById(int policyId) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
