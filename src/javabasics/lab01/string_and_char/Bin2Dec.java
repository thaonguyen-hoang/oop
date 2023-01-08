package javabasics.lab01.string_and_char;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = readInput(scan);

        System.out.printf("The equivalent decimal number for binary '%s' is: %s\n",
                str, getDecimal(Integer.parseInt(str)));
        System.out.printf("The equivalent decimal number for binary '%s' is: %s\n",
                str, getDecimal(str));
    }

    public static String readInput(Scanner scan) {
        String str;
        do {
            System.out.print("Enter a Binary string: ");
            str = scan.nextLine();

            if (!isBinary(str))
                System.out.printf("error: invalid binary string '%s'\n\n", str);
        } while (!isBinary(str));
        return str;
    }

    public static boolean isBinary(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0' && str.charAt(i) != '1')
                return false;
            }
        return true;
    }

    public static int getDecimal(int bin) {
        int power = 1;
        int decimal = 0;

        while (bin > 0) {
            decimal += (bin % 10) * power;
            power = power * 2;
            bin = bin / 10;
        }
        return decimal;
    }
    public static int getDecimal(String str) {
        int decimal = Integer.parseInt(String.valueOf(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            decimal = decimal * 2 +
                    Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return decimal;
    }
}
