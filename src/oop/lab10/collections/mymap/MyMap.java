package oop.lab10.collections.mymap;

public interface MyMap {
    int size();
    void put(Object key, Object value);
    void remove(Object key);
    Object get(Object key);
    boolean contains(Object key);
}
