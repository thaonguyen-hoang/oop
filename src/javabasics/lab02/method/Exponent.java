package javabasics.lab02.method;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = scan.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = scan.nextInt();
        scan.close();

        System.out.printf("%d raises to the power of %d is: %s",
                base, exp, exponent(base, exp));
    }

    public static int exponent(int base, int exp) {
        int product = 1;
        for (int i = 0; i < exp; i++) {
            product *= base;
        }
        return product;
    }
}
