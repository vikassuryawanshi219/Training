package com.training.javabase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration //ha all the bean defination 
public class AppConfig {
	@Bean
	@Primary
	public Mobile getMobile() {
		Mobile mobile=new Mobile();
		mobile.setBrand("Apple");
		mobile.setModel("14 pro max");
		mobile.setFeatures(getFeatures());
		return mobile;
	}
	@Bean
	public Features getFeatures() {
		Features features=new Features();
		features.setOs("IOS");
		return features;
		
		
	}

}
