package com.rizvi.collections;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Compute extends AppCompatActivity {
    TextView textView;
    EditText editText;
    Button button,button1,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compute);


        editText=(EditText)findViewById(R.id.editText);
        button=(Button)findViewById(R.id.button);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double no=Double.parseDouble(editText.getText().toString());
                double sq=no*no;
                Toast.makeText(getApplicationContext(), " Square of "+no+" is "+sq, Toast.LENGTH_LONG).show();
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double no=Double.parseDouble(editText.getText().toString());
                double Cube=no*no*no;
                Toast.makeText(getApplicationContext(), " Cube of "+no+" is "+Cube, Toast.LENGTH_LONG).show();
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double no=Double.parseDouble(editText.getText().toString());
                double sqrt=Math.sqrt(no);
                Toast.makeText(getApplicationContext(), " Square root of "+no+" is "+sqrt, Toast.LENGTH_LONG).show();
            }
        });


    }
}
