package javabasics.lab03;

public class TestMatrix {
    public static void main(String[] args) {
        testIntMatrix();
        testDoubleMatrix();
    }

    public static void testIntMatrix() {
        System.out.println("Enter values for matrix A:");
        int[][] matrixA = Matrix.createRandomIntMatrix(2, 3);
        System.out.println("Enter values for matrix B:");
        int[][] matrixB = new int[2][3];
        Matrix.createRandomIntMatrix(matrixB);

        System.out.println("Matrix A:");
        Matrix.print(matrixA);
        System.out.println();

        System.out.println("Matrix B:");
        Matrix.print(matrixB);
        System.out.println();

        System.out.println("A + B =");
        Matrix.print(Matrix.add(matrixA, matrixB));
        System.out.println();

        System.out.println("A - B =");
        Matrix.print(Matrix.subtract(matrixA, matrixB));
        System.out.println();

        System.out.println("A * B =");
        Matrix.print(Matrix.multiply(matrixA, matrixB));
    }

    public static void testDoubleMatrix() {
        System.out.println("Enter values for matrix C:");
        double[][] matrixC = Matrix.createRandomDoubleMatrix(2, 3);
        System.out.println("Enter values for matrix D:");
        double[][] matrixD = new double[3][3];
        Matrix.createRandomDoubleMatrix(matrixD);

        System.out.println("Matrix C:");
        Matrix.print(matrixC);
        System.out.println();

        System.out.println("Matrix D:");
        Matrix.print(matrixD);
        System.out.println();

        System.out.println("C + D =");
        Matrix.print(Matrix.add(matrixC, matrixD));
        System.out.println();

        System.out.println("C - D =");
        Matrix.print(Matrix.subtract(matrixC, matrixD));
        System.out.println();

        System.out.println("C * D =");
        Matrix.print(Matrix.multiply(matrixC, matrixD));
    }
}
