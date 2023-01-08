package javabasics.lab04.number_theory;

import java.util.Scanner;

public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int upperbound;

        do {
            System.out.print("Please enter the upper bound: ");
            upperbound = scan.nextInt();
        } while (upperbound <= 0);
        scan.close();

        System.out.println("These numbers are perfect:");
        listOfPerfects(upperbound);
        System.out.println();

        System.out.println("These numbers are neither deficient nor perfect:");
        listOfNonSpecialists(upperbound);
    }

    public static boolean isPerfect(int positiveInt) {
        int sum = 0;
        for (int divisor = 1; divisor < positiveInt; divisor++) {
            if (positiveInt % divisor == 0)
                sum += divisor;
        }
        return sum == positiveInt;
    }

    public static boolean isDeficient(int positiveInt) {
        int sum = 0;
        for (int divisor = 1; divisor < positiveInt; divisor++) {
            if (positiveInt % divisor == 0)
                sum += divisor;
        }
        return sum < positiveInt;
    }

    public static void listOfPerfects(int upperbound) {
        int count = 0;
        for (int number = 1; number <= upperbound; number++) {
            if (isPerfect(number)) {
                System.out.print(number + " ");
                count++;
            }
        }
        double percentage = (double) count / upperbound * 100;
        System.out.printf("\n[%d perfect numbers found (%.2f%%)]\n", count, percentage);
    }

    public static void listOfNonSpecialists(int upperbound) {
        int count = 0;
        for (int number = 1; number <= upperbound; number++) {
            if (!isPerfect(number) && !isDeficient(number)) {
                System.out.print(number + " ");
                count++;
            }
        }
        double percentage = (double) count / upperbound * 100;
        System.out.printf("\n[%d numbers found (%.2f%%)]\n", count, percentage);
    }
}
