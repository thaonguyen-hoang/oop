package designpatterns.abstractfactory.guifactory;

public class WinButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
