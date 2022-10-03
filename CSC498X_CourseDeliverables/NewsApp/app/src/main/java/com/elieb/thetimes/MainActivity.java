package com.elieb.thetimes;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText name;
    String user;
    Button btn;
    SharedPreferences sp;
    String name_str;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sp = getSharedPreferences("com.elieb.thetimes",Context.MODE_PRIVATE);

        name = findViewById(R.id.name);
        user = name.getText().toString();
        btn = findViewById(R.id.save);

        btn.setOnClickListener(view -> {
            name_str = name.getText().toString();
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("com.elieb.thetimes.name",name_str);
            editor.apply();
            Toast.makeText(getApplicationContext(), "Information Saved, Welcome!", Toast.LENGTH_SHORT).show();

            new Handler().postDelayed( () -> {
                Intent i = new Intent(getApplicationContext(),NewsActivity.class);
                startActivity(i);
            },2000);



        });

    }


}