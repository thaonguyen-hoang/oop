package javabasics.lab01.string_and_char;

import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = scan.nextLine().toUpperCase();
        scan.close();

        System.out.print("The ciphertext string is: ");
        cipherText(inStr);
        System.out.println("The cipher string: " + cipherString(inStr));
    }

    public static void cipherText(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) + 3 <= 90) {
                System.out.print((char) (str.charAt(i) + 3));
            } else if (str.charAt(i) == 'X') {
                System.out.print("A");
            } else if (str.charAt(i) == 'Y') {
                System.out.print("B");
            } else if (str.charAt(i) == 'Z') {
                System.out.print("C");
            } else {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
    }

    public static String cipherString(String str) {
        StringBuilder cipherText = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'X':
                    cipherText.append("A");
                    break;
                case 'Y':
                    cipherText.append("B");
                    break;
                case 'Z':
                    cipherText.append("C");
                    break;
                default:
                    cipherText.append((char) (str.charAt(i) + 3));
            }
        }
        return cipherText.toString();
    }
}
