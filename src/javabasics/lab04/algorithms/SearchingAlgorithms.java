package javabasics.lab04.algorithms;

public class SearchingAlgorithms {
    public static void main(String[] args) {
        int[] array = {11, 14, 16, 18, 20, 25, 28, 30, 34, 40, 45};
        int key = 30;

        System.out.printf("%d is found inside the array:\n", key);
        System.out.println(linearSearch(array, key));
        System.out.println("index: " + linearSearchIndex(array, key));
        System.out.println("index: " + linearSearchIndexWithSentinel(array, key));
        System.out.println(binarySearch(array, key));
        System.out.println(binarySearch(array, key, 3, 7));
    }

    public static boolean linearSearch(int[] array, int key) {
        for (int value : array) {
            if (value == key)
                return true;
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return i;
        }
        return -1;
    }

    public static int linearSearchIndexWithSentinel(int[] array, int key) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[newArray.length - 1] = key;

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == key && i < array.length) {
                return i;
            }
        }
        return -1;
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx) { // Terminating one-element list
            return key == array[fromIdx];
        }

        int middleIdx = (fromIdx + toIdx) / 2;
        if (array[middleIdx] == key) {
            return true;
        } else if (array[middleIdx] < key) {
            fromIdx = middleIdx + 1 ;
        } else {
            toIdx = middleIdx - 1;
        }
        return binarySearch(array, key, fromIdx, toIdx);
    }

    public static boolean binarySearch(int[] array, int key) {
        int fromIdx = 0;
        int toIdx = array.length - 1;

        while (fromIdx != toIdx) {
            int middleIdx = (fromIdx + toIdx) / 2;
            if (array[middleIdx] == key) {
                return true;
            } else if (array[middleIdx] < key) {
                fromIdx = middleIdx + 1;
            } else {
                toIdx = middleIdx - 1;
            }
        }
        return key == array[fromIdx];
    }
}
