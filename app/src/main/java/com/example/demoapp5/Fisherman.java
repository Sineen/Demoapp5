package com.example.demoapp5;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Fisherman extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fisherman);
        imageView = (ImageView) findViewById(R.id.imageView_fisherman);
        Drawable myDrawable = getResources().getDrawable(R.drawable.fisherman2);
        imageView.setImageDrawable(myDrawable);
    }
}
