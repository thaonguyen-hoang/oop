package designpatterns.bridge.operatingsystem;

public class Client {
    public static void main(String[] args) {
        OperatingSystem macOS = new MacOS();
        OperatingSystem winOS = new WindowsOS();

        Computer laptop1 = new Laptop(macOS);
        laptop1.startup();
        laptop1.browseInternet("google.com");
        System.out.println();

        Computer laptop2 = new Laptop(winOS);
        laptop2.startup();
        laptop2.browseInternet("google.com");
        System.out.println();

        Computer pc1 = new PC(macOS);
        pc1.startup();
        pc1.browseInternet("google.com");
        System.out.println();

        Computer pc2 = new PC(winOS);
        pc2.startup();
        pc2.browseInternet("google.com");
    }
}
