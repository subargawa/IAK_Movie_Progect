package com.example.gustut.iak_movie_progect;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static int SPLASH_TIME_OUT=2500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mIntent = new Intent(MainActivity.this, Input_Name_Activity.class);
                startActivity(mIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
