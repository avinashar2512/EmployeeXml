package com.xml.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AddressEmployee extends Employee {

	public int doorNo;
	public String street;
	public String town;
	public String state;

	
	public AddressEmployee() {
	}
	public AddressEmployee(int doorNo, String street, String town, String state,String name, int age, String designation) {
		super(name, age, designation);
		this.doorNo = doorNo;
		this.street = street;
		this.town = town;
		this.state=state;
	}

	
	

	public AddressEmployee(int doorNo, String street, String town, String state) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.town = town;
		this.state = state;
	}
	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	@Override
	public String toString() {
		return "AddressEmployee [doorNo=" + doorNo + ", street=" + street + ", town=" + town + ", state=" + state
				+ ", toString()=" + super.toString() + "]";
	}
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	

}
