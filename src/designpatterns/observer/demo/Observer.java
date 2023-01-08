package designpatterns.observer.demo;

public abstract class Observer {
    public Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
    }

    protected abstract void update();
}
