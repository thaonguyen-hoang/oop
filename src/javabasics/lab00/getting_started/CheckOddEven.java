package javabasics.lab00.getting_started;

public class CheckOddEven {
    public static void main(String[] args) {
        int number = 49;
        System.out.println("The number is " + number);
        check(number);
        System.out.println("Bye!");
    }

    public static void check(int number) {
        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
