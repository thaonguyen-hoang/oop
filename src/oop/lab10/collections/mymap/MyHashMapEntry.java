package oop.lab10.collections.mymap;

public class MyHashMapEntry {
    private final Object key;
    public final Object value;

    public MyHashMapEntry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}
