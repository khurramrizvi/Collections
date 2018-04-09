package com.rizvi.collections;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Buttons extends AppCompatActivity {

    Button Hello,Compute,Walls,logoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        Hello = findViewById(R.id.Hello);
        Compute = findViewById(R.id.Compute);
        Walls = findViewById(R.id.Walls);
        logoutBtn = findViewById(R.id.logoutBtn);

        Hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Buttons.this,Hello.class);
                startActivity(intent);
            }
        });

        Compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Buttons.this,Compute.class);
                startActivity(intent);
            }
        });


        Walls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Buttons.this,Walls.class);
                startActivity(intent);
            }
        });

       logoutBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(Buttons.this,MainActivity.class);
               startActivity(intent);
           }
       });
    }
}
