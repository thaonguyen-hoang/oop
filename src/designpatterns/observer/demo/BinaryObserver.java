package designpatterns.observer.demo;

public class BinaryObserver extends Observer {
    private String binary;

    public BinaryObserver(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    public void update() {
        this.binary = decToBin(subject.getState());
    }

    private String decToBin(int decimal) {
        StringBuilder out = new StringBuilder();
        int lastDigit;
        while (decimal > 0) {
            lastDigit = decimal % 2;
            out.insert(0, lastDigit);
            decimal = decimal / 2;
        }
        return out.toString();
    }

    public String toString() {
        return binary;
    }
}
