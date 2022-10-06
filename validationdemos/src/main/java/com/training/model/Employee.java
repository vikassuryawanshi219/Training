package com.training.model;

public class Employee {
private String name;
private String city;
private String email;
private double salary;
private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", city=" + city + ", email=" + email + ", salary=" + salary + ", age=" + age
			+ "]";
}
	


}
