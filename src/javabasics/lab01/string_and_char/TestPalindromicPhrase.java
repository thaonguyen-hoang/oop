package javabasics.lab01.string_and_char;

import java.util.Scanner;

public class TestPalindromicPhrase {
    public static void main(String[] args) {
        // Define variables
        String inStr;

        // Prompt and read input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        inStr = scan.nextLine();
        String lowerStr = inStr.toLowerCase();

        // Print result
        if (isPalindromic(lowerStr)) {
            System.out.println(inStr + " is a palindrome");
        } else {
            System.out.println(inStr + " is not a palindrome");
        }
    }

    // A function to check if the phrase is palindromic
    public static boolean isPalindromic(String str) {
        int strLength = str.length();
        int forIdx = 0, backIdx = strLength - 1;
        while (forIdx < backIdx) {
            if (!Character.isLetter(str.charAt(forIdx))) {
                forIdx++;
            } else if (!Character.isLetter(str.charAt(backIdx))) {
                backIdx--;
            } else if (str.charAt(forIdx) == str.charAt(backIdx)) {
                forIdx++; backIdx--;
            } else {
                return false;
            }
        }
        return true;
    }
}
