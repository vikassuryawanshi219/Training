package com.assignment.Streams;

import java.util.Arrays;
import java.util.Optional;

public class StreamDemo {

	public static void main(String[] args) {
		
		Mobile mobile=new Mobile("apple", 100000);
		mobile = new Mobile("nokia", 19999);
		mobile = new Mobile("samsung", 500000);
		Optional<String>mob=Arrays.asList(mobile)
		.stream()
		.filter((str)->str.contains("samsung"))
		.findFirst();

		if(mob.isPresent()){
		//	for (String mob1 : mob.get()) {System.out.println(mob1);
			
//			String berryFruit= mob.get();
//			System.out.println(berryFruit);	
			}
			
			
		}
	}

}
