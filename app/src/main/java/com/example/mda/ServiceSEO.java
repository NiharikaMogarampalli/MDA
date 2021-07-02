package com.example.mda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class ServiceSEO extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_s_e_o);
        videoView=findViewById(R.id.video);

        String path="android.resource://com.example.mda/"+R.raw.seo;
        Uri u= Uri.parse(path);
        videoView.setVideoURI(u);
        videoView.start();
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true

                );
            }
        });
    }

    @Override
    protected void onResume()
    {
        videoView.resume();
        super.onResume();
    }

    @Override
    protected void onPause()
    {
        videoView.suspend();
        super.onPause();
    }

    @Override
    protected void onDestroy()
    {
        videoView.stopPlayback();
        super.onDestroy();
    }

    public void gotoservicesform(View view) {
        startActivity(new Intent(ServiceSEO.this,FormActivity.class));
    }
}