package oop.lab05.classes;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("(").append(real);
        if (Double.compare(imag, 0) >= 0) {
            description.append(" + ");
        } else {
            description.append(" - ");
        }
        description.append(Math.abs(imag)).append("i").append(")");
        return description.toString();
    }

    public boolean isReal() {
        return Double.compare(imag, 0.0) == 0;
    }

    public boolean isImaginary() {
        return Double.compare(real, 0.0) == 0;
    }

    public boolean equals(double real, double imag) {
        return (Double.compare(this.real, real) == 0)
                && (Double.compare(this.imag, imag) == 0);
    }

    public boolean equals(MyComplex another) {
        return (Double.compare(this.real, another.real) == 0)
                && (Double.compare(this.imag, another.imag) == 0);
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        return Math.atan2(imag, real);
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex sum = new MyComplex();
        sum.setReal(this.real + right.real);
        sum.setImag(this.imag + right.imag);
        return sum;
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        MyComplex sum = new MyComplex();
        sum.setReal(this.real - right.real);
        sum.setImag(this.imag - right.imag);
        return sum;
    }

    public MyComplex multiply(MyComplex right) {
        this.real = this.real * right.real - this.imag * right.imag;
        this.imag = this.real * right.imag + this.imag * right.real;
        return this;
    }

    public MyComplex multiplyNew(MyComplex right) {
        double productReal = this.real * right.real - this.imag * right.imag;
        double productImag = this.real * right.imag + this.imag * right.real;
        return new MyComplex(productReal, productImag);
    }

    public MyComplex divide(MyComplex right) {
        double divisor = right.real * right.real + right.imag * right.imag;
        this.real = (this.real * right.real + this.imag * right.imag) / divisor;
        this.imag = (this.imag * right.real - this.real * right.imag) / divisor;
        return this;
    }

    public MyComplex divideNew(MyComplex right) {
        double divisor = right.real * right.real + right.imag * right.imag;
        double quotientReal = (this.real * right.real + this.imag * right.imag) / divisor;
        double quotientImag = (this.imag * right.real - this.real * right.imag) / divisor;
        return new MyComplex(quotientReal, quotientImag);
    }

    public MyComplex conjugate() {
        imag = -imag;
        return this;
    }
}
