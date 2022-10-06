package com.employeeapp.service;

import java.util.List;

import com.employeeapp.model.Course;

public interface ICourseService {
	void addCourse (Course course);
	void updateCourse (Course course);
    void deleteCourse (int courseId);
    
    List<Course> getAll();
    
    Course getById (int courseId);
    //derives qurie
    List<Course> getByCategory(String category);
    
    //custom qurie
    List<Course> getByEmployee(String name);
    List<Course> getByCity(String city);
    
}
