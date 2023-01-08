package javabasics.lab03;

import java.util.Scanner;

public class NumberGuess {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        System.out.println("Key in you guess (0 - 99): ");
        int guess = scan.nextInt();
        checkAnswer(guess, SECRET_NUMBER);
    }

    public static void checkAnswer(int guess, int secretNumber) {
        int trials = 1;
        while (guess != secretNumber) {
            if (guess < secretNumber) {
                System.out.println("Try higher");
            } else {
                System.out.println("Try lower");
            }
            trials++;
            guess = scan.nextInt();
        }
        if (trials == 1) {
            System.out.println("You got it in first attempt!");
        } else {
            System.out.printf("You got it in %d trials!", trials);
        }
    }
}
