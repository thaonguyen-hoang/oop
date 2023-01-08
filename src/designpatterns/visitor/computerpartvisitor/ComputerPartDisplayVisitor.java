package designpatterns.visitor.computerpartvisitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Computer turned on");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Mouse enabled");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Keyboard enabled");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Monitor turned on");
    }
}
