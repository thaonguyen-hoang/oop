package javabasics.lab00.loops;

public class HarmonicSum {
    public static void main(String[] args) {
        final int MAX_DENOMINATOR = 50000;

        double sumL2R;
        double sumR2L;
        double absDiff;

        sumL2R = sumL2R(MAX_DENOMINATOR);
        System.out.println("The sum from left-to-right is " + sumL2R);

        sumR2L = sumR2L(MAX_DENOMINATOR);
        System.out.println("The sum from right-to-left is " + sumR2L);

        absDiff = abs(sumL2R, sumR2L);
        System.out.println("The absolute difference is " + absDiff);
    }

    public static double sumL2R(int maxDenominator) {
        double sumL2R = 0;
        for (int denominator = 1; denominator <= maxDenominator; denominator++) {
            sumL2R += (double) 1 / denominator;
        }
        return sumL2R;
    }

    public static double sumR2L(int maxDenominator) {
        double sumR2L = 0;
        for (int denominator = maxDenominator; denominator >= 1; denominator--) {
            sumR2L += (double) 1 / denominator;
        }
        return sumR2L;
    }

    public static double abs(double sumL2R, double sumR2L) {
        double absDiff;
        if (sumL2R > sumR2L) {
            absDiff = sumL2R - sumR2L;
        } else {
            absDiff = sumR2L - sumL2R;
        }
        return absDiff;
    }

}
