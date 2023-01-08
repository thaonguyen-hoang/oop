package javabasics.lab03;

public class FibonacciInt {
    public static void main(String[] args) {
        printFibonacci();
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static boolean isOverflowing(int n) {
        return Integer.MAX_VALUE - fibonacci(n - 1) < fibonacci(n - 2);
    }

    public static void printFibonacci() {
        int n;
        for (n = 0; n < 2; n++) {
            System.out.printf("F(%s) = %s\n", n, fibonacci(n));
        }
        for (n = 2; !isOverflowing(n); n++) {
            System.out.printf("F(%s) = %s\n", n, fibonacci(n));
        }
        if (isOverflowing(n)) {
            System.out.printf("F(%s) is out of the range of int", n);
        }
    }
}
