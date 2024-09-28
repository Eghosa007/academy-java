package com.bptn.course._03_flow_control._03_if_statement;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display calculator menu
            System.out.println("\n/…Calculator Menu…/");
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for division");
            System.out.println("Press 5 to square a number");
            System.out.println("Press 6 to find a square root");
            System.out.println("Press 7 to find the reciprocal");

            // Read user choice
            choice = scanner.nextInt();

            if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                // Input two numbers if operation requires two operands
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                // Perform operations
                if (choice == 1) {
                    System.out.println("The sum of the numbers " + num1 + " and " + num2 + " is = " + (num1 + num2));
                } else if (choice == 2) {
                    System.out.println("The difference of the numbers " + num1 + " and " + num2 + " is = " + (num1 - num2));
                } else if (choice == 3) {
                    System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + (num1 * num2));
                } else if (choice == 4) {
                    // Handle division and division by zero case
                    if (num2 != 0) {
                        System.out.println("Dividing " + num1 + " by " + num2 + " the quotient is " + (num1 / num2));
                        System.out.println("The remainder is " + (num1 % num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }
            } else if (choice == 5) {
                // Input for square
                System.out.print("Enter the number to find the square: ");
                double num = scanner.nextDouble();
                System.out.println("The square of the number " + num + " is = " + (num * num));
            } else if (choice == 6) {
                // Input for square root
                System.out.print("Enter the number to find the square root: ");
                double num = scanner.nextDouble();
                if (num >= 0) {
                    System.out.println("The square root of the number " + num + " is = " + Math.sqrt(num));
                } else {
                    System.out.println("Error: Cannot find the square root of a negative number.");
                }
            } else if (choice == 7) {
                // Input for reciprocal
                System.out.print("Enter the number to find the reciprocal: ");
                double num = scanner.nextDouble();
                if (num != 0) {
                    System.out.println("The reciprocal of the number " + num + " is = " + (1 / num));
                } else {
                    System.out.println("Error: Reciprocal of zero is undefined.");
                }
            } else {
                // Invalid choice handling (including if the user enters 0)
                System.out.println("Invalid choice! Please make a valid choice.");
            }

            // Ask if the user wants to continue
            System.out.println("To continue calculation Press 1, else press any other number to exit");
            choice = scanner.nextInt();

        } while (choice == 1);

        scanner.close();
        System.out.println("Calculator exited.");
    }
}