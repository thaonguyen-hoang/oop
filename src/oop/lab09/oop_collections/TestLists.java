package oop.lab09.oop_collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        Lists.insertFirst(list1, 5);
        Lists.insertFirst(list1, 1);
        Lists.insertLast(list1, 10);
        Lists.insertLast(list1, 20);
        Lists.insertLast(list1, 666);
        Lists.insertLast(list1, 1000);
        System.out.println(list1);

        Lists.replace(list1, 15);
        System.out.println(list1);
        Lists.removeThird(list1);
        System.out.println(list1);
        Lists.removeEvil(list1);
        System.out.println(list1);

        Lists.copy(Lists.generateSquare(), list1);
        System.out.println(list1);
        if (Lists.contains(list1, 2)) {
            System.out.println("2 is in the list");
        } else {
            System.out.println("2 is not in the list");
        }

        Lists.reverse(list1);
        System.out.println(list1);
        Lists.reverseManual(list1);
        System.out.println(list1);

        LinkedList<Integer> list2 = new LinkedList<>(list1);
        Lists.insertBeginningEnd(list2, 0);
        System.out.println(list2);
    }
}
