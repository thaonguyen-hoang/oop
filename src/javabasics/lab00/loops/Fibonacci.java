package javabasics.lab00.loops;

public class Fibonacci {
    public static void main(String[] args) {
        int nMax = 20;
        System.out.println("The first " + nMax + " Fibonacci numbers are: ");
        System.out.println("The average is " + fibonacciSeries(nMax));
    }

    public static double fibonacciSeries(int numTerm) {
        int fnMinus2 = 0; // f(0)
        int fnMinus1 = 1; // f(1)
        System.out.print(fnMinus2 + " " + fnMinus1 + " ");

        int sum = fnMinus1 + fnMinus2;
        int n = 2;
        while (n < numTerm) {
            int fn = fnMinus1 + fnMinus2;
            System.out.print(fn + " ");
            sum += fn;
            ++n;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }
        System.out.println();
        return (double) sum / numTerm;
    }
}
