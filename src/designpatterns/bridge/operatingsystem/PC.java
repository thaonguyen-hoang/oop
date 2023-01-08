package designpatterns.bridge.operatingsystem;

public class PC extends Computer {
    public PC(OperatingSystem os) {
        super(os);
    }

    @Override
    public void startup() {
        os.startup();
    }

    @Override
    public void browseInternet(String url) {
        os.loadUrl(url);
        System.out.println("PC browing url " + url);
    }

    @Override
    public boolean canMove() {
        return false;
    }
}
