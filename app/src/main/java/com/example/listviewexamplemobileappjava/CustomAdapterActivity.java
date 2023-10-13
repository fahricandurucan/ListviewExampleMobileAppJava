package com.example.listviewexamplemobileappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {

     final List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

        animals.add(new Animal("Cat",R.drawable.cat));
        animals.add(new Animal("Dog",R.drawable.dog));

        final ListView listView = findViewById(R.id.listview);
        AnimalAdapter animalAdapter = new AnimalAdapter(this,animals);
        listView.setAdapter(animalAdapter);







    }
}