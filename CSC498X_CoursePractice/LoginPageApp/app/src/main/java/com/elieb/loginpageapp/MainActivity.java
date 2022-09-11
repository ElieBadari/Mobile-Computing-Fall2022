package com.elieb.loginpageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int entries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entries = 0;
    }

    public void login(View view){

        if (entries >= 5){
            Toast.makeText(this, "You are blocked", Toast.LENGTH_LONG).show();
        }
        EditText email = (EditText) findViewById(R.id.email);
        EditText password = (EditText) findViewById(R.id.password);

        String email_val = email.getText().toString();
        String pass_val = password.getText().toString();

        //Toast.makeText(this, email_val, Toast.LENGTH_LONG).show();

        if(email_val.equals("elie.badari@gmail.com") && pass_val.equals("1234")){
            entries = 0;
            Toast.makeText(this, "Logged in",Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getApplicationContext(), LandingActivity.class);
            i.putExtra("email", email_val);
            startActivity(i);

        }
        else{
            entries++;
            Toast.makeText(this, "Wrong credentials", Toast.LENGTH_SHORT).show();
        }

    }

}