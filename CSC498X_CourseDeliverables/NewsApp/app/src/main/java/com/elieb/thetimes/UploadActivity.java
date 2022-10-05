package com.elieb.thetimes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UploadActivity extends AppCompatActivity {

    EditText article_name,date,location,content;
    Button btn;
    SQLiteDatabase sql;
    String string_article,string_date,string_location,string_content,user;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        article_name = (EditText) findViewById(R.id.article_name);
        date = (EditText) findViewById(R.id.published_at);
        location = (EditText) findViewById(R.id.location);
        content = (EditText) findViewById(R.id.content);
        btn = (Button) findViewById(R.id.submit);

        sql = this.openOrCreateDatabase("thetimesdb", MODE_PRIVATE, null);
        sp = getSharedPreferences("com.elieb.thetimes", Context.MODE_PRIVATE);
        user = sp.getString("com.elieb.thetimes.name","");

        btn.setOnClickListener(view -> {

            string_article = article_name.getText().toString();
            string_date = date.getText().toString();
            string_location = location.getText().toString();
            string_content = content.getText().toString();

            try{
                sql.execSQL("CREATE TABLE IF NOT EXISTS articles (article_name VARCHAR, author VARCHAR, published_at VARCHAR, location VARCHAR, description VARCHAR)");
                sql.execSQL("INSERT INTO articles (article_name, author, published_at, location, description) VALUES (string_article + '',user+'',string_date+'',string_location+'',string_content +'') ");


            }catch (Exception e){
                e.printStackTrace();

            }
            Toast.makeText(this, "Article was successfully uploaded!", Toast.LENGTH_SHORT).show();

            new Handler().postDelayed(()->{
                Intent i = new Intent(getApplicationContext(),NewsActivity.class);
                startActivity(i);

            },2500);



        });


    }



}