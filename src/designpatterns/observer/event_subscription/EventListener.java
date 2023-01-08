package designpatterns.observer.event_subscription;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
