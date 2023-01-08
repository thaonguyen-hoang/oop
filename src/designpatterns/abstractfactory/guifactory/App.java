package designpatterns.abstractfactory.guifactory;

public class App {
    private Button button;
    private Checkbox checkbox;

    public App(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
