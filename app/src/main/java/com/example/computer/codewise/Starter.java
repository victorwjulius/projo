package com.example.computer.codewise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Starter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);

        Thread starter = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(2000);
                    Intent transit = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(transit);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        starter.start();
    }
}
