package javabasics.lab03;

public class TrigonometricSeries {
    public static void main(String[] args) {
        double x = Math.PI / 2;
        int numTerms = 20;

        double computedSin = sin(x, numTerms);
        System.out.println("Computed sin = " + computedSin);
        System.out.println("Math.sin() = " + Math.sin(x));

        double computedCos = cos(x, numTerms);
        System.out.println("Computed cos = " + computedCos);
        System.out.println("Math.cos() = " + Math.cos(x));
    }

    public static double sin(double x, int numTerms) {
        double sin = 0;
        double term = 1;

        for (int i = 1; i <= numTerms * 2 - 1; i++) {
            term =  term * x / i;
            if (i % 4 == 1) {
                sin += term;
            } else if (i % 4 == 3) {
                sin -= term;
            }
        }
        return sin;
    }

    public static double cos(double x, int numTerms) {
        double cos = 1;
        double term = 1;

        for (int i = 1; i < numTerms * 2 - 1; i++) {
            term = term * x / i;
            if (i % 4 == 2) {
                cos -= term;
            } else if (i % 4 == 0) {
                cos += term;
            }
        }
        return cos;
    }
}
