package com.training.constr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	private Course course;
	private String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public Student(Course course) {
		super();
		this.course = course;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public String getName() {
		return name;
	}@Value("vikas")
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [course=" + course + ", name=" + name + "]";
	}
	

	

}
