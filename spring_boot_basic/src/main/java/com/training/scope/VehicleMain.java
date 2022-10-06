package com.training.scope;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.javabase.Mobile;

public class VehicleMain {
	
	public static void main(String[] args) {
		
	
	ApplicationContext context = new AnnotationConfigApplicationContext("com.training.scope");
	
	//first object referred by vehicle1
	Vehicle vehicle1=context.getBean(Vehicle.class);
	System.out.println("vehicle1 "+vehicle1.getBrand());

	//first object referred by vehicle1
	Vehicle vehicle2=context.getBean(Vehicle.class);
	System.out.println("vehicle2 "+vehicle2.getBrand());
	
	vehicle1.setBrand("Bugati");
	System.out.println("vehicle1 "+vehicle1.getBrand());
	System.out.println("vehicle2 "+vehicle2.getBrand());//due to scope this vehicle2 is not change brand
	}
	}

