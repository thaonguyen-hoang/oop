package oop.lab05.classes;

public class TestMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial polynomial1 = new MyPolynomial(1, 2, 3);
        System.out.println(polynomial1);
        System.out.println("degree: " + polynomial1.getDegree());

        MyPolynomial polynomial2 = new MyPolynomial(2, -1, 5);
        System.out.println(polynomial2);
        System.out.println("degree: " + polynomial1.getDegree());

        System.out.println("substitute 0.5 into x: " + polynomial1.evaluate(0.5));

        System.out.printf("(%s) + (%s) = (%s)\n", polynomial1, polynomial2,
                polynomial1.add(polynomial2));
        System.out.printf("(%s) x (%s) = (%s)\n", polynomial1, polynomial2,
                polynomial1.multiply(polynomial2));
    }
}
