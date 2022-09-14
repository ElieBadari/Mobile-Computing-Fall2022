package com.elieb.moneyswap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (TextView) findViewById(R.id.textView1);
        text1.animate().alpha(0);
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
            text1.animate().alpha(1).setDuration(2000);
//            incorrect credentials

        }





    }

}