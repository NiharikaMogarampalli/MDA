package com.example.mda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TrainingWebdevelopment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_webdevelopment);
    }

    public void gototrainingsform(View view) {
        startActivity(new Intent(TrainingWebdevelopment.this,FormTrainingActivity.class));
    }
}