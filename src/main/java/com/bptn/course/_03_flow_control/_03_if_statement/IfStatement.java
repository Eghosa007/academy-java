package com.bptn.course._03_flow_control._03_if_statement;

import java.util.*;

public class IfStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        
        do {
        	
        
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        System.out.println("Press 5 to square a number");
        System.out.println("Press 6 to find a square root");
        System.out.println("Press 7 to find the reciprocal");
        

        double number = scanner.nextInt();
       
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
       

        if (number == 1){
        System.out.println("The sum of the numbers " + num1 + " and " + num2 + " is = " + (num1 + num2));
        
        } else {
        	if (number == 2) {
        System.out.println("The diffence of the numbers " + num1 + " and " + num2 + " is = " + (num1 - num2));
        
        } else {
        	if (number == 3 ) {
        System.out.println("Dividing " + num1 + " by the quotient " + num2 + " is = " + (num1 / num2) "The remainder is equal: "   );
        
        } else {
            if (number == 4 ) {
            System.out.println("The division of the numbers " + num1 + " and " + num2 + " is = " + (num1 * num2));
            
        } else {
            if (number == 4 ) {
                System.out.println("The division of the numbers " + num1 + " and " + num2 + " is = " + (num1 * num2));
        
       } else {
           if (number == 5 ) {
                    System.out.println("The division of the numbers " + num1 + " and " + num2 + " is = " + (num1 * num2));
       
           } while (number != )
               
        	
        scanner.close();

        }

           
       }
        	
  




