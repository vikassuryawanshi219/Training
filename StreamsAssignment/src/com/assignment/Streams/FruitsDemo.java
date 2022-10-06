package com.assignment.Streams;

import java.util.Arrays;
import java.util.Optional;

public class FruitsDemo {
	public static void main(String[] args) {
	Optional<String>fruit=	Arrays.asList("apple","grap","berry","strawberry")
		.stream()
		.filter((str)->str.contains("berry"))
		.findFirst();
	
		if(fruit.isPresent()) {
			String berryFruit= fruit.get();
			System.out.println(berryFruit);
		}
		}

}
