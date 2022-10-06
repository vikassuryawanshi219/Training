package com.studentapp.model;

public class Student {
	private String name;
	private String password;
	private String city;
	private String email;
	private int age;
	private String gender;
	private String hobby;
	private long mobile;
	private String course;
	private double allowance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
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
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", password=" + password + ", city=" + city + ", email=" + email + ", age="
				+ age + ", gender=" + gender + ", hobby=" + hobby + ", mobile=" + mobile + ", course=" + course
				+ ", allowance=" + allowance + "]";
	}
	
}
