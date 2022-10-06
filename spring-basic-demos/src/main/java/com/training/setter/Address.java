package com.training.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Address {
	
	private int houseNumber;
	private String city;
	private String state;
	public int getHouseNumber() {
		return houseNumber;
	}@Value("100")
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getCity() {
		return city;
	}@Value("bhopal")
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}@Value("MP")
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", city=" + city + ", state=" + state + "]";
	}

}
