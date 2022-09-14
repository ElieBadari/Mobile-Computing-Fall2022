package com.elieb.moneyswap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.FloatProperty;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void swapMoney(View v){

        TextView monies = (TextView) findViewById(R.id.money);
        float money = Float.parseFloat(monies.getText().toString());
        TextView amount_to_disp = (TextView) findViewById(R.id.amount);

        Switch choice = (Switch) findViewById(R.id.radio1);

        choice.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (choice.isChecked()){
                    amount_to_disp.setText("The amount in USD = " + money/40000);

                }else{
                    amount_to_disp.setText("The amount in LBP = " + money*40000);
                }
            }
        });







    }

}