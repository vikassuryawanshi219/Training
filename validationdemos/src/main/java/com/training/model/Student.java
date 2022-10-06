package com.training.model;


public class Student {
	private String name;
//	private long phone;
	private int age;
	private String gender;
//	private String hobbies;
	private String courses;
	private double allowance;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public long getPhone() {
//		return phone;
//	}
//	public void setPhone(long phone) {
//		this.phone = phone;
//  }
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", courses=" + courses + ", allowance="
				+ allowance + "]";
	}
	
	
	
}
