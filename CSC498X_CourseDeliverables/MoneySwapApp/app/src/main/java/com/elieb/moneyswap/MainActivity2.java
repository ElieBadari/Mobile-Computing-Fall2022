package com.elieb.moneyswap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.FloatProperty;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {

    Switch choice;
    String to_display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        choice = (Switch) findViewById(R.id.radio1);
    }

    public void swapMoney(View v){

        TextView monies = (TextView) findViewById(R.id.money);
        float money = Float.parseFloat(monies.getText().toString());
        TextView amount_to_disp = (TextView) findViewById(R.id.amount);

        choice.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (choice.isChecked()){

                    to_display = "The amount in USD" + money/40000;
//                    amount_to_disp.setText("The amount in USD = " + money/40000 +" $");

                }else{
                    float to_disp = money*40000 ;
                    DecimalFormat df = new DecimalFormat("#");
                    df.setMaximumFractionDigits(0);
                    to_display = "The amount in LBP = " + df.format(to_disp) + "l.l";
//                    amount_to_disp.setText("The amount in LBP = " + df.format(to_disp) + "l.l");
                }
            }

        });
        amount_to_disp.setText(to_display);


    }

}