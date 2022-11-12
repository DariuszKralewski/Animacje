package com.example.animacje;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fade(View view) {
        ImageView bartImageView = findViewById(R.id.bartImageView);
//        ImageView homerImageView = findViewById(R.id.homerImageView);
//        lajesfjewrqjewtgjetgj rei34erihtr4eiht

        bartImageView.animate().scaleX(.5f).scaleY(.5f).setDuration(2000);
//        homerImageView.animate().alpha(1).setDuration(2000);
    }
}