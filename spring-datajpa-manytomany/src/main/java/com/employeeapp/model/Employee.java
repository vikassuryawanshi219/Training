package com.employeeapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee {
	@Id
	@GeneratedValue(generator = "emp_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "emp_gen", sequenceName = "emp_sequence", initialValue = 100, allocationSize = 1)
	private Integer employeeId;
	
	@Column(length = 30)
	private String name;
	
	@Column(length = 30)
	private String city;
	
	@Column(length = 30)
	private String department;
	
	@ManyToMany(cascade= CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(
			name="employee_course",
			joinColumns = @JoinColumn(name="employee_id"),
	        inverseJoinColumns = @JoinColumn(name="course_id"))
	Set<Course> course;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String city, String department) {
		super();
		this.name = name;
		this.city = city;
		this.department = department;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", city=" + city + ", department=" + department
				+ "]";
	}

	

	

}
