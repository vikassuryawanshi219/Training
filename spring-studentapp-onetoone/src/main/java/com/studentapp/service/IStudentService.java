package com.studentapp.service;

import java.util.List;

import com.studentapp.model.Student;

public interface IStudentService {
	
	void addStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(int studentId);
	
	Student getById(int studentId);
	
	List<Student> getAll();
	
	List<Student> getByDepartment(String department);
	List<Student> getByCity(String city);
	List<Student> getByCityAndDeprtment (String city,String department);
	List<Student> getByState(String state);
	List<Student> getByCityAndState(String city,String state);
}
