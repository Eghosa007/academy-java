package com.bptn.course._05_strings;

import java.util.Scanner;

public class PluralForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Get input: number and singular noun
        System.out.print("Enter the number (non-negative integer): ");
        int amt = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline
        System.out.print("Enter the singular noun: ");
        String word = scanner.nextLine();

        // Show the result with proper pluralization
        System.out.println(amt + " " + pluralize(word, amt));

        scanner.close();
    }

    // Method to pluralize a noun based on the count
    public static String pluralize(String word, int amt) {
        // If the amount is 1, return the singular word
        if (amt == 1) {
            return word;
        }

        // Handle irregular plural forms (e.g., hippopotamus -> hippopotami)
        if (isIrregular(word)) {
            return getIrregularPlural(word);
        }

        // Check if the word already appears plural
        if (isAlreadyPlural(word)) {
            return word; // Return it as it is
        }

        // Handle special cases for words ending in 'y' but not preceded by vowels
        if (word.endsWith("y") && !word.endsWith("ay") && !word.endsWith("ey") 
                && !word.endsWith("oy") && !word.endsWith("uy")) {
            return word.substring(0, word.length() - 1) + "ies";
        }

        // Handle special case for words ending in "f" or "fe" (e.g., knife → knives)
        if (word.endsWith("f")) {
            return word.substring(0, word.length() - 1) + "ves";
        }
        if (word.endsWith("fe")) {
            return word.substring(0, word.length() - 2) + "ves";
        }

        // Handle regular plural form for words ending in "s", "x", "z", "ch", or "sh"
        if (word.endsWith("s") || word.endsWith("x") || word.endsWith("z") 
                || word.endsWith("ch") || word.endsWith("sh")) {
            return word + "es";
        }

        // Default: Add "s" for regular plurals
        return word + "s";
    }

    // Method to check if a word is irregular
    public static boolean isIrregular(String word) {
        // Check for known irregular nouns
        return word.equalsIgnoreCase("hippopotamus") || word.equalsIgnoreCase("cactus")
                || word.equalsIgnoreCase("alumnus") || word.equalsIgnoreCase("focus")
                || word.equalsIgnoreCase("fungus");
    }

    // Method to get the plural form for irregular nouns
    public static String getIrregularPlural(String word) {
        switch (word.toLowerCase()) {
            case "hippopotamus":
                return "hippopotami";
            case "cactus":
                return "cacti";
            case "alumnus":
                return "alumni";
            case "focus":
                return "foci";
            case "fungus":
                return "fungi";
            default:
                return word; // fallback, though it shouldn't reach here
        }
    }

    // This method checks if the word is already plural
    public static boolean isAlreadyPlural(String word) {
        // Generic rule: if a word ends with "s", "es", or "ies", consider it plural
        if (word.endsWith("s")) {
            // Ensure the special case for words that end with "ss" or "us" and aren't plural
            if (word.endsWith("ss") || word.endsWith("us")) {
                return false;
            }
            // Words ending in "ies" (plural for "y" ending nouns)
            if (word.endsWith("ies")) {
                return true;
            }
            // Words ending in "es" (plural for "ch", "sh", "x", etc.)
            if (word.endsWith("es")) {
                return true;
            }
            // Any other word ending in "s" is considered plural
            return true;
        }
        // No rule matches, assume the word is singular
        return false;
    }
}

/*
what about this task was new? The use of the "or" operatoor "\\" severally, also, the use of !word.endsWith
What are some issues you ran into along the way? I add extra number of curly braces and it was giving me some issues
what will you make sure you remember in future? How to use && and // 
*/