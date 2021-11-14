package com.xml.bean;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class AddressEmployees {
	
	private List<AddressEmployee> employee;

	public List<AddressEmployee> getEmployees() {
		return employee;
	}

	public void setEmployees(List<AddressEmployee> employee) {
		this.employee = employee;
	}
	
	

}
