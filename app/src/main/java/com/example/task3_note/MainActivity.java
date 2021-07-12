package com.example.task3_note;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements ViewInterface.MainActivity{

    private RecyclerView List;
    private Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List = findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        List.setLayoutManager(layoutManager);
        List.setHasFixedSize(true);

        adapter = new Adapter(10, this);
        List.setAdapter(adapter);
    }

    public void info_note(){
        Intent intent = new Intent(MainActivity.this, info_note.class);
        startActivity(intent);
    }

}