package com.example.mym01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainRecyclerView extends AppCompatActivity {

    ArrayList<String> myArrayList = new ArrayList<>(Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter myAdapter = new MyAdapter(this,myArrayList);
        recyclerView.setAdapter(myAdapter);
    }
}
