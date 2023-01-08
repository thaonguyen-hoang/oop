package oop.lab05.classes;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        for (int i = this.getDegree(); i > 0; i--) {
            description.append(coeffs[i])
                    .append("x^")
                    .append(i)
                    .append(" + ");
        }
        description.append(coeffs[0]);
        return description.toString();
    }

    public double evaluate(double x) {
        double polyValue = 0;
        for (int i = this.getDegree(); i >= 0; i--) {
            polyValue = polyValue * x + coeffs[i];
        }
        return polyValue;
    }

    public MyPolynomial add(MyPolynomial another) {
        int sumPolyDegree = Math.max(this.getDegree(), another.getDegree()) + 1;
        double[] sumPolyData = new double[sumPolyDegree];

        for (int i = 0; i <= this.getDegree(); i++) {
            sumPolyData[i] += this.coeffs[i];
        }

        for (int i = 0; i <= another.getDegree(); i++) {
            sumPolyData[i] += another.coeffs[i];
        }

        return new MyPolynomial(sumPolyData);
    }

    public MyPolynomial multiply(MyPolynomial another) {
        int multiPolyDegree = this.getDegree() + another.getDegree();
        double[] multiPolyData = new double[multiPolyDegree + 1];
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= another.getDegree(); j++) {
                multiPolyData[i + j] += this.coeffs[i] * another.coeffs[j];
            }
        }
        return new MyPolynomial(multiPolyData);
    }
}
