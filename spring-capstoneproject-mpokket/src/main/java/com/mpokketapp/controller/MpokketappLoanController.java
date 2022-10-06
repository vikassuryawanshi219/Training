package com.mpokketapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mpokketapp.model.Loan;
import com.mpokketapp.model.LoanType;
import com.mpokketapp.model.UserType;
import com.mpokketapp.service.ILoanService;
@CrossOrigin("http://localhost:4200")
@RestController
public class MpokketappLoanController {
	@Autowired
	ILoanService loanService;
	
	@PutMapping("/loan")
	public ResponseEntity<String>updateLoan(@RequestBody Loan loan ) {
		loanService.updateLoan(loan);
		return ResponseEntity.accepted().body("Updated");
		
	}


	@DeleteMapping("/loan/loanId/{laonId}")
	public ResponseEntity<Void>deleteLoan(@PathVariable ("loanId") int loanId ){
		loanService.deleteLoan(loanId);
		return ResponseEntity.status(HttpStatus.OK).build();
		
	}
	@GetMapping("/loans")
	public ResponseEntity< List<Loan>> getAllLoans() {
		///response body
		List<Loan>loans=loanService.getAll();
		HttpHeaders headers=new  HttpHeaders();
		//response header
		headers.add("desc","All loan");
		headers.add("info","Geeting loan from db");
		ResponseEntity< List<Loan>> responseEntity=
				new ResponseEntity<>(loans,headers,HttpStatus.OK);
		return responseEntity;
	}

    @GetMapping("/loans/userType/{userType}")
	  public ResponseEntity< List<Loan>> getByType(@RequestParam("userType") UserType userType) {
		List<Loan>loans=loanService.getLoanByUserType(userType);
		return ResponseEntity.ok().body(loans);
   }
    
    @GetMapping("/loans/loanType/{loanType}")
	  public ResponseEntity< List<Loan>> getByloanType(@RequestParam("loanType") LoanType loanType) {
		List<Loan>loans=loanService.getLoanByLoanType(loanType);
		return ResponseEntity.ok().body(loans);
 }
    
    @GetMapping("/loans/loanId/{id}")
	public ResponseEntity<Loan> getloanById(@PathVariable("id") int loanId) {
		Loan loans=loanService.getLoanById(loanId);
	     HttpHeaders header=new  HttpHeaders();
	     header.add("desc"," loans details by Id");
		
	    return ResponseEntity.status(HttpStatus.OK).headers(header).body(loans);
		
	}
    
    @GetMapping("/loans/emi/{emi}")
	public ResponseEntity<List<Loan>> getLoanEmi(@PathVariable("emi") double emi) {
    	List<Loan>loans=loanService.getLoanByEmi(emi);
	     HttpHeaders header=new  HttpHeaders();
	     header.add("desc"," loans details by emi");
		
	    return ResponseEntity.status(HttpStatus.OK).headers(header).body(loans);
		
	}
    
    @GetMapping("/loans/principalAmount/{principalAmount}")
   	public ResponseEntity<List<Loan>> getLoanByPrincipleAmount(@PathVariable("principalAmount") double principalAmount) {
       	List<Loan>loans=loanService.getLoanByPrincipleAmount(principalAmount);
   	     HttpHeaders header=new  HttpHeaders();
   	     header.add("desc"," loans details by emi");
   		
   	    return ResponseEntity.status(HttpStatus.OK).headers(header).body(loans);
   		
   	}
    
  //  @GetMapping("/investments/purpose/{purpose}")
//	public ResponseEntity< List<Investment>> getByPurpose(@PathVariable("purpose") String purpose) {
//		List<Investment>investments=investmentService.getbyPurpose(purpose);
//		HttpHeaders headers=new  HttpHeaders();
//		headers.add("desc","All investmentby purpose");
//		headers.add("info","Investments Rest API by purpose");
//		return ResponseEntity.status(HttpStatus.OK).headers(headers).body(investments);
//		
//		
//	}
    
    
    
    
    
    
    
    
    
    

}
