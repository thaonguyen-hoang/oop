package oop.lab10.collections.mylist;

public interface MyList {
    void add(Object object);
    void add(Object object, int index);
    void remove(int index);
    Object get(int index);
    int size();
}
