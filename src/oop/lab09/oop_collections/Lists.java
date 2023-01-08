package oop.lab09.oop_collections;

import java.util.*;

public class Lists {
    // Function to insert an element into a list at the beginning
    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);
    }

    // Function to append an element into a list
    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(value);
    }

    // Function to replace the 3rd element of a list with a given value
    public static void replace(ArrayList<Integer> list, int value) {
        list.set(2, value);
    }

    // Function to remove the 3rd element from a list
    public static void removeThird(ArrayList<Integer> list) {
        list.remove(2);
    }

    // Function to remove the element '666' from a list
    public static void removeEvil(ArrayList<Integer> list) {
        list.remove(Integer.valueOf(666));
    }

    // Function returning a ArrayList<Integer>
    // containing the first 10 square number
    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> listOfSquareNumbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            listOfSquareNumbers.add(i * i);
        }
        return listOfSquareNumbers;
    }

    // Function to verify if a list contains a certain value
    public static boolean contains(ArrayList<Integer> list, int value) {
        return list.contains(value);
    }

    // Function to copy a list into another list manually
    public static void copy(ArrayList<Integer> source,
                            ArrayList<Integer> target) {
        target.clear();
        for (int value : source) {
            target.add(value);
        }
    }

    // Function to reverse the elements of a list
    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    // Function to reverse the elements of a list manually
    public static void reverseManual(ArrayList<Integer> list) {
        int len = list.size();
        for (int i = 0; i < len / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(len - 1 - i));
            list.set(len - 1 - i, temp);
        }
    }

    // Function to insert the same element both at the beginning
    // and the end of the same LinkedList
    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }
}
