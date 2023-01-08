package oop.lab10.collections.polynomial;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly {
    List<Double> coefficients;

    public ListPoly(double[] coeffs) {
        coefficients = new ArrayList<>(coeffs.length);
        for (double coeff : coeffs) {
            coefficients.add(coeff);
        }
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(derive());
    }

    @Override
    public double coefficient(int degree) {
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {
        double[] array = new double[coefficients.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = coefficients.get(i);
        }
        return array;
    }
}
