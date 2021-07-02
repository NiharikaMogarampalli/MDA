package com.example.mda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import java.util.ArrayList;

public class TrainingActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private TrainingRvAdapter rvAdapter;
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
        videoView=findViewById(R.id.video);

        String path="android.resource://com.example.mda/"+R.raw.training;
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
        ArrayList<RvModel> item=new ArrayList<>();
        item.add(new RvModel(R.drawable.training1,"Google Ads",R.drawable.doublearrow));
        item.add(new RvModel(R.drawable.training2,"Email Marketing",R.drawable.doublearrow));
        item.add(new RvModel(R.drawable.service6,"Pay per Click",R.drawable.doublearrow));
        item.add(new RvModel(R.drawable.training4,"Youtube Marketing",R.drawable.doublearrow));
        item.add(new RvModel(R.drawable.training5,"Web development",R.drawable.doublearrow));


        recyclerView=findViewById(R.id.rv);
        rvAdapter=new TrainingRvAdapter(TrainingActivity.this,item);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(rvAdapter);

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
}