package oop.lab06.inheritance.shape;

public class TestShape {
    private int capability;
    private Shape[] shapes;
    private int availableIndex;

    public TestShape() {
        this.capability = 10;
        shapes = new Shape[this.capability];
        availableIndex = 0;
    }

    public static void main(String[] args) {
        TestShape testShape = new TestShape();

        Circle shape1 = new Circle();
        testShape.add(shape1);

        Rectangle shape2 = new Rectangle();
        testShape.add(shape2);

        Cylinder shape3 = new Cylinder();
        testShape.add(shape3);

        Square shape4 = new Square(1.3);
        testShape.add(shape4);
        System.out.println(shape4.getSide());
        shape4.setLength(4);
        System.out.println(shape4.getWidth());

        testShape.printArea();
    }

    public void add(Shape shape) {
        shapes[availableIndex] = shape;
        availableIndex++;
    }

    public Square[] filterSquare() {
        Square[] squares = new Square[this.shapes.length];
        int appendIndex = 0;
        for (int i = 0; i < availableIndex; i++) {
            if (shapes[i] instanceof Square) {
                squares[appendIndex] = (Square) shapes[i];
            }
        }
        return squares;
    }

    public void printArea() {
        for (int i = 0; i < availableIndex; i++) {
            System.out.println(shapes[i].getArea());
        }
    }
}
