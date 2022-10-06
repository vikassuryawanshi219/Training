package com.vfislk.javabase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@Configuration
public class AppConfi {
	
	@Bean
	public Performer getPerformer() {
		return  new Performer();
		
	}
	
	@Bean
	@Primary
	public Guitor getGuitor() {
		return  new Guitor();
		
	}
	@Bean
	public Violin getViolin() {
		return  new Violin();
		
	}
	@Bean
	public Keyboard getKeyboard() {
		return  new Keyboard();
		
	}
	
}
