package oop.lab08.resizable_object;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("ResizableCircle[")
                .append(super.toString()).append("]");
        return description.toString();
    }

    @Override
    public void resize(int percent) {
        radius *= percent / 100.0;
    }
}
