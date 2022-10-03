package com.elieb.thetimes;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        try{
            SQLiteDatabase sql = this.openOrCreateDatabase("thetimesdb", MODE_PRIVATE, null);
            sql.execSQL("CREATE TABLE IF NOT EXISTS articles (article_name VARCHAR, author VARCHAR, published_at VARCHAR, location VARCHAR, description VARCHAR)");//author, published at, location, description


        }catch(Exception e){
            e.printStackTrace();
        }



    }




}