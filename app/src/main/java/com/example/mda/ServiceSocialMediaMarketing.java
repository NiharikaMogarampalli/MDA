package com.example.mda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ServiceSocialMediaMarketing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_social_media_marketing);
    }

    public void gotoservicesform(View view) {
        startActivity(new Intent(ServiceSocialMediaMarketing.this,FormActivity.class));
    }
}