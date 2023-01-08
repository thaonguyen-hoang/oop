package oop.lab10.collections.mymap;

public class TestApp {
    public static void main(String[] args) {
        MyMap map = new MyHashMap();
        map.put(11, "Nicola");
        map.put(11, "Nicola");
        map.put(21, "Marzia");
        map.put(33, "Agata");
        map.remove(21);
        System.out.println(map.contains(11));
        System.out.println(map.contains(77));
        System.out.println(map.size());
        System.out.println(map);
    }
}
