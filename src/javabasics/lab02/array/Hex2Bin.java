package javabasics.lab02.array;

import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Hexadecimal string: ");
        String hexa = scan.nextLine().toLowerCase();
        scan.close();

        System.out.printf("The equivalent binary for hexadecimal '%s' is: ", hexa);
        toBin(hexa);
    }

    public static int valueOf(char inChar) {
        final String HEX_DIGITS = "0123456789abcdef";
        return HEX_DIGITS.indexOf(inChar);
    }

    public static void toBin(String hexa) {
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};

        for (int i = 0; i < hexa.length(); i++) {
            System.out.print(HEX_BITS[valueOf(hexa.charAt(i))] + " ");
        }
    }
}
