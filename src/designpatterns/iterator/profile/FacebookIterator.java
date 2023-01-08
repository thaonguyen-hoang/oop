package designpatterns.iterator.profile;

import java.util.List;

public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String type;
    private String profileId;
    private int currentPosition = 0;
    private Profile[] cache;

    public FacebookIterator(Facebook facebook, String type, String profileId) {
        this.facebook = facebook;
        this.type = type;
        this.profileId = profileId;
    }

    private void lazyLoad() {
        if (cache == null) {
            List<String> profiles = facebook.requestProfileFriendsFromFacebook(this.profileId, this.type);
            cache = new Profile[profiles.size()];
            int i = 0;
            for (String profile : profiles) {
                cache[i++] = facebook.requestProfileFromFacebook(profile);
            }
        }
    }

    @Override
    public boolean hasMore() {
        lazyLoad();
        return currentPosition < cache.length;
    }

    @Override
    public Profile getNext() {
        if (!hasMore()) {
            return null;
        }
        Profile friendContact = cache[currentPosition];
        currentPosition++;
        return friendContact;
    }
}
