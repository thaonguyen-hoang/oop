package javabasics.lab02.method;

import java.util.Scanner;

public class TestArrayMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Print a double array:");
        double[] doubleArray = ArrayMethods.readDoubleArray(scan);
        testPrintDoubleArray(doubleArray);
        System.out.println();

        System.out.println("Print a float array:");
        float[] floatArray = ArrayMethods.readFloatArray(scan);
        testPrintFloatArray(floatArray);
        System.out.println();

        System.out.println("Print an integer array:");
        int[] intArray = ArrayMethods.readIntArray(scan);
        testPrintIntArray(intArray);
        System.out.println();

        testArrayToString(intArray);
        System.out.println();

        System.out.print("Enter an integer to check: ");
        int key = scan.nextInt();
        testContains(intArray, key);
        System.out.println();

        testCopy(intArray);
        System.out.println();

        System.out.print("Enter an integer for array length: ");
        int newLength = scan.nextInt();
        testCopyWithNewLength(intArray, newLength);
        System.out.println();

        testReverse(intArray);
        System.out.println();

        System.out.println("Enter 2 arrays:");
        int[] array1 = ArrayMethods.readIntArray(scan);
        int[] array2 = ArrayMethods.readIntArray(scan);
        testEquals(array1, array2);
        System.out.println();

        testPrintIntArray(array1);
        testPrintIntArray(array2);
        testSwap(array1, array2);
        System.out.println();

        scan.close();
    }

    public static void testPrintIntArray(int[] array) {
        ArrayMethods.print(array);
    }

    public static void testPrintDoubleArray(double[] array) {
        ArrayMethods.print(array);
    }

    public static void testPrintFloatArray(float[] array) {
        ArrayMethods.print(array);
    }

    public static void testArrayToString(int[] array) {
        System.out.printf("Convert array to string: %s\n",
                ArrayMethods.arrayToString(array));
    }

    public static void testContains(int[] array, int key) {
        if (ArrayMethods.contains(array, key)) {
            System.out.printf("%s is contained in array\n", key);
            System.out.printf("The index of value %s in array is %s\n",
                    key, ArrayMethods.search(array, key));
        } else {
            System.out.printf("%s isn't contained in array\n", key);
        }
    }

    public static void testCopy(int[] array) {
        System.out.print("Array: ");
        ArrayMethods.print(array);

        System.out.print("A copy of the given array: ");
        ArrayMethods.print(ArrayMethods.copyOf(array));
    }

    public static void testCopyWithNewLength(int[] array, int newLength) {
        System.out.print("Array: ");
        ArrayMethods.print(array);

        System.out.print("A copy of the given array with required length: ");
        ArrayMethods.print(ArrayMethods.copyOf(array, newLength));
    }

    public static void testReverse(int[] array) {
        System.out.print("Reverse the contents of array: ");
        ArrayMethods.reverse(array);
        ArrayMethods.print(array);
    }

    public static void testEquals(int[] array1, int[] array2) {
        if (ArrayMethods.equals(array1, array2)) {
            System.out.println("Two arrays are the same");
        } else {
            System.out.println("Two arrays are not equal");
        }
    }

    public static void testSwap(int[] array1, int[] array2) {
        if (ArrayMethods.swap(array1, array2)) {
            System.out.println("Two arrays after swapping contents:");
            System.out.print("Array 1: ");
            ArrayMethods.print(array1);
            System.out.print("Array 2: ");
            ArrayMethods.print(array2);
        } else {
            System.out.println("Cannot swap since two arrays have different number of elements");
        }
    }
}
