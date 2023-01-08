package javabasics.lab03;

import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Declare variables
        String str;
        String lowerStr;
        int inRadix;
        int outRadix;

        // Prompt and read inputs
        do {
            System.out.print("Enter a number: ");
            str = scan.nextLine();
            lowerStr = str.toLowerCase();

            System.out.print("Enter the input radix: ");
            inRadix = Integer.parseInt(scan.nextLine());
        } while (!isValid(lowerStr, inRadix));

        System.out.print("Enter the output radix: ");
        outRadix = Integer.parseInt(scan.nextLine());

        // Convert number from inRadix to outRadix
        String out = radixMToRadixN(lowerStr, inRadix, outRadix);
        System.out.printf("'%s' in radix %d is '%s' in radix %d", str, inRadix, out, outRadix);
    }

    public static boolean isValid(String lowerIn, int inRadix) {
        for (int i = 0; i < lowerIn.length(); i++) {
            if (toRadixDigit(lowerIn.charAt(i)) > inRadix - 1)
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

    public static int radixNToDec(String lowerStr, int inRadix) {
        int decimal = 0;
        for (int i = 0; i < lowerStr.length(); i++) {
            decimal = decimal * inRadix + toRadixDigit(lowerStr.charAt(i));
        }
        return decimal;
    }

    public static String decToRadixN(int decimal, int outRadix) {
        final String DIGITS = "0123456789abcdef";
        StringBuilder out = new StringBuilder();

        int lastDigit;
        while (decimal > 0) {
            lastDigit = decimal % outRadix;
            out.insert(0, DIGITS.charAt(lastDigit));
            decimal = decimal / outRadix;
        }
        return out.toString();
    }

    public static String radixMToRadixN(String lowerStr, int inRadix, int outRadix) {
        int decimal = radixNToDec(lowerStr, inRadix);
        return decToRadixN(decimal, outRadix);
    }
}
