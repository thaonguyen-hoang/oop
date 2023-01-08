package designpatterns.adapter.mediaplayer;

public class Mp4 implements Video {
    private String filename;

    public Mp4(String filename) {
        this.filename = filename;
    }

    @Override
    public void play() {
        System.out.println("Playing .mp4 file: " + filename);
    }
}
