package javabasics.lab02.method;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("The magic sum is: %s", getMagicSum(scan));
        scan.close();
    }

    public static int getMagicSum(Scanner scan) {
        final int SENTINEL = -1;
        int number;
        int magicSum = 0;
        // Read input and add to magic sum if the number contains the digit 8
        do {
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = scan.nextInt();

            if (hasEight(number))
                magicSum += number;
        } while (number != SENTINEL);
        return magicSum;
    }

    public static boolean hasEight(int number) {
        String numStr = Integer.toString(number);
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '8')
                return true;
        }
        return false;
    }

    public static boolean hasEight2(int number) {
        int lastDigit;
        while (number > 0) {
            lastDigit = number % 10;
            if (lastDigit == 8) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }
}
