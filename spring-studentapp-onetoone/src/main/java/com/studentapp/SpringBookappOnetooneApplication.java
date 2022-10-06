package com.studentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentapp.model.Address;
import com.studentapp.model.Student;
import com.studentapp.service.IStudentService;

@SpringBootApplication
public class SpringBookappOnetooneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappOnetooneApplication.class, args);
	}
	
	@Autowired
	IStudentService studentService;

	@Override
	public void run(String... args) throws Exception {
		
		
		Address address=new Address("Bangalore","Kar");
		Student student= new Student("Vikas", "Science",address);
		
		Address address1=new Address("Bhopal","mp");
		Student student1= new Student("Ram", "Maths",address1);
		
//		studentService.addStudent(student);
//		studentService.addStudent(student1);
		
	// use of Derived Queries	
//		studentService.getByCity("Bangalore").forEach(System.out::println);
//		studentService.getByDepartment("Science").forEach(System.out::println);
//		studentService.getByCityAndDeprtment("Bangalore", "Science").forEach(System.out::println);
//	
	//Custom Queries
		studentService.getByCity("Bangalore").forEach(System.out::println);
		studentService.getByDepartment("Science").forEach(System.out::println);
		studentService.getByCityAndDeprtment("Bangalore", "Science").forEach(System.out::println);
	    studentService.getByCityAndState("Bhopal", "mp").forEach(System.out::println);
		 
		
	}
	
	

}
