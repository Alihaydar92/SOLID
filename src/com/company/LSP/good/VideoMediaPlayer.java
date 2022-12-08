package com.company.LSP.good;

import com.company.LSP.bad.MediaPlayer;

public class VideoMediaPlayer extends MediaPlayer {
    // Play video implementation
    public void playVideo() {
        System.out.println("Playing video...");
    }
}
