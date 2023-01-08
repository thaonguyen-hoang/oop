package oop.lab09.oop_collections;

import java.util.*;

public class Sets {
    // Function returning the intersection of two given sets manually
    public static Set<Integer> intersectionManual(Set<Integer> first,
                                                  Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>();
        for (int value : first) {
            if (second.contains(value)) {
                intersection.add(value);
            }
        }
        return intersection;
    }

    // Function returning the union of two given sets manually
    public static Set<Integer> unionManual(Set<Integer> first,
                                           Set<Integer> second) {
        Set<Integer> union = new HashSet<>();
        for (int value : first) {
            union.add(value);
        }
        for (int value : second) {
            union.add(value);
        }
        return union;
    }

    // Function returning the intersection of two given sets
    public static Set<Integer> intersection(Set<Integer> first,
                                            Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        return intersection;
    }

    // Function returning the union of two given sets
    public static Set<Integer> union(Set<Integer> first,
                                     Set<Integer> second) {
        Set<Integer> union = new HashSet<>(first);
        union.addAll(second);
        return union;
    }

    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        return new ArrayList<>(new LinkedHashSet<>(source));
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> nonDuplicates = new ArrayList<>();
        for (int value : source) {
            if (!nonDuplicates.contains(value)) {
                nonDuplicates.add(value);
            }
        }
        return nonDuplicates;
    }

    public static String firstRecurringCharacter(String s) {
        HashSet<Character> nonDuplicates = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (nonDuplicates.contains(ch)) {
                return String.valueOf(ch);
            } else {
                nonDuplicates.add(ch);
            }
        }
        return null;
    }

    public static Set<Character> allRecurringChars(String s) {
        HashSet<Character> nonDuplicates = new HashSet<>();
        HashSet<Character> duplicates = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (nonDuplicates.contains(ch)) {
                duplicates.add(ch);
            } else {
                nonDuplicates.add(ch);
            }
        }
        return duplicates;
    }

    public static Integer[] toArray(Set<Integer> source) {
        Integer[] intArray = new Integer[source.size()];
        source.toArray(intArray);
        return intArray;
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }
}

