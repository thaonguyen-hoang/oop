package javabasics.lab03;

import java.util.Scanner;

public class WordGuess {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        final String KEYWORD = args[0];
        checkAnswer(KEYWORD);
    }

    public static String makeAGuess() {
        System.out.print("Key in one character or your guess word: ");
        return scan.nextLine();
    }

    public static void checkAnswer(String keyword) {
        StringBuilder hint = new StringBuilder();
        for (int i = 0; i < keyword.length(); i++) {
            hint.append("_");
        }

        String guess = makeAGuess();
        int trials = 1;

        while (!guess.equals(keyword)) {
            System.out.printf("Trial %d: ", trials);
            if (guess.length() == 1) {
                for (int i = 0; i < keyword.length(); i++) {
                    if (keyword.charAt(i) == guess.charAt(0)) {
                        hint.setCharAt(i, guess.charAt(0));
                    }
                }
                System.out.println(hint);
            } else {
                System.out.println("Not correct!");
            }
            trials++;
            guess = makeAGuess();
        }

        if (trials == 1) {
            System.out.println("Congratulation!\nYou got it in first attempt");
        } else {
            System.out.printf("Congratulations!\nYou got it in %d trials", trials);
        }
    }
}
