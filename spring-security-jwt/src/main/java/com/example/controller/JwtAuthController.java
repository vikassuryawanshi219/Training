package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.JwtUser;
import com.example.service.JwtUserServiceImpl;

@RestController
public class JwtAuthController {
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private JwtUserServiceImpl jwtUserServiceImpl;
	
	@PostMapping("/register")
	public void addUser(@RequestBody JwtUser jwtUser) {
		String username=jwtUser.getPassword();
		String password = jwtUser.getPassword();
		//encode password
		String encodedPassword=passwordEncoder.encode(password);
		//create the user object
		JwtUser newuser = new JwtUser(username,encodedPassword);
		//call the add method
	jwtUserServiceImpl.addUser(newuser);
		
	}

}
