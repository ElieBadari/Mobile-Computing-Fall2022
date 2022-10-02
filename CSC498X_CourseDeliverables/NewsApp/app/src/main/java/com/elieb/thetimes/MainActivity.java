package com.elieb.thetimes;

import androidx.appcompat.app.AppCompatActivity;



import android.os.Bundle;

import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageView icon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        icon = (ImageView) findViewById(R.id.icon);
        icon.animate().rotationY(360);







    }
}