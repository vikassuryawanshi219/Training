package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	
//  http://localhost:8080/greet
	@GetMapping("/greet")
	public String greet() {

		return "Have a Great day";

	}
	
//	http://localhost:8080/sayHello/priya/city/Bhopal
	@GetMapping("/sayHello/{username}/city/{city}")
	
//	http://localhost:8080/print/priya/bhopal
//	@GetMapping("/print/{username}/{city}")
	public String greet(@PathVariable("username") String name, @PathVariable("city") String mCity) {

	return "Welcome "+name +" from "+mCity;
}
//	http://localhost:8080/show? name=vikas & salary=1000000
	@GetMapping("/show")
	public String show(@RequestParam("name") String name, @RequestParam("salary")int salary) {
        
		return "Welcome "+name +" your salary is "+salary;
}
	
//	http://localhost:8080/showFruits
	@GetMapping("/showFruits")
	public List <String> showFruits() {
      
		return Arrays.asList("apple","mango");
	
	}	
}
