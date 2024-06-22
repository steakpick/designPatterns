package org.example.structural.adapter.advanced.player;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVideo(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }
}
