package com.bptn.course._06_oop;

class SavingsAccount extends BankAccount {
	
	private double interestRate;

	public SavingsAccount(String accountNumber, double intialBalance, double intrestRate) {
		super(accountNumber, intialBalance);
		this.interestRate = interestRate;
		
	}
		
	
	public void applyInterest() {
		double interest = getBalance() * interestRate/100;
		deposit(interest);
	
	}
	
	

}
