package com.xml.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	private String name;
	private int age;
	private String designation;
	public Employee() {
		
	}
	
	public Employee(String name, int age, String designation) {
		super();
		this.name = name;
		this.age = age;
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", designation=" + designation + "]";
	}
	
	

}
