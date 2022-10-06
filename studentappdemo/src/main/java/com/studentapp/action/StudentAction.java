package com.studentapp.action;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.studentapp.model.Student;

public class StudentAction extends ActionSupport implements SessionAware {
	/**
	 * @author vikas.suryawanshi
	 */
	private static final long serialVersionUID = 1L;
	private List<String> hobbies;

	private Student student;

	Map<String, Object> appSession;
	
	Logger logger=Logger.getLogger(StudentAction.class);

	@Override
	public void setSession(Map<String, Object> session) {
		// a session ref is initialize.now
		appSession = session;
	}

	public StudentAction() {
		logger.info("initializing the checkbox");
		hobbies = Arrays.asList("sports", "music", "dance");
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String display() {
		logger.info("initializing the display");
		return NONE;
	}

	public String execute() throws Exception {
		Map<String, Object> hashMap = new HashMap<>();
		hashMap.put("message", "happy weekend");
		hashMap.put("fruits", Arrays.asList("draganfruits", "mango"));
		// setting value in session
		appSession.put("message", "have a great day");
		appSession.put("fruits", Arrays.asList("apple", "kiwi", "mango"));

		return SUCCESS;
	}

}
