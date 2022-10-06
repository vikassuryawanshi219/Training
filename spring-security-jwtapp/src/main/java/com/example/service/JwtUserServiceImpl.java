/**
 * 
 */
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
import org.springframework.stereotype.Service;

import com.example.model.JwtUser;
import com.example.repository.JwtUserRepository;

/**
 * @author vikas.suryawanshi
 *
 */
@Service
public class JwtUserServiceImpl implements UserDetailsService {
	@Autowired
	private JwtUserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		JwtUser jwtUser = userRepository.findByUsername(username);
		if(jwtUser==null) {
			throw new UsernameNotFoundException("Invalid name");
		}
		String uname = jwtUser.getUsername();
		String pass = jwtUser.getPassword();
		SimpleGrantedAuthority authority1 = new SimpleGrantedAuthority("USER");
		SimpleGrantedAuthority authority2 = new SimpleGrantedAuthority("ADMIN");
		List<GrantedAuthority> grantedAuthority = Arrays.asList(authority1,authority2);
		UserDetails newuser = new User(uname, pass, grantedAuthority);
		return newuser;
	}
	
	public void addUser(JwtUser user) {
		userRepository.save(user);
	}
}
