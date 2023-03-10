package designpatterns.iterator.profile;

import java.util.List;

public class LinkedInIterator implements ProfileIterator {
    private LinkedIn linkedIn;
    private String type;
    private String profileEmail;
    private int currentPosition = 0;
    private Profile[] cache;

    public LinkedInIterator(LinkedIn linkedIn, String type, String profileEmail) {
        this.linkedIn = linkedIn;
        this.type = type;
        this.profileEmail = profileEmail;
    }

    private void lazyLoad() {
        if (cache == null) {
            List<String> profiles = linkedIn.requestRelatedContactsFromLinkedIn(this.profileEmail, this.type);
            cache = new Profile[profiles.size()];
            int i = 0;
            for (String profile : profiles) {
                cache[i++] = linkedIn.requestContactInfoFromLinkedIn(profile);
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
