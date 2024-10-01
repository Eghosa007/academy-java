package com.bptn.course._06_oop;

public class BankSystem {

	public static void main(String[] args) {
		
		BankAccount testAccount = new BankAccount("987654", 1200.00);
		testAccount.displayAccountInfo();
		
		BankAccount newTestAccount = new BankAccount("123466", 699);
        newTestAccount.displayAccountInfo();
        
		SavingsAccount testAccount1 = new SavingsAccount("3884844", 700.00, 1.00);
		testAccount1.applyInterest();
		testAccount1.displayAccountInfo();
		
		
		
	}

}
