package com.xml.bean;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Test {
	public static void main(String[] args) {
		try {
			JAXBContext jContext = JAXBContext.newInstance(AddressEmployees.class);
			Marshaller marshallObj = jContext.createMarshaller();
			marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			AddressEmployee aviEmployee = new AddressEmployee(1, "s1", "t1", "c1", "Avinash", 30, "SSE");
			AddressEmployee arunEmployee = new AddressEmployee(1, "s12", "t12", "c12", "Arun", 28, "SSE");
			List<AddressEmployee> employeeList = new ArrayList<AddressEmployee>();
			employeeList.add(arunEmployee);
			employeeList.add(aviEmployee);
			AddressEmployees employees = new AddressEmployees();
			employees.setEmployees(employeeList);
			marshallObj.marshal(employees, new FileOutputStream("employees.xml"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			File file = new File("employees.xml");
			JAXBContext jContext1 = JAXBContext.newInstance(AddressEmployees.class);
			Unmarshaller unmarshallerObj = jContext1.createUnmarshaller();
			AddressEmployees employeesList = (AddressEmployees) unmarshallerObj.unmarshal(file);
			for (Object employee : employeesList.getEmployees()) {
				AddressEmployee e = (AddressEmployee) employee;
				System.out.println(e.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
