package oop.lab05.classes;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The circle has radius of " + circle1.getRadius()
                + " and area of " + circle1.getArea());

        Circle circle2 = new Circle(2.0);
        System.out.println(circle2);

        Circle circle3 = new Circle();
        circle3.setRadius(5.5);
        System.out.println("radius is " + circle3.getRadius());

        circle3.setColor("green");
        System.out.println("color is " + circle3.getColor());

        System.out.printf("area is: %.2f\n", circle3.getArea());
        System.out.printf("circumference is: %.2f\n", circle3.getCircumference());
    }
}
