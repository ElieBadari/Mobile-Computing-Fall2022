package com.elieb.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean is_happy;
    ImageView happy;
    ImageView sad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        is_happy = true;
        happy = (ImageView) findViewById(R.id.happy);
        sad = (ImageView) findViewById(R.id.sad);

    }

    public void toggle(View v){
        //ImageView happy = (ImageView) findViewById(R.id.happy);
        //ImageView sad = (ImageView) findViewById(R.id.sad);

        if(is_happy){
//            happy.setVisibility(View.INVISIBLE);
//            sad.setVisibility(View.VISIBLE);
            happy.animate().alpha(0).setDuration(2000);
            sad.animate().alpha(1).setDuration(2000);
            is_happy = false;
        }
        else{
//            happy.setVisibility(View.VISIBLE);
//            sad.setVisibility(View.INVISIBLE);
            happy.animate().alpha(1).setDuration(2000);
            sad.animate().alpha(0).setDuration(2000);
            is_happy = true;
        }
    }

}