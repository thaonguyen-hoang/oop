package designpatterns.abstractfactory.guifactory;

public class WinCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
