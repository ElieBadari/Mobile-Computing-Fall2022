package com.elieb.thetimes;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NewsActivity extends AppCompatActivity {

    ArrayAdapter<String> array_adapter;
    ArrayList<String> article_list;
    ListView listview;
    String name;
    int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        listview = findViewById(R.id.listview);
        article_list = new ArrayList<String>();


        try{
            SQLiteDatabase sql = this.openOrCreateDatabase("thetimesdb", MODE_PRIVATE, null);
            sql.execSQL("CREATE TABLE IF NOT EXISTS articles (article_name VARCHAR, author VARCHAR, published_at VARCHAR, location VARCHAR, description VARCHAR)");//author, published at, location, description

            sql.execSQL("INSERT INTO articles (article_name, author , published_at , location , description ) VALUES ('I Make Video Games. I Won’t Let My Daughters Play Them.','William Siu','Oct. 2, 2022','NYTimes','I didnt see a problem for a long time. I saw our mission as bringing players joy and entertainment. Knowing all of the techniques we used to induce addiction, I realized I didnt want my children to be exposed to that risk.')");
            sql.execSQL("INSERT INTO articles (article_name, author , published_at , location , description ) VALUES ('Kim Kardashian to Pay $1.26 Million to Settle S.E.C. Charges Over Crypto Promotion','Matthew Goldstein','Oct. 3, 2022','NYTimes','The S.E.C. said Ms. Kardashian did not disclose she had been paid to promote a crypto token sold by EthereumMax.')");

            Cursor c = sql.rawQuery("Select * from articles", null);
            int article_name_index = c.getColumnIndexOrThrow("article_name");
            c.moveToFirst();

//
            while(c.moveToNext()){
                name = c.getString(article_name_index);
                article_list.add(name);
                Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
//                Log.i("Array",article_list.get(0));
//                array_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,article_list);
//                listview.setAdapter((array_adapter));

            }
            c.close();


        }catch(Exception e){
            e.printStackTrace();
        }



    }




}