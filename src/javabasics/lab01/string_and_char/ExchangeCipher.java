package javabasics.lab01.string_and_char;

import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String inStr = scan.nextLine().toUpperCase();
        scan.close();

        System.out.print("The ciphertext string is: ");
        exchangeCipher(inStr);
    }

    public static void exchangeCipher(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print((char) ('A' + 'Z' - str.charAt(i)));
        }
    }
}
