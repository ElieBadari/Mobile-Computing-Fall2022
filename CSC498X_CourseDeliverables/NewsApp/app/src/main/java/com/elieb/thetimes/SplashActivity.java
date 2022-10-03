package com.elieb.thetimes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;


@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    ImageView icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        icon = (ImageView) findViewById(R.id.icon);
        icon.animate().rotationY(360).setDuration(3000);

        new Handler().postDelayed(() -> {

            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        }, 3500);

    }
}