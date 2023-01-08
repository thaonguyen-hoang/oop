package javabasics.lab03;

public class Factorial {
    public static void main(String[] args) {
        printFactorialInt();
        printFactorialLong();
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }

    public static long factorial(long n) {
        if (n == 0) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }

    public static boolean isOverflowing(int n) {
        return (Integer.MAX_VALUE / factorial(n - 1)) < n;
    }

    public static boolean isOverflowing(long n) {
        return (Long.MAX_VALUE / factorial(n - 1)) < n;
    }

    public static void printFactorialInt() {
        int n = 1;
        while (!isOverflowing(n)) {
            System.out.printf("The factorial of %d is %d\n", n, factorial(n));
            n++;
        }
        if (isOverflowing(n)) {
            System.out.printf("The factorial of %d is out of range\n", n);
        }
    }

    public static void printFactorialLong() {
        long n = 1;
        while (!isOverflowing(n)) {
            System.out.printf("The factorial of %d is %d\n", n, factorial(n));
            n++;
        }
        if (isOverflowing(n)) {
            System.out.printf("The factorial of %d is out of range\n", n);
        }
    }
}
