package com.bptn.course._06_oop;

class TechDepartment extends Department {
		
		private double totalAmtPurchased;

			public TechDepartment(String departmentName, int numberOfEmployees, double totalAmtPurchased) {
				super(departmentName, numberOfEmployees);
				this.totalAmtPurchased = totalAmtPurchased;
	
	
			}

}
