package designpatterns.strategy.socialmedia;

public class SocialMediaContext {
    private static SocialMediaContext instance;

    private ISocialMedia smPlatform;

    private SocialMediaContext() {
    }

    public static SocialMediaContext getInstance() {
        if (instance == null) {
            instance = new SocialMediaContext();
        }
        return instance;
    }

    public void setSocialMedia(ISocialMedia smPlatform) {
        this.smPlatform = smPlatform;
    }

    public void connectTo(String name) {
        smPlatform.connectTo(name);
    }
}
