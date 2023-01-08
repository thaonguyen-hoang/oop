package oop.lab09.oop_collections;

import java.util.*;

public class TestSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println(set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(3);
        set2.add(5);
        set2.add(7);
        set2.add(9);
        System.out.println(set2);

        Set<Integer> set3 = new HashSet<>();
        set3.add(1);
        set3.add(4);
        set3.add(9);
        set3.add(16);
        set3.add(25);
        System.out.println(set3);

        Set<Integer> intersection12 = Sets.intersection(set1, set2);
        System.out.println(intersection12);
        Set<Integer> union12 = Sets.union(set1, set2);
        System.out.println(union12);
        Set<Integer> intersection23 = Sets.intersectionManual(set2, set3);
        System.out.println(intersection23);
        Set<Integer> union23 = Sets.unionManual(set2, set3);
        System.out.println(union23);

        Integer[] arr = Sets.toArray(union12);
        System.out.println(Arrays.toString(arr));

        List<Integer> list1 = new ArrayList<>(union23);
        list1.add(1);
        list1.add(3);
        list1.add(5);
        System.out.println(list1);
        System.out.println(Sets.removeDuplicatesManual(list1));
        System.out.println(Sets.removeDuplicates(list1));

        String str1 = "banana";
        System.out.println(Sets.firstRecurringCharacter(str1));
        System.out.println(Sets.allRecurringChars(str1));

        TreeSet<Integer> set4 = new TreeSet<>();
        set4.add(0);
        set4.add(1);
        set4.add(2);
        set4.add(3);
        set4.add(4);
        System.out.println(Sets.getFirst(set4));
        System.out.println(Sets.getLast(set4));
        System.out.println(Sets.getGreater(set4, 0));
    }
}
