package javabasics.lab00.input;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scan.nextInt();
        scan.close();

        System.out.print("The reverse is: " + reverse(number));
    }

    public static String reverse(int number) {
        StringBuilder reverse = new StringBuilder();
        while (number > 0) {
            int digit = number % 10;
            reverse.append(digit);
            number = number / 10;
        }
        return reverse.toString();
    }
}
