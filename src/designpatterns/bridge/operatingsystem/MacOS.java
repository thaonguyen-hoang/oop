package designpatterns.bridge.operatingsystem;

public class MacOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("MacOS starting up!");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("MacOS now loading url");
    }
}
