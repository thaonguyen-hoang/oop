package javabasics.lab04.algorithms;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] array1 = {9, 6, 4, 1, 5, 2, 7};
        selectionSort(array1);
        printArray(array1);

        int[] array2 = {8, 5, 1, 4, 6, 3};
        bubbleSort(array2);
        printArray(array2);

        int[] array3 = {2, 6, 4, 10, 3, 0, 5};
        bubbleSort2(array3);
        printArray(array3);

        int[] array4 = {7, 3, -1, 9, 0, 2};
        insertionSort(array4);
        printArray(array4);

        int[] array5 = {7, 6, 5, 4, 3, 2, 1};
        bubbleSort2(array5);
        printArray(array5);

    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int jMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[jMin])
                    jMin = j;
            }

            if (jMin != i) {
                int temp = array[i];
                array[i] = array[jMin];
                array[jMin] = temp;
            }
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void bubbleSort2(int[] data) {
        int len = data.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < len; i++) {
                if (data[i - 1] > data[i]) {
                    int temp = data[i];
                    data[i] = data[i - 1];
                    data[i - 1] = temp;
                    swapped = true;
                }
            }
            len = len - 1;
        } while (swapped);
    }

    public static void insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            for (int j = i; j > 0; j--) {
                if (data[j - 1] > data[j]) {
                    int temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
    }
}
