package designpatterns.adapter.mediaplayer;

public class Vlc implements Video {
    private String filename;

    public Vlc(String filename) {
        this.filename = filename;
    }

    @Override
    public void play() {
        System.out.println("Playing .vlc file: " + filename);
    }
}
