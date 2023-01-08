package javabasics.lab01.string_and_char;

import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inStr = readString(scan);

        System.out.printf("The equivalent decimal number for hexadecimal '%s' is: %s\n",
                inStr, getDecimal(inStr));
    }

    public static String readString(Scanner scan) {
        String inStr;
        do {
            System.out.print("Enter a Hexadecimal string: ");
            inStr = scan.nextLine().toLowerCase();

            if (!isHexa(inStr)) {
                System.out.printf("error: invalid hexadecimal string '%s'\n\n", inStr);
            }
        } while (!isHexa(inStr));
        return inStr;
    }

    public static boolean isHexa(String lowerStr) {
        for (int i = 0; i < lowerStr.length(); i++) {
            if (!((Character.isDigit(lowerStr.charAt(i)))
                || (lowerStr.charAt(i) >= 'a' && lowerStr.charAt(i) <= 'f')))
                return false;
        }
        return true;
    }

    public static boolean isHexa2(String lowerStr) {
        final String HEX_DIGITS = "0123456789abcdef";
        for (int i = 0; i < lowerStr.length(); i++) {
            if (HEX_DIGITS.indexOf(lowerStr.charAt(i)) == -1)
                return false;
        }
        return true;
    }

    public static int toHexDigit(char inChar) {
        if (inChar >= '0' && inChar <= '9') {
            return inChar - '0';
        } else {
            return inChar - 'a' + 10;
        }
    }

    public static int toHexDigit2(char inChar) {
        final String HEX_DIGITS = "0123456789abcdef";
        return HEX_DIGITS.indexOf(inChar);
    }

    public static int toHexDigit3 (char inChar) {
        return Character.digit(inChar, 16);
    }

    public static int getDecimal(String str) {
        int decimal = toHexDigit(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            decimal = decimal * 16 + toHexDigit(str.charAt(i));
        }
        return decimal;
    }
}
