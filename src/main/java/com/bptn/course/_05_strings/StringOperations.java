package com.bptn.course._05_strings;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n/...String Menu.../");
            System.out.println("Press 1 for Palindrome Check");
            System.out.println("Press 2 to Reverse a String");
            System.out.println("Press 3 to Concatenate Two Strings");
            System.out.println("Press 4 for String Comparison");
            System.out.println("Press 5 to Calculate the Length of String");
            System.out.print("Enter the option: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    // Check Palindrome 
                    System.out.print("Enter a string: ");
                    String palindromeStr = sc.nextLine();
                    checkPalindrome(palindromeStr);
                    break;

                case 2:
                    // Reverse a String
                    System.out.print("Enter a string: ");
                    String reverseStr = sc.nextLine();
                    reverseString(reverseStr);
                    break;

                case 3:
                    // Concatenate Two Strings
                    System.out.print("Enter First string: ");
                    String firstString = sc.nextLine();
                    System.out.print("Enter Second string: ");
                    String secondString = sc.nextLine();
                    concatenateStrings(firstString, secondString);
                    break;

                case 4:
                    // String Comparison
                    System.out.print("Enter First string: ");
                    String compareStr1 = sc.nextLine();
                    System.out.print("Enter Second string: ");
                    String compareStr2 = sc.nextLine();
                    compareStrings(compareStr1, compareStr2);
                    break;

                case 5:
                    // Calculate the Length of String
                    System.out.print("Enter a string: ");
                    String lengthStr = sc.nextLine();
                    calculateLength(lengthStr);
                    break;


                default:
                    System.out.println("Invalid choice! Please make a valid choice.");
            }
        } while (choice != 6);

        sc.close();
    }

    // Method to check if a string is a palindrome
    public static void checkPalindrome(String str) {
        String reverseStr = new StringBuilder(str).reverse().toString();
        if (str.equals(reverseStr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    // Method to reverse a string
    public static void reverseString(String str) {
        String reverseStr = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reverseStr);
    }

    // Method to concatenate two strings
    public static void concatenateStrings(String str1, String str2) {
        System.out.println("Concatenated string: " + str1 + str2);
    }

    // Method to compare two strings
    public static void compareStrings(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("The entered strings are equal.");
        } else {
            System.out.println("The entered strings are not equal.");
        }
    }

    // Method to calculate the length of a string
    public static void calculateLength(String str) {
        System.out.println("The length of the entered string is: " + str.length());
    }

}

