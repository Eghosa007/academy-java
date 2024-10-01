package com.bptn.course._06_oop;

public class Department {
	
	private String departmentName;
	private int numberOfEmployees;
	
	public Department(String departmentName, int numberOfEmployees) {
		this.departmentName = departmentName;
		this.numberOfEmployees = numberOfEmployees; 
		
	}

	public void departmentInfo() {
    	System.out.println("Name of Department: " +departmentName);
    	System.out.println("Numbers of Employees: "+numberOfEmployees);
    }
	
}
