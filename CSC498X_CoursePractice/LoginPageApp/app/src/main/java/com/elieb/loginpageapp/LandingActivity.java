package com.elieb.loginpageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        Intent i = getIntent();
        String email = i.getStringExtra("email");
        Toast.makeText(this, email,Toast.LENGTH_SHORT).show();




    }
}