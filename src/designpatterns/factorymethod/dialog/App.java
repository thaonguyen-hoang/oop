package designpatterns.factorymethod.dialog;

public class App {
    public static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Window 10")) {
            dialog = new WindowDialog();
        } else {
            dialog = new WebDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
