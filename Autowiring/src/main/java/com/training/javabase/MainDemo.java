package com.training.javabase;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemo {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.training.javabase");
		Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
		Mobile mobile=context.getBean(Mobile.class);
		System.out.println(mobile);

	}

}
