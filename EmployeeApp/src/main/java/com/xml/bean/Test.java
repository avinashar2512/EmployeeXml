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
		// Write to the XML file.
		try {
			JAXBContext jContext = JAXBContext.newInstance(Employees.class);
			Marshaller marshallObj = jContext.createMarshaller();
			marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			Employee aviEmployee = new Employee("Avinash", 30, "SSE");
			Employee arunEmployee = new Employee("Arun", 28, "SSE");
			List<Employee> employeeList = new ArrayList<Employee>();
			employeeList.add(arunEmployee);
			employeeList.add(aviEmployee);
			Employees employees = new Employees();
			employees.setEmployees(employeeList);
			marshallObj.marshal(employees, new FileOutputStream("employees.xml"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		// Read from the XML file.
		try {
			File file = new File("employees.xml");
			JAXBContext jContext = JAXBContext.newInstance(Employees.class);
			Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
			Employees employeeList = (Employees) unmarshallerObj.unmarshal(file);
			for (Employee employee : employeeList.getEmployees()) {
				System.out.println(employee.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Add New Employee to XML
		try {
			File file = new File("employees.xml");
			JAXBContext jContext = JAXBContext.newInstance(Employees.class);
			Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
			Employees employeeList = (Employees) unmarshallerObj.unmarshal(file);
			List<Employee> employeeListRead = employeeList.getEmployees();
			Employee bharath = new Employee("Bharath", 26, "SSE");
			employeeListRead.add(bharath);
			employeeList.setEmployees(employeeListRead);
			Marshaller marshallObj = jContext.createMarshaller();
			marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshallObj.marshal(employeeList, new FileOutputStream("employees.xml"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Delete Existing Employee to XML
		// Add New Employee to XML
		try {
			File file = new File("employees.xml");
			JAXBContext jContext = JAXBContext.newInstance(Employees.class);
			Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
			Employees employeeList = (Employees) unmarshallerObj.unmarshal(file);
			List<Employee> employeeListRead = employeeList.getEmployees();
			employeeListRead.remove(1);
			employeeList.setEmployees(employeeListRead);
			Marshaller marshallObj = jContext.createMarshaller();
			marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshallObj.marshal(employeeList, new FileOutputStream("employees.xml"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
