package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Movie2 extends AppCompatActivity {
    private YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie2);

        youTubePlayerView = findViewById(R.id.activity_main_youtubePlayerView);
        getLifecycle().addObserver(youTubePlayerView);


        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(YouTubePlayer youTubePlayer) {
                String videoId = "yEmcEuS6xm4";
                youTubePlayer.cueVideo(videoId, 0);

            }
        });



        Intent i = getIntent();
        String name = i.getStringExtra("NAME");
        if (name == null) {
            ((TextView) findViewById(R.id.movieName2)).setText("No name");
        } else {
            ((TextView) findViewById(R.id.movieName2)).setText(name);
        }
    }
}