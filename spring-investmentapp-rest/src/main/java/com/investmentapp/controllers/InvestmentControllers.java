package com.investmentapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.investmentapp.model.Investment;
import com.investmentapp.service.IInvestmentService;
//@RestController
public class InvestmentControllers {

	IInvestmentService investmentService;

	@Autowired
	public void setInvestmentservice(IInvestmentService investmentService) {
		this.investmentService = investmentService;
	}

	@PostMapping("/investments")
	public void addInvestment(@RequestBody Investment investment) {
		investmentService.addInvestment(investment);
	}

	@PutMapping("/investments")
	public void updateInvestment(@RequestBody Investment investment) {
		investmentService.updateInvestment(investment);
	}

	@DeleteMapping("/investments")
	public void deleteInvestment(@PathVariable int planId) {
		investmentService.deleteInvestment(planId);
	}

// https://localhost:8080/investments
	@GetMapping("/investments")
	public List<Investment> getAll() {
		return investmentService.getAll();
	}

	@GetMapping("/investments/risk/{risk}/type/{type}")
	public List<Investment> getByRiskAndTerm(@PathVariable("risk") String risk, @PathVariable("term") int term) {
		return investmentService.getbyRiskAndTerm(risk, term);

	}

	@GetMapping("/investments/type/{type}")
	public List<Investment> getByType(@PathVariable("type") String type) {
		return investmentService.getbyType(type);

	}

	@GetMapping("/investments/purpose/{purpose}")
	public List<Investment> getByPurpose(@PathVariable("purpose") String purpose) {
		return investmentService.getbyPurpose(purpose);

	}

	@GetMapping("/investments/planId/{id}")
	public Investment getById(@PathVariable("id") int planId) {
		return investmentService.getById(planId);
	}

}