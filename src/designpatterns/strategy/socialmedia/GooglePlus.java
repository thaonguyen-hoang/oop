package designpatterns.strategy.socialmedia;

public class GooglePlus implements ISocialMedia {
    @Override
    public void connectTo(String friendName) {
        System.out.println("Connecting with " + friendName +
                " through GooglePlus...");
    }
}
