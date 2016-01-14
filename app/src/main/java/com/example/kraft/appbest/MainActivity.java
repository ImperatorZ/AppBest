package com.example.kraft.appbest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button mCrowsCounterButton;
    private int mCount = 0;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        mCrowsCounterButton = (Button) findViewById(R.id.buttonCrowsCounter);

        mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView mInfoTextView = (TextView) findViewById(R.id.textView);
                mInfoTextView.setText("я насчитал " + ++mCount + " ворон");
            }
        });
    }

    public void DeleteCount(View view){
        mCount = 0;
        TextView mInfoTextView = (TextView)findViewById(R.id.textView);
        mInfoTextView.setText("Я насчитал" + mCount +  "ворон");
    }

}
