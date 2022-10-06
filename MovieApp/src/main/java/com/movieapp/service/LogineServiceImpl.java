package com.movieapp.service;

import java.util.stream.Stream;

public class LogineServiceImpl implements ILoginService {
	
	@Override
	public boolean validateUsername(String username,String password) {
		String[] usernames= {"john","jonny","ram"};
		
		
//		for(String name:usernames) {
//			if(name.equals(username)) {
//				return true;
//			}
//		}
//		
//		return false;
		
		return Stream.of(usernames)
				.filter(str->str.equals(username)&& password.equals("admin123"))
				.findAny()
				.isPresent();	
	}
}
