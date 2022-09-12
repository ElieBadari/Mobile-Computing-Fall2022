package com.elieb.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean is_happy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        is_happy = true;

    }

    public void toggle(View v){
        ImageView happy = (ImageView) findViewById(R.id.happy);
        ImageView sad = (ImageView) findViewById(R.id.sad);

        if(is_happy){
            happy.setVisibility(View.INVISIBLE);
            sad.setVisibility(View.VISIBLE);
            is_happy = false;
        }
        else{
            happy.setVisibility(View.VISIBLE);
            sad.setVisibility(View.INVISIBLE);
            is_happy = true;
        }
    }

}