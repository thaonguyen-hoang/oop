package designpatterns.bridge.controlremote;

public class App {
    public static void main(String[] args) {
        Device tv = new TV();
        BasicRemote basicRemote = new BasicRemote(tv);
        basicRemote.togglePower();
        basicRemote.volumeUp();
        basicRemote.channelUp();
        tv.printStatus();

        Device radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.togglePower();
        advancedRemote.channelDown();
        advancedRemote.mute();
        radio.printStatus();
    }
}
