package designpatterns.adapter.mediaplayer;

import java.util.ArrayList;
import java.util.List;

public class TestMediaPlayer {
    public static void main(String[] args) {
        Video vid1 = new Mp4("alone.mp4");
        Video vid2 = new Vlc("far far away.vlc");

        Audio audio1 = new Mp3("beyond the horizon.mp3");
        Video audioAdapter = new AudioAdapter(audio1);

        List<Video> playlist = new ArrayList<>();
        playlist.add(vid1);
        playlist.add(vid2);
        playlist.add(audioAdapter);

        for (Video video : playlist) {
            video.play();
        }
    }
}
