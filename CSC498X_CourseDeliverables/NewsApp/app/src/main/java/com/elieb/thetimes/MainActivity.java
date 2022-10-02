package com.elieb.thetimes;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageView icon;
    EditText name;
    String user;
    Button btn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        icon = (ImageView) findViewById(R.id.icon);
        icon.animate().rotationY(360);

        name = (EditText) findViewById(R.id.name);
        user = name.getText().toString();
        btn = (Button) findViewById(R.id.save);

    }



}