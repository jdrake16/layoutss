package com.example.layoutss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {

        ImageView zim = findViewById(R.id.imageView_zim);

        zim.animate().alpha(0).setDuration(2000);
        zim.animate().rotation(1800).setDuration(2000);
        zim.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);



        ImageView smooth = findViewById(R.id.imageView_smooth);

        smooth.animate().alpha(1).setDuration(2000);
        smooth.animate().rotation(-1800).setDuration(2000);
        smooth.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ImageView zim = findViewById(R.id.imageView_zim);
//
//        zim.setTranslationX(-1000);

    }
}