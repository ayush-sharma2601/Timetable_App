package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MenuItemRVAdapter adapter;

    ArrayList<MenuItem> itemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addStuff();
        initRecyclerView();
    }

    private void initRecyclerView(){

        recyclerView = findViewById(R.id.recycle);
        adapter = new MenuItemRVAdapter(itemList, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    private void addStuff(){

        String[] names = {"Neo","Bobby", "Raja","Tony","Shony","Babu"};
        String[] breed = {"Labrador","Dalmatian","German Shepherd","Labrador","Dalmatian","Labrador"};
        int id[] ={R.drawable.labrador,R.drawable.dalmatian,R.drawable.germanshephard,R.drawable.labrador,R.drawable.dalmatian,R.drawable.labrador};
        for(int i=0; i<names.length; i++)
        {
            itemList.add(new MenuItem(names[i],breed[i],id[i]));
        }

    }


}
