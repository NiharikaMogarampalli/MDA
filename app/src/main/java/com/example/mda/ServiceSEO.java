package com.example.mda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ServiceSEO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_s_e_o);
    }

    public void gotoservicesform(View view) {
        startActivity(new Intent(ServiceSEO.this,FormActivity.class));
    }
}