package com.training.action;

import com.opensymphony.xwork2.ActionSupport;
import com.training.model.Employee;

public class EmployeeAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String execute() throws Exception {
		//similar to calling service layeer
		if (employee.getName().equals("Vikas")) {

			return SUCCESS;
			}
	else {
		return ERROR;
	}
}

	@Override
	public void validate() {
		if (employee.getName().length()<=0)
			addFieldError("employee.name", "Name is required");
		if(employee.getAge()<20 || employee.getAge()<70)
			addFieldError("employee.age","Age should be between 21 & 70");
		if(employee.getCity().length()<=0)
			addFieldError("employee.city","City is required");
		if(employee.getSalary()<=0)
			addFieldError("employee.salary","salary should be greater than zero");
		if(employee.getEmail().length()<=0)
			addFieldError("employee.email","email is required");
		if(!employee.getEmail().contains("@"))
			addFieldError("employee.email","email is not valid");
	}
	

}
