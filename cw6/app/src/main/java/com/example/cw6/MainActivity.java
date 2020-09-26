package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Movie x = new Movie("harry potter","Daniel Radcliffe",1.5,1,"acshen");
        Movie n = new Movie("marvel","Robert Downey",3.4,1,"acshen");


    }
}