package designpatterns.strategy.socialmedia;

public class TestSocialMedia {
    public static void main(String[] args) {
        SocialMediaContext context = SocialMediaContext.getInstance();

        int platform = 3;
        if (platform == 1) {
            context.setSocialMedia(new Facebook());
        } else if (platform == 2) {
            context.setSocialMedia(new GooglePlus());
        } else {
            context.setSocialMedia(new Twitter());
        }
        context.connectTo("Lily");
    }
}
