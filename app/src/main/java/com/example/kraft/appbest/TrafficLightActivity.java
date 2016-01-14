package com.example.kraft.appbest;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class TrafficLightActivity extends Activity {

    private RelativeLayout mRelativeLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.traffic_layout);
        mRelativeLayout = (RelativeLayout)findViewById(R.id.LinerLayout);
        mInfoTextView = (TextView)findViewById(R.id.text);

        Button yellowButton = (Button)findViewById(R.id.buttonYellow);
        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInfoTextView.setText(R.string.Yellow);
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.yellowColor));
            }
        });

    }
    public void onRedButtonClick(View view){
        mInfoTextView.setText(R.string.Red);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.redColor));
    }
    public void onBlackButtonClick(View view){
        mInfoTextView.setText(R.string.Black);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.blackColor));
    }
}
