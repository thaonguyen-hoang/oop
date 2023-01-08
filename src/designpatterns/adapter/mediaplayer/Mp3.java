package designpatterns.adapter.mediaplayer;

public class Mp3 implements Audio {
    private String filename;

    public Mp3(String filename) {
        this.filename = filename;
    }

    @Override
    public void play() {
        System.out.println("Playing .mp3 file: " + filename);
    }
}
