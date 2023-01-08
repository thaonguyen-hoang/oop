package designpatterns.bridge.operatingsystem;

public class WindowsOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("WindowOS starting up!");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("WindowOS now loading url");
    }
}
