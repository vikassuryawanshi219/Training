package com.example.action;

public class RegisterAction {

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String execute() {
		//this is the place to call the service layer
		//This is the result name;
		if(username.equals("vikas")) {
			return SUCCESS;
		}
		else 
		return NONE;
		
	}
}
