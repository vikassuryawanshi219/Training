package com.training.constr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.app.DbConnection;
import com.training.setter.Employee;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context= new AnnotationConfigApplicationContext("com.training");
		Student stu=(Student) context.getBean("student");
		Course cou=(Course) context.getBean("course");
	    System.out.println(stu);
	    
	    DbConnection dbConnection=context.getBean(DbConnection.class,"dbConnection");
	    System.out.println(dbConnection);
	    
	    ApplicationContext contex=new AnnotationConfigApplicationContext("com.training");
		//get the bean from the IOC container
		Employee emp= (Employee) contex.getBean("employee");
		System.out.println(emp);
	}

}
