package javabasics.lab00.input;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        validateInput(scan);
        scan.close();
    }

    public static boolean isValid(int number) {
        return ((number >= 0 && number <= 10) ||
                (number >= 90 && number <= 100));
    }

    public static void validateInput(Scanner scan) {
        int number;
        do {
            System.out.print("Enter a number from 0-10 or 90-100: ");
            number = scan.nextInt();
            if (isValid(number)) {
                System.out.println("You have entered: " + number);
            } else {
                System.out.println("Invalid input, try again...");
            }
        } while (!isValid(number));
    }
}
