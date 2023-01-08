package oop.lab07.mytime;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime time1 = new MyTime(19, 12, 7);
        System.out.println(time1);

        time1.setTime(23, 58, 59);
        System.out.println(time1);
        System.out.println(time1.nextSecond());
        System.out.println(time1.nextMinute());
        System.out.println(time1.nextHour());

        MyTime time = new MyTime();
        System.out.println(time);
        System.out.println(time.previousSecond());
        System.out.println(time.previousMinute());
        System.out.println(time.previousHour());
        System.out.println();

        time.setTime(60, 1, 1);
    }
}
