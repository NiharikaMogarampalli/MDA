package com.example.mda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ServiceDigitalMarketing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_digital_marketing);
    }

    public void gotoservicesform(View view) {
        startActivity(new Intent(ServiceDigitalMarketing.this,FormActivity.class));
    }
}