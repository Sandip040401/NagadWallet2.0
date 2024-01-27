package com.xeotec.nagadwallet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bumptech.glide.Glide;

import pl.droidsonroids.gif.GifImageView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        GifImageView gifImageView = findViewById(R.id.gifImageView2);
        Glide.with(this).asGif().load(R.drawable.logonagad).into(gifImageView);
    }
}