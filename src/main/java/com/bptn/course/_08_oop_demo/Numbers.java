package com.bptn.course._08_oop_demo;

public class Numbers extends Letters {
	
	protected String num1 = "100";
	
	public void scrable() {
	System.out.println("You Won The Game!" );
	
	}
	
	public static void main(String[]args) {
		
		Numbers numbers = new Numbers();
	
	    numbers.words();
	    numbers.scrable();
	    System.out.print(numbers.alphabets + " " + numbers.num1); 
	
	
	}
	
	
	}
	

	
	