package javabasics.lab02.array;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scan.nextInt();
        scan.close();

        System.out.printf("The equivalent hexadecimal number is %s\n", toHex(decimal));
    }

    public static String toHex(int decimal) {
        final String HEX_CHARS = "0123456789ABCDEF";
        int remainder;
        StringBuilder hexa = new StringBuilder();
        while (decimal > 0) {
            remainder = decimal % 16;
            hexa.insert(0, HEX_CHARS.charAt(remainder));
            decimal = decimal / 16;
        }
        return hexa.toString();
    }
}
