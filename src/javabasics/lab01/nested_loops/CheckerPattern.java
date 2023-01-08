package javabasics.lab01.nested_loops;

import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args) {
        // Enter a non-negative integer for the size
        Scanner scan = new Scanner(System.in);
        int size = readInput(scan);
        scan.close();

        // Print pattern
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
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
    }
}
