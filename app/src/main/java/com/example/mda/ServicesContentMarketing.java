package com.example.mda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ServicesContentMarketing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services_content_marketing);
    }

    public void gotoservicesform(View view) {
        startActivity(new Intent(ServicesContentMarketing.this,FormActivity.class));
    }
}