package com.bptn.course._06_oop;

class BankAccount {
	
	
    // Data Members / Properties
	private String accountNumber;
	private double balance;
	
	//Constructor
	public BankAccount(String accountNumber, double intialBalance) {
		this.accountNumber = accountNumber;
		this.balance = intialBalance;
		
	}
	
	//Instance Method / Behaviour of the class
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			
		}
		
	}
    public void withdraw(double amount) {
    	if(amount>0 && amount<=balance) {
    		
    		balance -= amount;
    		
    	}
    	
    }
    		
   //Getters and Setters
    public double getBalance() {
    	return balance;
    	
    }
   
   
    public void displayAccountInfo() {
    	System.out.println("Account Number: " +accountNumber);
    	System.out.println("Current Balance: "+balance);
    }
    	
    }
	
	
	
  
