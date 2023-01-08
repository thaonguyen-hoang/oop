package designpatterns.bridge.operatingsystem;

public class Laptop extends Computer {
    public Laptop(OperatingSystem os) {
        super(os);
    }

    @Override
    public void startup() {
        os.startup();
    }

    @Override
    public void browseInternet(String url) {
        os.loadUrl(url);
        System.out.println("Laptop browsing url " + url);
    }

    @Override
    public boolean canMove() {
        return true;
    }
}
