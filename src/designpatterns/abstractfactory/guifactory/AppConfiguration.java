package designpatterns.abstractfactory.guifactory;

public class AppConfiguration {
    private static App configureApp() {
        App app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WinFactory();
        }
        app = new App(factory);
        return app;
    }

    public static void main(String[] args) {
        App app = configureApp();
        app.paint();
    }
}
