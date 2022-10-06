package com.example.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.model.JwtUser;
import com.example.repository.JwtUserRepository;

public class JwtUserServiceImpl implements  UserDetailsService{
	@Autowired
    private JwtUserRepository jwtUserRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//get the user from repository
		JwtUser user= jwtUserRepository.findByUsername(username);
		//assign roles
		List<GrantedAuthority> authorities=Arrays.asList(new SimpleGrantedAuthority("ADMIN"),new SimpleGrantedAuthority("USER"));
		
		//create the inbuild user object thet implements UserDetails with roles
		UserDetails userDetails= new User(user.getPassword(),user.getPassword(), authorities);
		return userDetails;
	}
	
	public void addUser(JwtUser user) {
		
		System.out.println("user is"+user);
		jwtUserRepository.save(user);
		
	}

}
