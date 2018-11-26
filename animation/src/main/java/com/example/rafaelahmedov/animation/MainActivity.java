package com.example.rafaelahmedov.animation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable rocketAnimation;


    public void autoRun(View view) {
        ImageView rocketImage = (ImageView) findViewById(R.id.image4);

        rocketImage.setBackgroundResource(R.drawable.images);
        rocketAnimation = (AnimationDrawable) rocketImage.getBackground();

        rocketImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rocketAnimation.stop();

                rocketAnimation.start();
                autoRun(view);
            }

        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoRun(findViewById(R.id.image1));
    }
}
