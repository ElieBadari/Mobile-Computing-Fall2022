package com.elieb.moneyswap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logIn(View v){

        EditText user = findViewById(R.id.username);
        EditText pass = findViewById(R.id.password);

        String username = user.getText().toString();
        String password = pass.getText().toString();

        if(username.equals("user.leb") && password.equals("123456")){
//            logged in
//            Intent i = new Intent(getApplicationContext(), );
//            startActivity(i);

        }else{
//            incorrect credentials
            
        }





    }

}