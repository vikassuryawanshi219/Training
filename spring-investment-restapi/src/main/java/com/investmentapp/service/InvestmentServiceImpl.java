package com.investmentapp.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investmentapp.exceptions.PlanNotFoundException;
import com.investmentapp.model.Investment;
import com.investmentapp.repository.IInvestmentRepository;


@Service
public class InvestmentServiceImpl implements IInvestmentService {

	IInvestmentRepository investmentRepository;
	
	@Autowired
	public void setInvestmentRepository(IInvestmentRepository investmentRepository) {
		this.investmentRepository=investmentRepository;
	}

	@Override
	public void addInvestment(Investment investment) {
		investmentRepository.save(investment);
		
	}

	@Override
	public void updateInvestment(Investment investment) {
		investmentRepository.save(investment);
		
	}

	@Override
	public void deleteInvestment(int planId) {
		investmentRepository.deleteById(planId);
		
	}

	@Override
	public List<Investment> getbyRiskAndTerm(String risk, int term) {
		
		List<Investment> investments=investmentRepository.findByRiskAndTerm(risk,term);
		if(investments.isEmpty())
			throw new PlanNotFoundException("plan with this term not found");
		return investments;
	}

	@Override
	public List<Investment> getbyType(String type) {
		
		List<Investment> investments=investmentRepository.findByType(type);
		if(investments.isEmpty())
			throw new PlanNotFoundException("plan with this type not found");
		return investments;
	}

	@Override
	public List<Investment> getbyPurpose(String purpose) {
	
		List<Investment> investments=investmentRepository.findByPurpose(purpose);
		if(investments.isEmpty())
			throw new PlanNotFoundException("plan with this purpose not found");
		return investments;
	}

	@Override
	public List<Investment> getAll() {
		
		return investmentRepository.findAll();
	}

	@Override
	public Investment getById(int planId)  {
		
//		Optional<Investment> investOpt=investmentRepository.findByID(planId);
//		if(investOpt.isEmpty())
//			throw new PlanNotFoundException(" invalid Id");
//		return  investOpt.get();
//		
		
		return investmentRepository.findById(planId).orElseThrow(()->{
			throw new PlanNotFoundException("Invalid id");
		});
		
		//return investmentRepository.findById(planId).orElseThrow(()-> throw new PlanNotFoundException("invalid id");)

		
	}

	@Override
	public double calculateMaturity(Investment investment) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Transactional
	public void updateInvestmentAmount(int planId,double amount) {
		investmentRepository.updateInvestment(planId, amount);
		
	}

	@Override
	public List<String> getAllTypes() {
		
		return investmentRepository.getAllTypes();
	}

	@Override
	public List<Investment> getbyRisk(String risk) {
		
		return investmentRepository.findByRisk(risk);
	}
	
	
}
