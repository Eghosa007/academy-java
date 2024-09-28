package com.bptn.course._05_strings;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set the target number to 23 as per the requirement
        int targetNumber = 23;
        int guess = 0;
        Scanner scanner = new Scanner(System.in);

        
        while (true) {
            System.out.print("Enter your guess (between 1 and 100): ");
            guess = scanner.nextInt();

            // show the target number in the output
            System.out.println("targetNumber: " + targetNumber);
            System.out.println("guess: " + guess);

            // Ensure guess is between 1 and 100
            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } 
            // if the guess is too low
            else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } 
            // if the guess is too high
            else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } 
            // If the guess is correct end the loop
            else {
                System.out.println("Congratulations! You guessed the number correctly!");
                break;
            }
        }
        
        // Close the scanner object this avoids memory leaks
        scanner.close();
    }
}


/* Explain what you did and why you did it
what about this task was new? The use of while loop and the use of comparison operators
What are some issues you ran into along the way? Trying to get the correct out was abit challenging
The "print" was printing an output that didnt match with the requested output.
From this lesson, what will you make sure you remember in future? I will make sure to use the operators correctly. 

*/
