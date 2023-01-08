package designpatterns.observer.demo;

public class HexaObserver extends Observer {
    private String hexa;

    public HexaObserver(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    public void update() {
        this.hexa = decToOct(subject.getState());
    }

    private String decToOct(int decimal) {
        final String DIGITS = "0123456789abcdef";
        StringBuilder out = new StringBuilder();

        int lastDigit;
        while (decimal > 0) {
            lastDigit = decimal % 16;
            out.insert(0, DIGITS.charAt(lastDigit));
            decimal = decimal / 16;
        }
        return out.toString();
    }

    public String toString() {
        return hexa;
    }
}
