package javabasics.lab01.string_and_char;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Sting: ");
        String inStr = scan.nextLine().toLowerCase();
        scan.close();

        System.out.println("Conversion using nested-if");
        for (int i = 0; i < inStr.length(); i++) {
            mapByNestedIf(inStr.charAt(i));
        }
        System.out.println();

        System.out.println("Conversion using switch-case");
        for (int i = 0; i < inStr.length(); i++) {
            mapBySwitchCase(inStr.charAt(i));
        }
    }

    public static void mapByNestedIf(char strChar) {
        if (Character.toString(strChar).matches("[abc]")) {
            System.out.print(2);
        } else if (Character.toString(strChar).matches("[def]")) {
            System.out.print(3);
        } else if (Character.toString(strChar).matches("[ghi]")) {
            System.out.print(4);
        } else if (Character.toString(strChar).matches("[jkl]")) {
            System.out.print(5);
        } else if (Character.toString(strChar).matches("[mno]")) {
            System.out.print(6);
        } else if (Character.toString(strChar).matches("[pqrs]")) {
            System.out.print(7);
        } else if (Character.toString(strChar).matches("[tuv]")) {
            System.out.print(8);
        } else if (Character.toString(strChar).matches("[wxyz]")) {
            System.out.print(9);
        } else {
            System.out.print(strChar);
        }
    }

    public static void mapBySwitchCase(char strChar) {
        switch (strChar) {
            case 'a', 'b', 'c' -> System.out.print(2);
            case 'd', 'e', 'f' -> System.out.print(3);
            case 'g', 'h', 'i' -> System.out.print(4);
            case 'j', 'k', 'l' -> System.out.print(5);
            case 'm', 'n', 'o' -> System.out.print(6);
            case 'p', 'q', 'r', 's' -> System.out.print(7);
            case 't', 'u', 'v' -> System.out.print(8);
            case 'w', 'x', 'y', 'z' -> System.out.print(9);
            default -> System.out.print(strChar);
        }
    }
}
