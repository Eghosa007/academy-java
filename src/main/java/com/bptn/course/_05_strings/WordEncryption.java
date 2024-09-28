package com.bptn.course._05_strings;

import java.util.Scanner;

public class WordEncryption {
	    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	        
	        // input word from the user
	        System.out.print("Enter a word: ");
	        String word = scanner.nextLine();
	        
	        // method to encrypt the word
	        String encryptedWord = encryptWord(word);
	        
	        // showing the encrypted word
	        System.out.println("Encrypted word: " + encryptedWord);
	        
	        scanner.close();
	    }

	    // Method to encrypt the word by shifting letters by one position
	    public static String encryptWord(String word) {
	        StringBuilder encrypted = new StringBuilder();
	        
	        // Loop through each character of the word
	        for (int i = 0; i < word.length(); i++) {
	            char character = word.charAt(i);
	            
	            // Check if the character is a lowercase letter
	            if (character >= 'a' && character <= 'z') {
	                // Shift the letter by one, wrapping from 'z' to 'a'
	                if (character == 'z') {
	                    encrypted.append('a');
	                } else {
	                    encrypted.append((char)(character + 1));
	                }
	            } 
	            // Check if the character is an uppercase letter
	            else if (character >= 'A' && character <= 'Z') {
	                // Shift the letter by one, wrapping from 'Z' to 'A'
	                if (character == 'Z') {
	                    encrypted.append('A');
	                } else {
	                    encrypted.append((char)(character + 1));
	                }
	            } 
	            // If the character is not a letter, leave it unchanged
	            else {
	                encrypted.append(character);
	            }
	        }
	        
	        // Return the encrypted string
	        return encrypted.toString();
	    }
	}

	/*  what about this task was new? The use of "encryptWord" method that shifts each letter in a word by one position in the alphabet
	What are some issues you ran into along the way? It was difficult construct the flow of the program and I also had some syntax error.
	From this lesson, what will you make sure you remember in future? I will remember to use the 'String encryptedWord = encryptWord(word);'
	*/

