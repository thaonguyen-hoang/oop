package javabasics.lab02.array;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read and save inputs in an array
        int[] grades = readGrades(scan);
        scan.close();

        // Print grades
        System.out.print("The grades are: ");
        printArray(grades);
        System.out.println();

        // Compute and display the features
        System.out.printf("The average is: %.2f\n", getAverage(grades));
        System.out.printf("The median is: %.2f\n", getMedian(grades));
        System.out.printf("The minimum is: %d\n", findMin(grades));
        System.out.printf("The maximum is: %d\n", findMax(grades));
        System.out.printf("The standard deviation is: %.2f\n", getStdDev(grades));
    }

    public static int[] readGrades(Scanner scan) {
        System.out.print("Enter the number of students: ");
        int numStudents = scan.nextInt();
        int[] grades = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            do {
                System.out.printf("Enter the grade (0-100) for student %d: ", i + 1);
                grades[i] = scan.nextInt();
                if (!isValid(grades[i])) {
                    System.out.println("Invalid input! Input must be between 0 and 100.");
                }
            } while (!isValid(grades[i]));
        }
        return grades;
    }

    public static boolean isValid(int grade) {
        return grade >= 0 && grade <= 100;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + "]");
            }
        }
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int grade:array) {
            sum += grade;
        }
        return (double) sum / array.length;
    }

    public static double getMedian(int[] array) {
        Arrays.sort(array);
        int n = array.length;
        if (n % 2 != 0) {
            return array[n / 2];
        } else {
            return (double) (array[(n / 2) - 1] + array[n / 2]) / 2;
        }
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static double getVariance(int[] array) {
        double sqDiff = 0;
        double mean = getAverage(array);
        for (int value : array) {
            sqDiff += (value - mean) * (value - mean);
        }
        return sqDiff / array.length;
    }

    public static double getStdDev(int[] array) {
        return Math.sqrt(getVariance(array));
    }
}
