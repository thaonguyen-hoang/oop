package designpatterns.command.shutdowncommand;

public class Computer {
    public Computer() {
    }

    public void shutDown() {
        System.out.println("Computer shutting down!");
    }

    public void restart() {
        System.out.println("Computer restarting!");
    }
}