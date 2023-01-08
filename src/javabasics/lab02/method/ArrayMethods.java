package javabasics.lab02.method;

import java.util.Scanner;

public class ArrayMethods {
    public static int[] readIntArray(Scanner scan) {
        System.out.print("Enter the number of elements: ");
        int n = scan.nextInt();
        if (n == 0) {
            return null;
        } else {
            System.out.print("Enter all elements of array: ");
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scan.nextInt();
            }
            return array;
        }
    }

    public static double[] readDoubleArray(Scanner scan) {
        System.out.print("Enter the number of elements: ");
        int n = scan.nextInt();
        if (n == 0) {
            return null;
        } else {
            System.out.print("Enter all elements of array: ");
            double[] array = new double[n];
            for (int i = 0; i < n; i++) {
                array[i] = scan.nextDouble();
            }
            return array;
        }
    }

    public static float[] readFloatArray(Scanner scan) {
        System.out.print("Enter the number of elements: ");
        int n = scan.nextInt();
        if (n == 0) {
            return null;
        } else {
            System.out.print("Enter all elements of array: ");
            float[] array = new float[n];
            for (int i = 0; i < n; i++) {
                array[i] = scan.nextFloat();
            }
            return array;
        }
    }

    public static void print(int[] array) {
        if (array == null) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    System.out.print(array[i]);
                } else {
                    System.out.print(", " + array[i]);
                }
            }
            System.out.println("]");
        }
    }

    public static void print(double[] array) {
        if (array == null) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    System.out.print(array[i]);
                } else {
                    System.out.print(", " + array[i]);
                }
            }
            System.out.println("]");
        }
    }

    public static void print(float[] array) {
        if (array == null) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    System.out.print(array[i]);
                } else {
                    System.out.print(", " + array[i]);
                }
            }
            System.out.println("]");
        }
    }

    public static String arrayToString(int[] array) {
        if (array == null) {
            return "[]";
        } else {
            StringBuilder string = new StringBuilder("[");
            for (int element : array) {
                string.append(element).append(", ");
            }
            string.delete(string.length() - 2, string.length());
            string.append("]");
            return string.toString();
        }
    }

    public static boolean contains(int[] array, int key) {
        if (array == null) {
            return false;
        }
        for (int item : array) {
            if (item == key)
                return true;
        }
        return false;
    }

    public static int search(int[] array, int key) {
        if (array == null) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return i;
        }
        return -1;
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1 == null || array2 == null || array1.length != array2.length) {
            return false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i])
                    return false;
            }
        }
        return true;
    }

    public static int[] copyOf(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] copy = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            if (i < array.length) {
                copy[i] = array[i];
            } else {
                copy[i] = 0;
            }
        }
        return copy;
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                int temp = array1[i];
                array1[i] = array2[i];
                array2[i] = temp;
            }
            return true;
        }
    }

    public static void reverse(int[] array) {
        int temp;
        for (int forIdx = 0, backIdx = array.length - 1; forIdx < backIdx;
             forIdx++, backIdx--) {
            temp = array[forIdx];
            array[forIdx] = array[backIdx];
            array[backIdx] = temp;
        }
    }
}
