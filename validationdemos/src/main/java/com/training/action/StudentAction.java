package com.training.action;

import com.opensymphony.xwork2.ActionSupport;
import com.training.model.Student;

public class StudentAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String execute() throws Exception {
		if (student.getName().equals("Vikas")) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

//	@Override
//	public void validate()
//
//	{
//		if (student.getName().length() <= 0)
//			addFieldError("stuudent.name", "Name is required");
//		if (student.getAge() < 10 || student.getAge() < 30)
//			addFieldError("student.age", "Age should be between 10 and 30");
//		if (student.getAllowance() <= 100)
//			addFieldError("student.allowance", "allowance should be greater than 100");
//		if (student.getPhone() <= 10)
//			addFieldError("student.phone", "phone is required");
//		if (student.getCourses().length() <= 0)
//			addFieldError("student.course", "course is not valid");
//		if (student.getGender().length() <= 0)
//			addFieldError("student.gender", "course is not valid");
//	}

}
