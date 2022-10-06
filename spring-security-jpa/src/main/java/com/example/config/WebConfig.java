package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebConfig extends WebSecurityConfigurerAdapter{
//this is in memory authentication
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("jo")
		.password(passwordEncoder().encode("jo123"))
		.roles("USER")
		.and()
		.withUser("admin")
		.password(passwordEncoder().encode("admin123"))
		.roles("ADMIN","USER");
		
	}
	//Create a bean of password encoder
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
     // authorization
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	http.csrf().disable()
	     .authorizeRequests()
	     .antMatchers("/").permitAll()
	     .antMatchers("/admin/**").hasRole("ADMIN")
	     .antMatchers("/products/**").hasAnyRole("ADMIN","USER")
	     .and()
	     .formLogin();
	}
	

}
