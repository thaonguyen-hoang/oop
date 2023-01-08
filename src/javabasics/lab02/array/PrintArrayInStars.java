package javabasics.lab02.array;

import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = scan.nextInt();

        System.out.print("Enter the value of all items (separated by space): ");
        int[] items = readInput(NUM_ITEMS, scan);
        scan.close();

        printArrayInStars(items);
    }

    public static int[] readInput(int n, Scanner scan) {
        int[] items = new int[n];
        for (int i = 0; i < n; i++) {
            items[i] = scan.nextInt();
        }
        return items;
    }

    public static void printArrayInStars(int[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.print(i + ": ");
            for (int starNo = 0; starNo < items[i]; starNo++) {
                System.out.print("*");
            }
            System.out.printf("(%d)\n", items[i]);
        }
    }
}
