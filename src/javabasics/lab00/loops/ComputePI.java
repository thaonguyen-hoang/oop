package javabasics.lab00.loops;

public class ComputePI {
    public static void main(String[] args) {
        final int MAX_DENOMINATOR = 10000;
        double piComputed;
        piComputed = computePI(MAX_DENOMINATOR);

        System.out.printf("PI with maximum denominator of %d is %f \n", MAX_DENOMINATOR, piComputed);
        System.out.println("The accuracy is " + checkAccuracy(piComputed) + "%");

        final int MAX_TERM = 10000;
        double piComputed2;
        piComputed2 = computePI2(MAX_TERM);

        System.out.printf("PI with maximum term of %d is %f \n", MAX_TERM, piComputed);
        System.out.println("The accuracy is " + checkAccuracy(piComputed2) + "%");
    }

    // Compute PI using given formula
    public static double computePI(int maxDenominator) {
        double sum = 0.0;
        for (int denominator = 1; denominator <= maxDenominator; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += (double) 1 / denominator;
            } else if (denominator % 4 == 3) {
                sum -= (double) 1 / denominator;
            } else {
                System.out.println("Impossible!");
            }
        }
        return 4 * sum;
    }

    // Compare the value obtained with the Math.PI
    public static double checkAccuracy(double piComputed) {
        return (piComputed / Math.PI) * 100;
    }

    public static double computePI2(int maxTerm) {
        double sum = 0.0;
        for (int term = 1; term <= maxTerm; term++) {
            if (term % 2 != 0) {
                sum += (double) 1 / (term * 2 - 1);
            } else {
                sum -= (double) 1 / (term * 2 - 1);
            }
        }
        return 4 * sum;
    }
}
