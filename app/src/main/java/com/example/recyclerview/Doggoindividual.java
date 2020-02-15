package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Doggoindividual extends AppCompatActivity {

    TextView name,breed;
    ImageView dogpic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doggoindividual);

        name = findViewById(R.id.nameid);
        breed = findViewById(R.id.breedid);
        dogpic = findViewById(R.id.doggo);

        name.setText(getIntent().getStringExtra("namekey"));
        breed.setText(getIntent().getStringExtra("breedkey"));
        int id = getIntent().getIntExtra("imageid",0);
        dogpic.setImageResource(id);

    }
}
