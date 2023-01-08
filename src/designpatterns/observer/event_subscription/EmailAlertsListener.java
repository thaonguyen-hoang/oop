package designpatterns.observer.event_subscription;

import java.io.File;

public class EmailAlertsListener implements EventListener {
    private String email;

    public EmailAlertsListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email
                + ": Someone has performed " + eventType
                + " operation with the following file: " + file.getName());
    }
}
