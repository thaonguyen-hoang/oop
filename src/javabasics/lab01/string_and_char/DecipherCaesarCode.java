package javabasics.lab01.string_and_char;

import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String inStr = scan.nextLine().toUpperCase();
        scan.close();

        System.out.print("The plaintext string is: ");
        decipherText(inStr);
    }

    public static void decipherText(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) - 3 >= 65) {
                System.out.print((char) (str.charAt(i) - 3));
            } else if (str.charAt(i) == 'A') {
                System.out.print("X");
            } else if (str.charAt(i) == 'B') {
                System.out.print("Y");
            } else if (str.charAt(i) == 'C') {
                System.out.print("Z");
            } else {
                System.out.print(str.charAt(i));
            }
        }
    }
}
