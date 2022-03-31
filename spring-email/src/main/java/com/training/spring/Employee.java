package com.training.spring;

public class Employee {
	private String employeeName;
	
	public Employee() {
		
	}
	
	
	
	public Employee(String employeeName) {
		super();
		this.employeeName = employeeName;
		System.out.println("Employee paramatarized constructor");
	}



	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
}
