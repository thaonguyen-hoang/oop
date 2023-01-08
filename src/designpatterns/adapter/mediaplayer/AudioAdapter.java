package designpatterns.adapter.mediaplayer;

public class AudioAdapter implements Video {
    private Audio audio;

    public AudioAdapter(Audio audio) {
        this.audio = audio;
    }

    @Override
    public void play() {
        audio.play();
    }
}
