package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void open1(View v){
        Intent intent = new Intent(this, Movie1.class);
        String name = ((Button)v).getText().toString();
        intent.putExtra("NAME", name);
        startActivity(intent);
    }

    public void open2(View v){
        Intent intent = new Intent(this, Movie2.class);
        String name = ((Button)v).getText().toString();
        intent.putExtra("NAME", name);
        startActivity(intent);
    }

    public void open3(View v){
        Intent intent = new Intent(this, Movie3.class);
        String name = ((Button)v).getText().toString();
        intent.putExtra("NAME", name);
        startActivity(intent);
    }


}