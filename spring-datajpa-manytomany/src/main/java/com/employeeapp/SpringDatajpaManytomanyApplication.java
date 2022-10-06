package com.employeeapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employeeapp.model.Course;
import com.employeeapp.model.Employee;
import com.employeeapp.service.ICourseService;
import com.employeeapp.service.IEmployeeService;

@SpringBootApplication
public class SpringDatajpaManytomanyApplication implements CommandLineRunner {

	public static void main(String[] args)  {
		SpringApplication.run(SpringDatajpaManytomanyApplication.class, args);
	}
	
	IEmployeeService employeeService;
    @Autowired
	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}
    
    ICourseService courseService;
    @Autowired
	public void setCourseService(ICourseService courseService) {
		this.courseService = courseService;
	}
	@Override
	public void run(String... args) throws Exception {
		
//		Employee employee =new Employee("jo","Bangalore","JD");
//		
//		Course jcourse = new Course("java",10,"fullstack");
//		Course scourse = new Course("Angular",10,"fullstack");
//		Course ccourse = new Course("Spring",10,"fullstack");
//		Set<Course> course =new HashSet<>(Arrays.asList(jcourse,scourse,ccourse));
//		employee.setCourse(course);
//		employeeService.addEmployee(employee);
		
		Employee employee =new Employee("Rahul","Bangalore","Digital");
		
		Course jcourse = courseService.getById(1);
		Course scourse = courseService.getById(2);
		
		Set<Course> course =new HashSet<>(Arrays.asList(jcourse,scourse));
		employee.setCourse(course);
		employeeService.addEmployee(employee);
		
		
	}

}













