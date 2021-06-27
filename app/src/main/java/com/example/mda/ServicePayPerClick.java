package com.example.mda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ServicePayPerClick extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_pay_per_click);
    }

    public void gotoservicesform(View view) {
        startActivity(new Intent(ServicePayPerClick.this,FormActivity.class));
    }
}