package javabasics.lab00.input;

import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the cylinder's base radius: ");
        double radius = scan.nextDouble();
        System.out.print("Enter the cylinder's height: ");
        double height = scan.nextDouble();
        scan.close();

        System.out.printf("base radius = %.2f\n", radius);
        System.out.printf("height = %.2f\n", height);
        System.out.printf("baseArea = %.2f\n", getBaseArea(radius));
        System.out.printf("surfaceArea = %.2f\n", getSurfaceArea(radius));
        System.out.printf("volume = %.2f\n", getVolume(radius, height));
    }

    public static double getBaseArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double getSurfaceArea(double radius) {
        return 2 * Math.PI * radius + 2 * getBaseArea(radius);
    }

    public static double getVolume(double radius, double height) {
        return height * getBaseArea(radius);
    }
}
