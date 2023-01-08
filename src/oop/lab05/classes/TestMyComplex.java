package oop.lab05.classes;

import java.util.Scanner;

public class TestMyComplex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        MyComplex complex1 = readInput(scan);
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        MyComplex complex2 = readInput(scan);
        System.out.println();

        System.out.println("Number 1 is: " + complex1);
        isPureReal(complex1);
        isPureImag(complex1);
        System.out.println();

        System.out.println("Number 2 is: " + complex2);
        isPureReal(complex2);
        isPureImag(complex2);
        System.out.println();

        isEqual(complex1, complex2);
        System.out.println();

        execute("add", complex1, complex2);
        execute("subtract", complex1, complex2);
        execute("multiply", complex1, complex2);
        execute("divide", complex1, complex2);

        execute("magnitude", complex1);
        execute("argument", complex1);
        execute("conjugate", complex1);
    }

    public static MyComplex readInput(Scanner scan) {
        double real = scan.nextDouble();
        double imag = scan.nextDouble();
        return new MyComplex(real, imag);
    }

    public static void isPureReal(MyComplex complex) {
        if (complex.isReal()) {
            System.out.println(complex + " is a pure real number");
        } else {
            System.out.println(complex + " is NOT a pure real number");
        }
    }

    public static void isPureImag(MyComplex complex) {
        if (complex.isImaginary()) {
            System.out.println(complex + " is a pure imaginary number");
        } else {
            System.out.println(complex + " is NOT a pure imaginary number");
        }
    }

    public static void isEqual(MyComplex complex1, MyComplex complex2) {
        if (complex1.equals(complex2)) {
            System.out.println(complex1 + " is equal to" + complex2);
        } else {
            System.out.println(complex1 + " is NOT equal to " + complex2);
        }
    }

    public static void execute(String operation, MyComplex complex1, MyComplex complex2) {
        if (operation.equalsIgnoreCase("add")) {
            MyComplex sum = complex1.addNew(complex2);
            System.out.println(complex1 + " + " + complex2 + " = " + sum);
        } else if (operation.equalsIgnoreCase("subtract")) {
            MyComplex diff = complex1.subtractNew(complex2);
            System.out.println(complex1 + " - " + complex2 + " = " + diff);
        } else if (operation.equalsIgnoreCase("multiply")) {
            MyComplex product = complex1.multiplyNew(complex2);
            System.out.println(complex1 + " x " + complex2 + " = " + product);
        } else if (operation.equalsIgnoreCase("divide")) {
            MyComplex quotient = complex1.divideNew(complex2);
            System.out.println(complex1 + " x " + complex2 + " = " + quotient);
        }
    }

    public static void execute(String operation, MyComplex complex) {
        if (operation.equalsIgnoreCase("magnitude")) {
            System.out.printf("magnitude: %.2f\n", complex.magnitude());
        } else if (operation.equalsIgnoreCase("argument")) {
            System.out.printf("argument: %.2f\n", complex.argument());
        } else if (operation.equalsIgnoreCase("conjugate")) {
            System.out.println("conjugate: " + complex.conjugate());
        }
    }
}
