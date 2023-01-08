package oop.lab10.collections.mylist;

public class MyArrayList extends MyAbstractList {
    static final int DEFAULT_CAPACITY = 16;
    Object[] elements;
    int size;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    @Override
    public void add(Object object) {
        add(object, size);
    }

    @Override
    public void add(Object object, int index) {
        checkBoundaries(index, size);
        if (size >= elements.length - 1) {
            enlarge();
        }
        if (index != size) {
            System.arraycopy(elements, index, elements, index + 1, size - index);
        }
        elements[index] = object;
        size++;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size - 1);
        return elements[index];
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size - 1);
        if (index != --size) {
            System.arraycopy(elements, index + 1, elements, index, size - index);
        }
        elements[size] = null;

        /*
        System.arraycopy(elements, index + 1, elements, index, size - index);
        element[--size] = null;
        */
    }

    @Override
    public int size() {
        return size;
    }

    void enlarge() {
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0 ,tmp, 0, elements.length);
        elements = tmp;
    }

}
