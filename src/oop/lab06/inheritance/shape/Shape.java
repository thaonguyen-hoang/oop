package oop.lab06.inheritance.shape;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return 0.0;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Shape[color = ").append(color)
                .append(", filled = ").append(filled).append("]");
        return description.toString();
    }
}
