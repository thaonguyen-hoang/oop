package javabasics.lab01.string_and_char;

import java.util.Scanner;

public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the radix: ");
        int radix = Integer.parseInt(scan.nextLine());

        String inStr = readString(scan, radix);
        String lowerStr = inStr.toLowerCase();

        System.out.printf("The equivalent decimal number for '%s' is: %s\n", inStr, toDecimal(lowerStr, radix));
    }

    public static String readString(Scanner scan, int radix) {
        String str;
        String lowerStr;
        do {
            System.out.print("Enter the string: ");
            str = scan.nextLine();
            lowerStr = str.toLowerCase();

            if (!isValid(lowerStr, radix)) {
                System.out.printf("error: invalid string '%s'\n", str);
            }
        } while (!isValid(lowerStr, radix));
        return str;
    }

    public static boolean isValid(String lowerStr, int radix) {
        for (int i = 0; i < lowerStr.length(); i++) {
            if (toRadixDigit(lowerStr.charAt(i)) > radix - 1)
                return false;
        }
        return true;
    }

    public static int toRadixDigit(char inChar) {
        final String HEX_DIGITS = "0123456789abcdef";
        return HEX_DIGITS.indexOf(inChar);
    }

    public static int toRadixDigit2(char inChar) {
        if (inChar >= '0' && inChar <= '9') {
            return inChar - '0';
        } else {
            return inChar - 'a' + 10;
        }
    }

    public static int toDecimal(String lowerStr, int radix) {
        int decimal = 0;
        for (int i = 0; i < lowerStr.length(); i++) {
            decimal = decimal * radix + toRadixDigit(lowerStr.charAt(i));
        }
        return decimal;
    }
}