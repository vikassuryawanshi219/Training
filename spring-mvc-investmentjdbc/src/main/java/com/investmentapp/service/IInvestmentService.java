package com.investmentapp.service;

import java.util.List;

import com.investmentapp.exceptions.PlanNotFoundException;
import com.investmentapp.model.Investment;

public interface IInvestmentService {
void addInvestment(Investment investment);
void updateInvestment(double amount,int planId) throws PlanNotFoundException;
void deleteInvestment(int planId);


List<Investment> getbyRiskAndTerm(String risk,int term);
List<Investment> getbyType(String type);
List<Investment> getbyPurpose(String purpose);
List<Investment> getAll();


Investment getById(int planId)throws PlanNotFoundException;
double calculateMaturity(Investment investment);
}
