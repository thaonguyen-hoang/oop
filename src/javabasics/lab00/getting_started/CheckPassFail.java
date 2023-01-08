package javabasics.lab00.getting_started;

public class CheckPassFail {
    public static void main(String[] args) {
        int mark = 49;
        System.out.println("The mark is " + mark);
        check(mark);
        System.out.println("DONE");
    }

    public static void check(int mark) {
        if (mark >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
