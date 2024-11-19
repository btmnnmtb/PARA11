package com.example.para11;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {
    private ImageView ing ;
    private Button buttonStartt;
    private Button buttonStopp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ing = findViewById(R.id.img_blink);
        buttonStartt = findViewById(R.id.buttonStartt);
        buttonStopp = findViewById(R.id.buttonStopp);
        Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
        ing.startAnimation(blinkAnimation);

        Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.but_an);

        buttonStartt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ing.startAnimation(blinkAnimation);
                buttonStartt.startAnimation(scaleAnimation);
            }
        });

        buttonStopp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ing.clearAnimation();
                buttonStopp.startAnimation(scaleAnimation);
            }
        });



        }
    }
