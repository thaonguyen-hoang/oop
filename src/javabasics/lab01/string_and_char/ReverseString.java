package javabasics.lab01.string_and_char;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Prompt and read input as "String"
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inStr = scan.nextLine();
        scan.close();

        // Print string in reverse order
        printReverse(inStr);
        System.out.println();

        // Print reverse string
        System.out.print("The reverse string: ");
        System.out.println(reverseString(inStr));
    }

    public static void printReverse(String str) {
        System.out.printf("The reverse of the String '%s' is ", str);
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    public static String reverseString(String str) {
        StringBuilder reverseString = new StringBuilder(); // String: immutable != StringBuilder: mutable
        for (int i = str.length() - 1; i >= 0 ; i--) {
            reverseString.append(str.charAt(i));
        }
        return reverseString.toString();
    }
}
