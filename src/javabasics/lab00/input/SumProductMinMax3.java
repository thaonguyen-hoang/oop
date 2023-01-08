package javabasics.lab00.input;

import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int num1 = scan.nextInt();
        System.out.print("Enter 2nd integer: ");
        int num2 = scan.nextInt();
        System.out.print("Enter 3rd integer: ");
        int num3 = scan.nextInt();
        scan.close();

        System.out.println("The sum is: " + getSum(num1, num2, num3));
        System.out.println("The product is: " + getProduct(num1, num2, num3));
        System.out.println("The min is: " + findMin(num1, num2, num3));
        System.out.println("The max is: " + findMax(num1, num2, num3));
    }

    public static int getSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int getProduct(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public static int findMin(int num1, int num2, int num3) {
        int min = num1;
        if (min > num2)
            min = num2;
        if (min > num3)
            min = num3;
        return min;
    }

    public static int findMax(int num1, int num2, int num3) {
        int max = num1;
        if (max < num2)
            max = num2;
        if (max < num3)
            max = num3;
        return max;
    }
}
