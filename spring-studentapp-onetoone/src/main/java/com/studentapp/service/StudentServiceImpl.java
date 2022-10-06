package com.studentapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapp.model.Student;
import com.studentapp.repository.IStudentRepository;

@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	IStudentRepository studentRepository;

	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);

	}

	@Override
	public void updateStudent(Student student) {
		studentRepository.save(student);

	}

	@Override
	public void deleteStudent(int studentId) {
		studentRepository.deleteById(studentId);
	}

	@Override
	public Student getById(int studentId) {
		
		Optional<Student> studentOpt= studentRepository.findById(studentId);
		if(studentOpt.isPresent()) {
			return studentOpt.get();
		}
		return null;
	}

	@Override
	public List<Student> getAll() {
		
		return null;
	}

	@Override
	public List<Student> getByDepartment(String department) {
		
//		return studentRepository.findByDepartment(department);
		
		return studentRepository.findStudsByDept(department);
	}

	@Override
	public List<Student> getByCity(String city) {
		
//		return studentRepository.getByAddressCity(city);
		
		return studentRepository.findStudsByCity(city);
	}

	@Override
	public List<Student> getByCityAndDeprtment(String city, String department) {
		
//		return studentRepository.findByAddressCityAndDepartment(city, department);
		return studentRepository.findByCityDept(city, department);
	}

	@Override
	public List<Student> getByState(String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getByCityAndState(String city, String state) {
		// TODO Auto-generated method stub
		return studentRepository.findByCityState(city, state);
	}

}
