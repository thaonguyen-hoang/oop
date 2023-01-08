package javabasics.lab00.input;

import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double radius;
        System.out.print("Enter the circle's radius: ");
        radius = scan.nextDouble();
        scan.close();

        System.out.printf("radius = %.2f\n", radius);
        System.out.printf("diameter = %.2f\n", getDiameter(radius));
        System.out.printf("circumference = %.2f\n", getCircumference(radius));
        System.out.printf("area = %.2f\n", getArea(radius));
    }

    public static double getDiameter(double radius) {
        return radius * 2;
    }

    public static double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double getArea(double radius) {
        return Math.PI * radius * radius;
    }
}
