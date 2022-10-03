package com.elieb.thetimes;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;

public class NewsActivity extends AppCompatActivity {

    ArrayAdapter<String> array_adapter;
    ArrayList<String> article_list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        try{
            SQLiteDatabase sql = this.openOrCreateDatabase("thetimesdb", MODE_PRIVATE, null);
            sql.execSQL("CREATE TABLE IF NOT EXISTS articles (article_name VARCHAR, author VARCHAR, published_at VARCHAR, location VARCHAR, description VARCHAR)");//author, published at, location, description

            sql.execSQL("INSERT INTO articles (article_name, author , published_at , location , description ) VALUES ('I Make Video Games. I Won’t Let My Daughters Play Them.','William Siu','Oct. 2, 2022','https://www.nytimes.com/2022/10/02/opinion/video-game-addiction.html','I didnt see a problem for a long time. I saw our mission as bringing players joy and entertainment. Knowing all of the techniques we used to induce addiction, I realized I didnt want my children to be exposed to that risk. \n')");
            sql.execSQL("INSERT INTO articles (article_name, author , published_at , location , description ) VALUES ('Kim Kardashian to Pay $1.26 Million to Settle S.E.C. Charges Over Crypto Promotion','Matthew Goldstein','Oct. 3, 2022','https://www.nytimes.com/2022/10/02/opinion/video-game-addiction.html','The S.E.C. said Ms. Kardashian did not disclose she had been paid to promote a crypto token sold by EthereumMax.')");

            Cursor c = sql.rawQuery("Select * from articles", null);
            int article_name_index = c.getColumnIndex("article_name");
            c.moveToFirst();

            while(c!= null){
                String name = c.getString(article_name_index);
                article_list.add(name);

            }

        }catch(Exception e){
            e.printStackTrace();
        }



    }




}