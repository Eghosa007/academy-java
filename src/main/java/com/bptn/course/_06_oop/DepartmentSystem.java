package com.bptn.course._06_oop;

public class DepartmentSystem {

	public static void main(String[] args) {
		
		SaleDepartment hrDepartment = new SaleDepartment("hrDepartment", 12, 2000.00);
		hrDepartment.departmentInfo();
		
		
		SaleDepartment techDepartment = new SaleDepartment("techDepartment", 10, 3000.00);
		techDepartment.departmentInfo();
		
		

	}

}
