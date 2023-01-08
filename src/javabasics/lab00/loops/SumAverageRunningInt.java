package javabasics.lab00.loops;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        int sum = sum(LOWERBOUND, UPPERBOUND);
        double average = average(LOWERBOUND, UPPERBOUND);

        int sumOfSquares = sumOfSquares(LOWERBOUND, UPPERBOUND);

        int sumOdd = sumOfOddNumbers(LOWERBOUND, UPPERBOUND);
        int sumEven = sumOfEvenNumbers(LOWERBOUND, UPPERBOUND);
        int absDiff = abs(sumOdd, sumEven);

        // Print sum and average
        System.out.printf("The sum of %d to %d is %d \n", LOWERBOUND, UPPERBOUND, sum);
        System.out.println("The average is " + average);
        System.out.println("The sum of the squares is " + sumOfSquares);
        System.out.println("The sum of odd numbers is " + sumOdd);
        System.out.println("The sum of even numbers is " + sumEven);
        System.out.println("Their absolute difference is " + absDiff);
    }

    public static int sum(int lowerbound, int upperbound) {
        int sum = 0;
        for (int number = lowerbound; number <= upperbound; number++) {
            sum += number;
        }
        return sum;
    }

    public static double average(int lowerbound, int upperbound) {
        int sum = sum(lowerbound, upperbound);
        int count = (upperbound - lowerbound) + 1;
        return (double) sum / count;
    }

    public static int sumOfSquares(int lowerbound, int upperbound) {
        int sumOfSquares = 0;
        for (int number = lowerbound; number <= upperbound; number++) {
            sumOfSquares += number * number;
        }
        return sumOfSquares;
    }

    public static int sumOfOddNumbers(int lowerbound, int upperbound) {
        int sumOdd = 0;
        while (lowerbound <= upperbound) {
            if (lowerbound % 2 != 0) {
                sumOdd += lowerbound;
            }
            ++lowerbound;
        }
        return sumOdd;
    }

    public static int sumOfEvenNumbers(int lowerbound, int upperbound) {
        int sumEven = 0;
        do {
            if (lowerbound % 2 == 0) {
                sumEven += lowerbound;
            }
            ++lowerbound;
        } while (lowerbound <= upperbound);
        return sumEven;
    }

    public static int abs(int sumOdd, int sumEven) {
        int absDiff;
        if (sumOdd > sumEven) {
            absDiff = sumOdd - sumEven;
        } else {
            absDiff = sumEven - sumOdd;
        }
        return absDiff;
    }
}
