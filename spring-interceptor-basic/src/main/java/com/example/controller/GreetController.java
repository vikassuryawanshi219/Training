package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class GreetController {
	@GetMapping("/greet/{username}")
public String greet(HttpServletRequest request,@PathVariable("username") String username) {
		//get the attruibute data from thr  ijnterceptor
		String message =(String)request.getAttribute("message");
		System.out.println(message);
		//set new data and send it back
		request.setAttribute("newmessage","great job"+ username);
		return "have a great day"+ username;
	
}
//	@GetMapping("/error")
//			public String errorMsg()
//	}
}
