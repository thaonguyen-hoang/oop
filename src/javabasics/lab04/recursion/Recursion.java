package javabasics.lab04.recursion;

public class Recursion {
    public static void main(String[] args) {
        int n = 7;
        System.out.printf("The factorial of %d is %d\n", n, factorial(n));
        System.out.printf("The %dth fibonacci number is %d\n", n, fibonacci(n));
        System.out.printf("The length of S(%d) is %d\n", n,
                lengthOfNumberSequence(n));

        int a = 18;
        int b = 24;
        System.out.printf("The greatest common divisor of %d and %d is %d", a, b, gcd(a, b));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int lengthOfNumberSequence(int n) {
        if (n == 1) {
            return 1;
        }
        return lengthOfNumberSequence(n - 1) + Integer.toString(n).length();
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}