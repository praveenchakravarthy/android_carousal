package com.example.demoapplication.screens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.demoapplication.R;

public class ColorActivity extends AppCompatActivity {

    protected RecyclerView recyclerView;
    protected ColorAdapter colorAdapter;
    protected LinearLayoutManager linearLayoutManager;
    protected String[] hello = { "pc", "cc", "qc", "mc"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        init();
    }


    public void init(){

        recyclerView = findViewById(R.id.recyclerView);

        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        colorAdapter = new ColorAdapter(this, hello, "#ff0000");
        recyclerView.setAdapter(colorAdapter);



    }
}