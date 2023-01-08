package javabasics.lab01.string_and_char;

import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inStr = readString(scan);

        System.out.printf("The equivalent decimal number for octal '%s' is: %s",
                inStr, getDecimal(inStr));
    }

    public static String readString(Scanner scan) {
        String inStr;
        do {
            System.out.print("Enter a Octal string: ");
            inStr = scan.nextLine().toLowerCase();

            if (!isOctal(inStr)) {
                System.out.printf("error: invalid octal string '%s'\n\n", inStr);
            }
        } while (!isOctal(inStr));
        return inStr;
    }

    public static boolean isOctal(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) >= '0' && str.charAt(i) <= '7'))
                return false;
        }
        return true;
    }

    public static int getDecimal(String str) {
        int decimal = Integer.parseInt(String.valueOf(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            decimal = decimal * 8
                    + Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return decimal;
    }
}
