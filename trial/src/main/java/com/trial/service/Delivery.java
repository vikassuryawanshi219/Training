package com.trial.service;

import java.util.Arrays;
import java.util.List;

public class Delivery {
	
	public List<String> ShowFood(String type) {
		if (type.equals("itelian")) {
			return Arrays.asList("pasta", "pizza");
		}
		if (type.equals("chiness")) {
			return Arrays.asList("chowmin", "manchurian");
		}
		if (type.equals("indian")) {
			return Arrays.asList(" buttter chicken");
		}
		return null;

	}

	public String greetMessage(String name) {
		// return "great day "+name;
		System.out.println("printing..");
		return null;
	}
}
