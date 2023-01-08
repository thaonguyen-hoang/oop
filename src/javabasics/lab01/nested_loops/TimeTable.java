package javabasics.lab01.nested_loops;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        // Enter a positive integer for the size
        Scanner scan = new Scanner(System.in);
        int size = readInput(scan);
        scan.close();

        // Print multiplication table
        printTimeTable(size);
    }

    public static int readInput(Scanner scan) {
        int size;
        do {
            System.out.print("Enter the size: ");
            size = scan.nextInt();

            if (size <= 0)
                System.out.println("error: invalid input. try again.");
        } while (size <= 0);
        return size;
    }

    public static void printTimeTable(int size) {
        // Print the first line
        System.out.print("* |");
        for (int num = 1; num <= size; num++) {
            System.out.printf("%4d", num);
        }
        System.out.println();

        // Print divider line
        for (int dash = 0; dash <= size; dash++) {
            System.out.print("----");
        }
        System.out.println();

        // Print multiplication table
        for (int row = 1; row <= size; row++) {
            System.out.print(row + " |");
            for (int col = 1; col <= size; col++) {
                System.out.printf("%4d", row * col);
            }
            System.out.println();
        }
    }
}
