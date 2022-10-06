package com.studentapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.studentapp.model.Student;
@Controller
public class StudentController {
	
//@RequestMapping("/show")
//public String printStudent(
//	@RequestParam("studentName") String name,
//	@RequestParam("city") String city,
//	@RequestParam("studentId") int studentId,
//	Model model
//	) {
//	
////sEt the values
//	Student student= new Student();
//	student.setStudentName(name);
//	student.setCity(city);
//	student.setStudentId(studentId);
//	
//	
//	
//	model.addAttribute("mystudent",student);
	
	@RequestMapping(value="/show", method = RequestMethod.POST)
	public String printStudent(Student student ,BindingResult result) {
	if(result.hasErrors()) {
		System.out.println(result.getErrorCount());
		System.out.println(result.getAllErrors());
		return "addform";
	}
	return "success";
	
	}
}
