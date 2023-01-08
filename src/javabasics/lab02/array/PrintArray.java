package javabasics.lab02.array;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = scan.nextInt();

        System.out.print("Enter the value of all items (separated by space): ");
        int[] items = readInput(NUM_ITEMS, scan);
        scan.close();

        System.out.print("The values are: ");
        printArray(items);

    }

    public static int[] readInput(int n, Scanner scan) {
        int[] items = new int[n];
        for (int i = 0; i < n; i++) {
            items[i] = scan.nextInt();
        }
        return items;
    }

    public static void printArray(int[] items) {
        System.out.print("[");
        for (int i = 0; i < items.length; i++) {
            if (i < items.length - 1) {
                System.out.print(items[i] + ", ");
            } else {
                System.out.print(items[i] + "]");
            }
        }
    }
}
