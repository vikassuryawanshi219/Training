package com.training.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@PropertySource("classpath:application.properties")
@Component
public class Employee {
	
	private String name;
    private double salary;
    private int employeeId;
    
    private Address address;
    
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	@Value("${employee.employeename}")
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	@Value("${employee.salary}")
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	@Value("${employee.employeeid}")
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", employeeId=" + employeeId + ", address=" + address
				+ "]";
	}
    
    
}