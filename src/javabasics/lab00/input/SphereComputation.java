package javabasics.lab00.input;

import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double radius;
        System.out.print("Enter the sphere's radius: ");
        radius = scan.nextDouble();
        scan.close();

        System.out.printf("radius = %.2f\n", radius);
        System.out.printf("volume = %.2f\n", getVolume(radius));
        System.out.printf("surfaceArea = %.2f\n", getSurfaceArea(radius));
    }

    public static double getVolume(double radius) {
        return ((double) 4 / 3) * Math.PI * radius * radius * radius;
    }

    public static double getSurfaceArea(double radius) {
        return 4 * Math.PI * radius * radius;
    }
}
