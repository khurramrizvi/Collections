package com.rizvi.collections;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.health.TimerStat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    private int counter=5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name =(EditText) findViewById(R.id.ID);
        Password = (EditText) findViewById(R.id.password);
        Login = (Button) findViewById(R.id.loginBtn);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(),Password.getText().toString());
            }
        });

    }

    private void validate(String username, String password)
    {
        if((username.equals("admin")) && (password.equals("admin")))
        {
            Intent intent = new Intent(MainActivity.this,Buttons.class);
            startActivity(intent);
        }
        else if ((username.equals("khurram")) && (password.equals("khurram")))
        {
            Intent intent = new Intent(MainActivity.this,Buttons.class);
            startActivity(intent);
        }
        else if ((username.equals("android")) && (password.equals("android")))
        {
            Intent intent = new Intent(MainActivity.this,Hello.class);
            startActivity(intent);
        }
        else if ((username.equals("compute")) && (password.equals("compute")))
        {
            Intent intent = new Intent(MainActivity.this,Compute.class);
            startActivity(intent);
        }
        else if ((username.equals("walls")) && (password.equals("walls")))
        {
            Intent intent = new Intent(MainActivity.this,Walls.class);
            startActivity(intent);
        }
        else {

            counter --;

            Toast.makeText(getApplicationContext(),"Only "+counter+ " Attempts Left to Sign In!",Toast.LENGTH_LONG).show();
            if(counter== 0)
            {
                Login.setEnabled(false);
                Toast.makeText(getApplicationContext(),"Login Button Disabled due to Multiple Attempts",Toast.LENGTH_LONG).show();
            }
        }
    }
    }
