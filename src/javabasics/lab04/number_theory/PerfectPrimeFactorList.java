package javabasics.lab04.number_theory;

import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int upperbound;

        do {
            System.out.print("Enter the upper bound: ");
            upperbound = scan.nextInt();
        } while (upperbound <= 0);
        scan.close();

        System.out.println("These numbers are equal to their product of prime factors: ");
        listOfProductsOfPrimeFactors(upperbound);
    }

    public static boolean isPrime(int positiveInt) {
        if (positiveInt < 2) {
            return false;
        } else {
            for (int divisor = 2; divisor * divisor <= positiveInt; divisor++) {
                if (positiveInt % divisor == 0)
                    return false;
            }
        }
        return true;
    }

    public static boolean isProductOfPrimeFactors(int positiveInt) {
        int product = 1;
        for (int factor = 2; factor <= (positiveInt / 2); factor++) {
            if (positiveInt % factor == 0 && isPrime(factor))
                product *= factor;
        }

        if (product == 1) {
            return false;
        }
        return product == positiveInt;
    }

    public static void listOfProductsOfPrimeFactors(int upperbound) {
        int count = 0;
        for (int number = 1; number <= upperbound; number++) {
            if (isProductOfPrimeFactors(number)) {
                System.out.print(number + " ");
                count++;
            }
        }
        double percentage = (double) count / upperbound * 100;
        System.out.printf("\n[%d numbers found (%.2f%%)]\n", count, percentage);
    }
}
