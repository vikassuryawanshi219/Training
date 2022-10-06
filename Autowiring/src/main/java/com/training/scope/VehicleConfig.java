package com.training.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
//@Configuration
//@PropertySource("classpath:application.properties")
public class VehicleConfig {
    @Bean
	public Vehicle vehicle() {
		
		return new Vehicle();
		
	}
}
