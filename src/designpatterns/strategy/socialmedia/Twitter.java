package designpatterns.strategy.socialmedia;

public class Twitter implements ISocialMedia {
    @Override
    public void connectTo(String friendName) {
        System.out.println("Connecting with " + friendName +
                " through Twitter...");
    }
}
