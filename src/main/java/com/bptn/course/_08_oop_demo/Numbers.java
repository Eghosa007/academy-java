package com.bptn.course._08_oop_demo;

public class Numbers extends Letters {  // subclass, child or 
	
	protected String num1 = "100";    // protected access modifier for an attribute
	
	public void scrable() {                        // Method called scrable that prints "You Won The Game"
	System.out.println("You Won The Game!" );
	
	}
	
	public static void main(String[]args) {                // Main method 
		
		Numbers numbers = new Numbers();                  //Creating an object for the class called number
	
	    numbers.words();                                   //Object numbers calls the method in the other class 
	    numbers.scrable();                                    // Object number calls the method above in same class 
	    System.out.print(numbers.alphabets + " " + numbers.num1); 
	
	
	}
	
	
	}
	

	
	