package javabasics.lab00.loops;

import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = scan.nextInt();

        System.out.println("Extracted digits in reverse order:");
        extractDigits(n);
    }

    public static void extractDigits(int n) {
        while (n > 0) {
            int digit = n % 10;
            System.out.print(digit + " ");
            n = n / 10;
        }
        System.out.println();
    }
}
