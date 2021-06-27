package com.example.mda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ServicesActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RvAdapter rvAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        ArrayList<RvModel> item=new ArrayList<>();
        item.add(new RvModel(R.drawable.service1,"Social Media Marketing",R.drawable.doublearrow));
        item.add(new RvModel(R.drawable.service2,"Digital Marketing",R.drawable.doublearrow));
        item.add(new RvModel(R.drawable.service3,"Search Engine Optimiztion",R.drawable.doublearrow));
        item.add(new RvModel(R.drawable.service4,"Content Marketing",R.drawable.doublearrow));
        item.add(new RvModel(R.drawable.service5,"Google Ads",R.drawable.doublearrow));
        item.add(new RvModel(R.drawable.service6,"Pay per Click",R.drawable.doublearrow));
        item.add(new RvModel(R.drawable.service7,"Let us Grow your business",R.drawable.doublearrow));

        recyclerView=findViewById(R.id.rv);
        rvAdapter=new RvAdapter(ServicesActivity.this,item);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(rvAdapter);

    }
}