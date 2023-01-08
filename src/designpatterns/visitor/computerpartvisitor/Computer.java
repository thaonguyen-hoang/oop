package designpatterns.visitor.computerpartvisitor;

public class Computer implements ComputerPart {
    private ComputerPart[] parts;

    public Computer(ComputerPart[] parts) {
        this.parts = parts;
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
