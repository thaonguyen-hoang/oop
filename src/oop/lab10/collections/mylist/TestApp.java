package oop.lab10.collections.mylist;

public class TestApp {
    public static void main(String[] args) {
        MyList list1 = new MyArrayList();
        list1.add("a", 0);
        list1.add("b");
        list1.add("c", 0);
        list1.add("c", 3);
        list1.remove(3);
        System.out.println(list1.size());
        System.out.println(list1);

        MyList list2 = new MyLinkedList();
        list2.add("a", 0);
        list2.add("b");
        list2.add("c", 0);
        list2.add("d");
        list2.remove(2);
        System.out.println(list2.size());
        System.out.println(list2.get(1));
        System.out.println(list2);
    }
}
