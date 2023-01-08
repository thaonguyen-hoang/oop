package oop.lab10.collections.mylist;

public class MyLinkedList extends MyAbstractList {
    int size;
    MyLinkedListNode head;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    @Override
    public void add(Object object) {
        add(object, size);
    }

    @Override
    public void add(Object object, int index) {
        checkBoundaries(index, size);
        if (index == 0) {
            // MyLinkedListNode newNode = new MyLinkedListNode(object, head);
            // head = newNode;
            head = new MyLinkedListNode(object, head);
        } else {
            // MyLinkedListNode current = getNodeByIndex(index - 1);
            // MyLinkedListNode newNode = new MyLinkedListNode(object, current.getNext());
            // current.setNext(newNode);
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(new MyLinkedListNode(object, current.getNext()));
        }
        size++;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size - 1);
        return getNodeByIndex(index).getPayload();
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size - 1);
        MyLinkedListNode current = getNodeByIndex(index - 1);
        current.setNext(getNodeByIndex(index).getNext());
        size--;
    }

    @Override
    public int size() {
        return size;
    }
}
