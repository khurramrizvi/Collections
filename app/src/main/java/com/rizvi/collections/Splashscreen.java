package com.rizvi.collections;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashscreen);
        getSupportActionBar().hide();
        Thread xyz=new Thread()
        {
            public void run()
            {
                try {
                    sleep(4000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally {
                    Intent intent=new Intent(Splashscreen.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        xyz.start();
        Toast.makeText(this, "Welcome to our Collection", Toast.LENGTH_SHORT).show();
    }



    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }

}
