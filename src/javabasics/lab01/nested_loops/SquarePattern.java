package javabasics.lab01.nested_loops;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = readInput(scan);
        scan.close();

        printPattern(size);
    }

    public static int readInput(Scanner scan) {
        int size;
        do {
            System.out.print("Enter the size: ");
            size = scan.nextInt();

            if (size < 0)
                System.out.println("error: invalid input. try again.");
        } while (size < 0);
        return size;
    }

    public static void printPattern(int size) {
        // Print pattern using for-loop
        System.out.println("Square pattern using for-loop:");
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        // Print pattern using while-do loop
        System.out.println("Square pattern using while-do loop:");
        int row = 0;
        int col = 0;
        while (row < size) {
            while (col < size) {
                System.out.print("# ");
                col++;
            }
            System.out.println();
            row++;
            col = 0; // reset value of column for the next iteration
        }
    }
}
