package javabasics.lab04.number_theory;

import java.util.Scanner;

public class PrimeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int upperbound;

        do {
            System.out.print("Please enter the upper bound: ");
            upperbound = scan.nextInt();
        } while (upperbound <= 0);
        scan.close();

        listOfPrimes(upperbound);
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

    public static void listOfPrimes(int upperbound) {
        int count = 0;
        for (int number = 1; number <= upperbound; number++) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
        }
        double percentage = (double) count / upperbound * 100;
        System.out.printf("[%d prime numbers found (%.2f%%)]\n", count, percentage);
    }
}
