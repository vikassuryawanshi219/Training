package com.mpokketapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mpokketapp.model.Loan;
import com.mpokketapp.model.LoanType;
import com.mpokketapp.model.User;
import com.mpokketapp.model.UserType;
import com.mpokketapp.service.ILoanService;
import com.mpokketapp.service.IUserService;
@CrossOrigin("http://localhost:4200")
@RestController
public class MpokketappUserController {

	@Autowired
	IUserService userService;
	


	@PostMapping("/users")
	public ResponseEntity<Void>addUser(@RequestBody @Valid User user) {
		userService.addUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
	}

	@PutMapping("/users")
	public ResponseEntity<String>updateUser(@RequestBody User user) {
		userService.updateByUser(user);
		return ResponseEntity.accepted().body("Updated");
		
	}


	@DeleteMapping("/users/userId/{userId}")
	public ResponseEntity<Void>deleteUser(@PathVariable ("userId")int userId ){
		userService.deleteUser(userId);
		return ResponseEntity.status(HttpStatus.OK).build();
		
	}
	
	

	
	
	@GetMapping("/users")
	public ResponseEntity< List<User>> getAll() {
		///response body
		List<User>users=userService.getAll();
		HttpHeaders headers=new  HttpHeaders();
		//response header
		headers.add("desc","All user");
		headers.add("info","Geeting user from db");
		ResponseEntity< List<User>> responseEntity=
				new ResponseEntity<>(users,headers,HttpStatus.OK);
		return responseEntity;
	}
	
//
//	@GetMapping("/investments/risk/{risk}/type/{type}")
//	public ResponseEntity< List<Investment>> getByRiskAndTerm(@PathVariable("risk") String risk, @PathVariable("term") int term) {
//		List<Investment>investments=investmentService.getbyRiskAndTerm(risk, term);
//		HttpHeaders headers=new  HttpHeaders();
//		headers.add("desc","All investmentby risk and Term");
//		headers.add("info","Investments Rest API by term and Risk");
//		return ResponseEntity.status(HttpStatus.OK).headers(headers).body(investments);
//		
//		}
//
     @GetMapping("/users/loanType/{loanType}")
	  public  List<User> getUserByLoanType(@PathVariable("loanType") LoanType loanType) {
//		List<User>users=userService.getUserByLoanType(loanType);
//		HttpHeaders headers=new  HttpHeaders();
//		headers.add("desc","All users by loantype");
//		headers.add("info","user Rest API by loantype");
		return userService.getUserByLoanType(loanType);
     }

    
 		
 		
     @GetMapping("/users/userType/{userType}")
	  public List<User> getUserByUserType(@PathVariable("userType") UserType userType) {
//		List<User>users=userService.getUserByUserType(userType);
//		HttpHeaders headers=new  HttpHeaders();
//		headers.add("desc","All users by usertype");
//		headers.add("info","user Rest API by usertype");
//		return ResponseEntity.status(HttpStatus.OK).headers(headers).body(users);
    	return userService.getUserByUserType(userType);
    }
//	@GetMapping("/investments/purpose/{purpose}")
//	public ResponseEntity< List<Investment>> getByPurpose(@PathVariable("purpose") String purpose) {
//		List<Investment>investments=investmentService.getbyPurpose(purpose);
//		HttpHeaders headers=new  HttpHeaders();
//		headers.add("desc","All investmentby purpose");
//		headers.add("info","Investments Rest API by purpose");
//		return ResponseEntity.status(HttpStatus.OK).headers(headers).body(investments);
//		
//		
//	}
//
	@GetMapping("/users/userId/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") int userId) {
		User users=userService.getUserById(userId);
		HttpHeaders headers=new  HttpHeaders();
		headers.add("desc"," user details by Id");
		
		return ResponseEntity.status(HttpStatus.OK).headers(headers).body(users);
		
	}

	
	
	
//	@GetMapping("/investments/planId/{id}/amount/{amount}")
//	public ResponseEntity<Void> updateInvestment(@PathVariable("id") int planId,@PathVariable("amount")double amount) {
//		investmentService.updateInvestmentAmount(planId,amount);
//		
//		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
//		
//	}
//	
}
