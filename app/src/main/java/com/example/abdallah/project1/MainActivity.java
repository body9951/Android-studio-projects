package com.example.abdallah.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et;
    private Button bc;
    private Button bf;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.editText);
        bc = (Button) findViewById(R.id.button);
        bf = (Button) findViewById(R.id.button2);
        tv = (TextView) findViewById(R.id.textView3);
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  String temp=et.getText().toString();
                    if(temp.isEmpty()){

                        Toast.makeText(MainActivity.this, "please Enter Temp", Toast.LENGTH_SHORT).show();
                    }
                else{
                        double te = Double.parseDouble(temp);
                        double conc = convertToCel(te);
                        String cconc = String.valueOf(conc);

                        tv.setText(cconc);

                    }
            }
        });}

/*
        bf.hasOnClickListeners(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String temp = et.getText().toString();

                if (temp.isEmpty()) {

                    Toast.makeText(this, "please enter value".Toast.LENTH_LONG).show();

                } else {

                    double te = Double.parseDouble(temp);
                    double conc = convertToCel(te);
                    String cconc = String.valueOf(conc);

                    tv.setText(cconc);
                }
            }
        });
*/

    public double convertToCel(double val) {

        double result = (val - 32) * 5 / 9;

        return result;

    }

    public double converTof(double val) {

        double result = (val * 9 / 5) + 32;

        return result;

    }

}



