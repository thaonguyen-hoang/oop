package designpatterns.visitor.computerpartvisitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        Mouse mouse = new Mouse();
        Monitor monitor = new Monitor();
        Computer computer = new Computer(new ComputerPart[]{keyboard, mouse, monitor});

        ComputerPartVisitor visitor = new ComputerPartDisplayVisitor();
        keyboard.accept(visitor);
        monitor.accept(visitor);
        mouse.accept(visitor);
        computer.accept(visitor);
    }
}
