package javabasics.lab03;

import java.util.Random;

public class Matrix {
    public static Random rand = new Random();

    public static void createRandomIntMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = rand.nextInt(20);
            }
        }
    }

    public static int[][] createRandomIntMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = rand.nextInt(20);
            }
        }
        return matrix;
    }

    public static void createRandomDoubleMatrix(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = rand.nextDouble();
            }
        }
    }

    public static double[][] createRandomDoubleMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = rand.nextDouble();
            }
        }
        return matrix;
    }

    public static void print(int[][] matrix) {
        if (matrix != null) {
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col <matrix[row].length; col++) {
                    System.out.print(matrix[row][col] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println();
        }
    }
    public static void print(double[][] matrix) {
        if (matrix != null) {
            for (double[] row : matrix) {
                for (double rowCol : row) {
                    System.out.printf("%.2f ", rowCol);
                }
                System.out.println();
            }
        } else {
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        return ((matrix1.length == matrix2.length) &&
                (matrix1[0].length == matrix2[0].length));
    }
    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        return ((matrix1.length == matrix2.length) &&
                (matrix1[0].length == matrix2[0].length));
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (haveSameDimension(matrix1, matrix2)) {
            int[][] sum = new int[matrix1.length][matrix1[0].length];
            for (int row = 0; row < sum.length; row++) {
                for (int col = 0; col < sum[row].length; col++) {
                    sum[row][col] = matrix1[row][col] + matrix2[row][col];
                }
            }
            return sum;
        } else {
            System.out.println("Matrix addition is not possible. " +
                    "Two matrices must have the same dimension");
            return null;
        }
    }
    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        if (haveSameDimension(matrix1, matrix2)) {
            double[][] sum = new double[matrix1.length][matrix1[0].length];
            for (int row = 0; row < sum.length; row++) {
                for (int col = 0; col < sum[row].length; col++) {
                    sum[row][col] = matrix1[row][col] + matrix2[row][col];
                }
            }
            return sum;
        } else {
            System.out.println("Matrix addition is not possible. " +
                    "Two matrices must have the same dimension");
            return null;
        }
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (haveSameDimension(matrix1, matrix2)) {
            int[][] difference = new int[matrix1.length][matrix1[0].length];
            for (int row = 0; row < difference.length; row++) {
                for (int col = 0; col < difference[row].length; col++) {
                    difference[row][col] = matrix1[row][col] - matrix2[row][col];
                }
            }
            return difference;
        } else {
            System.out.println("Matrix subtraction is not possible. " +
                    "Two matrices must have the same dimension");
            return null;
        }
    }
    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        if (haveSameDimension(matrix1, matrix2)) {
            double[][] difference = new double[matrix1.length][matrix1[0].length];
            for (int row = 0; row < difference.length; row++) {
                for (int col = 0; col < difference[row].length; col++) {
                    difference[row][col] = matrix1[row][col] - matrix2[row][col];
                }
            }
            return difference;
        } else {
            System.out.println("Matrix subtraction is not possible. " +
                    "Two matrices must have the same dimension");
            return null;
        }
    }

    public static boolean isMultipliable(int[][] matrix1, int[][] matrix2) {
        return matrix1[0].length == matrix2.length;
    }

    public static boolean isMultipliable(double[][] matrix1, double[][] matrix2) {
        return matrix1[0].length == matrix2.length;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (isMultipliable(matrix1, matrix2)) {
            int[][] product = new int[matrix1.length][matrix2[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    product[i][j] = 0;
                    for (int k = 0; k < matrix1[0].length; k++) {
                        product[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            return product;
        } else {
            System.out.println("Matrix multiplication is not possible");
            return null;
        }
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (isMultipliable(matrix1, matrix2)) {
            double[][] product = new double[matrix1.length][matrix2[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    product[i][j] = 0;
                    for (int k = 0; k < matrix1[0].length; k++) {
                        product[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            return product;
        } else {
            System.out.println("Matrix multiplication is not possible");
            return null;
        }
    }
}
