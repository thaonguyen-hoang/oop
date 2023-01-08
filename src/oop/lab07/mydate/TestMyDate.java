package oop.lab07.mydate;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2012, 2, 28);
        System.out.println(date1);
        System.out.println(date1.nextDay());
        System.out.println(date1.nextDay());
        System.out.println(date1.nextMonth());
        System.out.println(date1.nextYear());
        System.out.println();

        MyDate date2 = new MyDate(2012, 1, 2);
        System.out.println(date2);
        System.out.println(date2.previousDay());
        System.out.println(date2.previousDay());
        System.out.println(date2.previousMonth());
        System.out.println(date2.previousYear());
        System.out.println();

        MyDate date3 = new MyDate(2012, 2, 29);
        System.out.println(date3.nextYear());
        System.out.println(date3.previousYear());
        System.out.println();

        MyDate date = new MyDate(2011, 12, 28);
        while (date.getDay() != 3 || date.getMonth() != 3 || date.getYear() != 2012) {
            System.out.println(date);
            date = date.nextDay();
        }

        MyDate date4 = new MyDate(2099, 11, 31);
        System.out.println(date4);
        MyDate date5 = new MyDate(2011, 2, 29);
        System.out.println(date5);

    }
}
