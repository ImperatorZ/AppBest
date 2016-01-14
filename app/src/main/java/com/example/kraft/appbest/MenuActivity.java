package com.example.kraft.appbest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by kraft on 13.01.2016.
 */
public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
               public void CountRaven (View view){
                   Intent CountRaven = new Intent(this, MainActivity.class);
                   startActivity(CountRaven);
               }
    public void Traffic (View view){
        Intent Traffic = new Intent (this, TrafficLightActivity.class);
        startActivity(Traffic);
    }
}
