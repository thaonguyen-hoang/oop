package javabasics.lab01.string_and_char;

import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Promt and read input
        System.out.print("Enter a hex string: ");
        String inStr = scan.nextLine();

        // Convert to lowercase to reduce the number of cases
        String lowerStr = inStr.toLowerCase();

        // Check and print out results
        if (checkHexString(lowerStr)) {
            System.out.printf("'%s' is a hex string", inStr);
        } else {
            System.out.printf("'%s' is NOT a hex string", inStr);
        }
    }

    public static boolean checkHexString(String lowerStr) {
        for (int i = 0; i < lowerStr.length(); i++) {
            if (!((Character.isDigit(lowerStr.charAt(i)))
                    || (lowerStr.charAt(i) >= 'a' && lowerStr.charAt(i) <= 'f')))
                return false;
        }
        return true;
    }
}
