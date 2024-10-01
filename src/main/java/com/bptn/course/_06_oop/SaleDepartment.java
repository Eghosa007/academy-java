package com.bptn.course._06_oop;

class SaleDepartment extends Department{

	
	private double totalSalesAmt;
	
	public SaleDepartment(String departmentName, int numberOfEmployees, double totalSalesAmt) {
		super(departmentName, numberOfEmployees);
		this.totalSalesAmt = totalSalesAmt;

}

}