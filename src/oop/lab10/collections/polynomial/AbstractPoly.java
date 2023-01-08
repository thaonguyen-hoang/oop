package oop.lab10.collections.polynomial;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    public AbstractPoly() {
    }

    double[] derive() {
        if (degree() == 0) {
            return new double[]{0};
        }
        double[] derivedCoeffs = new double[degree()];
        for (int i = 0; i < degree(); i++) {
            derivedCoeffs[i] = coefficients()[i + 1] * (i + 1);
        }
        return derivedCoeffs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        Poly poly = (Poly) o;
        if (degree() != poly.degree()) {
            return false;
        }
        for (int i = 0; i <= degree(); i++) {
            if (Double.compare(coefficients()[i], poly.coefficients()[i]) != 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(String.valueOf(coefficients()[0]));
        for (int i = 1; i <= degree(); i++) {
            if (coefficients()[i] < 0) {
                sb.append(String.format(" - %.1fx^%d", Math.abs(coefficients()[i]), i));
            } else if (coefficients()[i] > 0) {
                sb.append(String.format(" + %.1fx^%d", coefficients()[i], i));
            }
        }
        return sb.toString();
    }
}
