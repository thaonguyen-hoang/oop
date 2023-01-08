package javabasics.lab01.nested_loops;

import java.util.Scanner;

public class HillPattern {
    public static void main(String[] args) {
        // Enter a non-negative integer for the size
        Scanner scan = new Scanner(System.in);
        int size = readInput(scan);
        scan.close();

        // Print pattern
        System.out.println("Pattern A");
        printPatternA(size);
        System.out.println("Pattern B");
        printPatternB(size);
        System.out.println("Pattern C");
        printPatternC(size);
        System.out.println("Pattern D");
        printPatternD(size);
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

    public static void printPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size * 2 - 1; col++) {
                if ((row + col >= size + 1) && (row >= col - size + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size * 2 - 1; col++) {
                if ((row + col >= row * 2) && (row + col <= size * 2)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printPatternC(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size * 2 - 1; col++) {
                if ((row + col >= size + 1) && (row >= col - size + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int row = 2; row <= size; row++) {
            for (int col = 1; col <= size * 2 - 1; col++) {
                if ((row + col >= row * 2) && (row + col <= size * 2)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size * 2 - 1; col++) {
                if ((row + col >= size + 2) && (row >= col - size + 2)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

        for (int row = 3; row <= size + 1; row++) {
            for (int col = 1; col <= size * 2 - 1; col++) {
                if ((row + col >= row * 2) && (row + col <= size * 2)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
