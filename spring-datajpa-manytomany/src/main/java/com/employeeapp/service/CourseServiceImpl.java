package com.employeeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeapp.model.Course;
import com.employeeapp.repository.ICourseRepository;
@Service
public class CourseServiceImpl implements ICourseService {
	@Autowired
	ICourseRepository courseRepository;
	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
        courseRepository.save(course);
	}

	@Override
	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		courseRepository.save(course);
	}

	@Override
	public void deleteCourse(int courseId) {
		// TODO Auto-generated method stub
		courseRepository.deleteById(courseId);
	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	public Course getById(int courseId) {
		
		return courseRepository.findById(courseId).get();
	}
//derives
	@Override
	public List<Course> getByCategory(String category) {
		// TODO Auto-generated method stub
		return courseRepository.findByCategory(category);
	}
//custom
	@Override
	public List<Course> getByEmployee(String name) {
		// TODO Auto-generated method stub
		return courseRepository.findByEmployee(name);
	}
//custom
	@Override
	public List<Course> getByCity(String city) {
		// TODO Auto-generated method stub
		return courseRepository.findByCity(city);
	}

}
