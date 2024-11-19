package com.example.para11;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
private ImageView animationTV;
private Button buttonStart;
private Button buttonStop;

private AnimationDrawable frameAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        animationTV = findViewById(R.id.animImageView);
        buttonStart = findViewById(R.id.buttonStart);
        buttonStop = findViewById(R.id.buttonStop);

        frameAnimation = (AnimationDrawable) animationTV.getDrawable();
        frameAnimation.start();


        ObjectAnimator startButtonAnimation = ObjectAnimator.ofFloat(buttonStart, "scaleX", 1.0f, 1.2f, 1.0f);
        startButtonAnimation.setDuration(500);
        startButtonAnimation.setRepeatCount(ObjectAnimator.INFINITE);
        startButtonAnimation.setRepeatMode(ObjectAnimator.REVERSE);
        startButtonAnimation.start();


        ObjectAnimator stopButtonAnimation = ObjectAnimator.ofFloat(buttonStop, "scaleX", 1.0f, 1.2f, 1.0f);
        stopButtonAnimation.setDuration(500);
        stopButtonAnimation.setRepeatCount(ObjectAnimator.INFINITE);
        stopButtonAnimation.setRepeatMode(ObjectAnimator.REVERSE);
        stopButtonAnimation.start();

        buttonStart.setOnClickListener(v -> {
            if (!frameAnimation.isRunning()) {
                frameAnimation.start();
            }
        });

        buttonStop.setOnClickListener(v -> {
            if (frameAnimation.isRunning()) {
                frameAnimation.stop();
            }
        });
    }
}