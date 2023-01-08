package designpatterns.visitor.computerpartvisitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
