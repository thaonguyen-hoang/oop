package javabasics.lab00.input;

import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[]args) {
        final int NUM_OF_STUDENTS = 3;
        System.out.printf("The average is %.2f",
                averageWithInputValidation(NUM_OF_STUDENTS));
    }

    public static boolean isValid(int mark) {
        return mark >= 0 && mark <= 100;
    }

    public static double averageWithInputValidation(int numStudents) {
        Scanner scan = new Scanner(System.in);
        int mark;
        int sum = 0;
        for (int i = 1; i <= numStudents; i++) {
            do {
                System.out.print("Enter the mark (0-100) for student " + i + ": ");
                mark = scan.nextInt();
                if (isValid(mark)) {
                    sum += mark;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            } while (!isValid(mark));
        }
        scan.close();
        return (double) sum / numStudents;
    }
}
