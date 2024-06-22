package org.example.structural.adapter.adapter;

import org.example.structural.adapter.advanced.player.AdvancedMediaPlayer;
import org.example.structural.adapter.advanced.player.Mp4Player;
import org.example.structural.adapter.advanced.player.VlcPlayer;
import org.example.structural.adapter.player.MediaPlayer;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        advancedMediaPlayer.playVideo(fileName);
    }
}
