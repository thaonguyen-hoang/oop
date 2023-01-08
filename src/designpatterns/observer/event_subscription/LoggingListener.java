package designpatterns.observer.event_subscription;

import java.io.File;

public class LoggingListener implements EventListener {
    private File log;

    public LoggingListener(String filename) {
        this.log = new File(filename);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log
                + ": Someone has performed " + eventType
                + " operation with the following file " + file.getName());
    }
}
