package com.example.demoapp5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String FIVE_DIGITS_KEY = "five_digits";
    public Button goFishButton;
    public TextView tapOnMeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String five_digits = getIntent().getStringExtra(FIVE_DIGITS_KEY);
        goFishButton = (Button) findViewById(R.id.buttonGoFish);
        goFishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Fisherman.class));
            }
        });
        tapOnMeTextView = (TextView) findViewById(R.id.insert_textView);
        tapOnMeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, InsertDigits.class));
            }
        });

        if(five_digits == null)
        {
            tapOnMeTextView.setText("Tap on me!");
        }
        else
        {
            tapOnMeTextView.setText("You have Inserted: " + five_digits);
        }
    }
}
