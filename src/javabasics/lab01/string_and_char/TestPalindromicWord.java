package javabasics.lab01.string_and_char;

import java.util.Scanner;

public class TestPalindromicWord {
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

    // A function to check if the word is palindromic
    public static boolean isPalindromic(String str) {
        int strLength = str.length();
        for (int forIdx = 0, backIdx = strLength - 1;
             forIdx < backIdx; forIdx++, backIdx--) {
            if (str.charAt(forIdx) != str.charAt(backIdx))
                return false;
        }
        return true;
    }
}
