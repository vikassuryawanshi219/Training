package com.training.setter;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		//create the IOC container
		ApplicationContext contex=new AnnotationConfigApplicationContext("com.training");
		//get the bean from the IOC container
		Employee emp= (Employee) contex.getBean("employee");
		System.out.println(emp);
	
//		Employee emp1=  contex.getBean(Employee.class,"employee");
//		System.out.println(emp1);
//		
//		Employee emp2=  contex.getBean(Employee.class);
//		System.out.println(emp2);
		
		String[] beans= contex.getBeanDefinitionNames();
		for (String bean:beans){
			System.out.println(bean);
		}
		System.out.println("Another way");
		Stream.of(contex.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
