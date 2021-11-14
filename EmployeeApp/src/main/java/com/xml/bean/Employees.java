package com.xml.bean;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Employees {
	
	private List<Employee> employee;

	public List<Employee> getEmployees() {
		return employee;
	}

	public void setEmployees(List<Employee> employee) {
		this.employee = employee;
	}
	
	

}
