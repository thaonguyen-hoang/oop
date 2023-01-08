package oop.lab09.oop_collections;

import java.util.HashMap;
import java.util.Map;

public class TestMaps {
    public static void main(String[] args) {
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(0, 10);
        map1.put(1, 20);
        map1.put(2, 30);
        map1.put(3, 40);
        map1.put(4, 50);
        System.out.println(map1);

        System.out.println("Number of key-value mappings: " + Maps.count(map1));
        if (Maps.contains(map1, 3)) {
            System.out.println("3=" + map1.get(3));
        } else {
            System.out.println("3 is not a key");
        }

        if (Maps.containsKeyValue(map1,2, 30)) {
            System.out.println("2=" + map1.get(2));
        } else {
            System.out.println("No such mapping");
        }

        System.out.println("Key set: " + Maps.keySet(map1));
        System.out.println("Values: " + Maps.values(map1));
        System.out.println("Get color: " + Maps.getColor(1));

        Maps.empty(map1);
        System.out.println(map1);
    }
}
