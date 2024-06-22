package org.example.structural.adapter.advanced.player;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVideo(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
