package designpatterns.observer.demo;

public class OctalObserver extends Observer {
    private String octal;

    public OctalObserver(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    public void update() {
        this.octal = decToOct(subject.getState());
    }

    private String decToOct(int decimal) {
        StringBuilder out = new StringBuilder();
        int lastDigit;
        while (decimal > 0) {
            lastDigit = decimal % 8;
            out.insert(0, lastDigit);
            decimal = decimal / 8;
        }
        return out.toString();
    }

    public String toString() {
        return octal;
    }
}
