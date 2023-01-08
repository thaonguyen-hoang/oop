package javabasics.lab04.number_theory;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a = 18;
        int b = 24;

        System.out.printf("The greatest common divisor of %d and %d is %d\n", a, b, gcd(a, b));
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
