package javabasics.lab01.string_and_char;

import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        // Prompt and read input as String
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        // Convert string to lowercase to reduce the number of cases
        String str = scan.nextLine().toLowerCase();
        scan.close();

        // Compute number of vowels and digits
        int vowels = countVowels(str);
        int digits = countDigits(str);

        // Print out the percentages
        System.out.printf("Number of vowels: %d (%.2f%%)\n", vowels, getPercentage(vowels, str.length()));
        System.out.printf("Number of digits: %d (%.2f%%)\n", digits, getPercentage(digits, str.length()));
    }

    public static int countVowels(String str) {
        int numVowels = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i)))
                numVowels++;
        }
        return numVowels;
    }

    public static int countDigits(String str) {
        int numDigits = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                numDigits++;
        }
        return numDigits;
    }

    public static double getPercentage(int count, int total) {
        return (double) count / total * 100;
    }

    public static boolean isVowel2(char inChar) {
        return switch (inChar) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }

    public static boolean isVowel(char inChar) {
        final String VOWELS = "aeiou";
        return VOWELS.indexOf(inChar) != -1;
    }
}
