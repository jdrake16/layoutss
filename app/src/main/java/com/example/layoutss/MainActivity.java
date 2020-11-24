package com.example.layoutss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {

        ImageView zim = findViewById(R.id.imageView_zim);

        ImageView smooth = findViewById(R.id.imageView_smooth);

        zim.animate().alpha(0f).setDuration(2000);

        smooth.animate().alpha(1).setDuration(2000);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}