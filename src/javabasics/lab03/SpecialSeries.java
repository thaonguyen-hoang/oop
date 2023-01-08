package javabasics.lab03;

public class SpecialSeries {
    public static void main(String[] args) {
        double x = 1;
        int numTerms = 5;
        System.out.println("Special series = " + specialSeries(x, numTerms));
    }

    public static double specialSeries(double x, int numTerms) {
        double sum = 0;
        double coefficient = 1;
        double term = 1;

        for (int i = 1; i <= numTerms * 2 - 1; i++) {
            term = term * x;
            if (i % 2 == 1) {
                sum += coefficient * term / i;
                coefficient = coefficient * i;
            } else {
                coefficient = coefficient / i;
            }
        }
        return sum;
    }
}
