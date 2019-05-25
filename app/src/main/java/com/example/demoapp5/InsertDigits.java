package com.example.demoapp5;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class InsertDigits extends AppCompatActivity {
    EditText insert5Digits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        insert5Digits = (EditText) findViewById(R.id.insertDigits_edittext);
        insert5Digits.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() == 5)
                {
                    Intent intent = new Intent(InsertDigits.this, MainActivity.class);
                    intent.putExtra(MainActivity.FIVE_DIGITS_KEY, s.toString());
                    startActivity(intent);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
