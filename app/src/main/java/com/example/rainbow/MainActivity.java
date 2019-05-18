package com.example.rainbow;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button       buttonRed;
    Button       buttonBlue;
    Button       buttonGreen;
    Button       buttonGrey;
    Button       buttonPurple;
    Button       buttonWhite;
    LinearLayout layoutBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutBackground = findViewById(R.id.layout_background);
        buttonWhite      = findViewById(R.id.button_white);
        buttonWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("White", "The White button was clicked");
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.white));
            }
        });
        layoutBackground = findViewById(R.id.layout_background);
        buttonPurple     = findViewById(R.id.button_purple);
        buttonPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Purple", "The Purple button was clicked");
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
            }
        });
        layoutBackground = findViewById(R.id.layout_background);
        buttonGrey       = findViewById(R.id.button_grey);
        buttonGrey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Grey", "The Grey button was clicked");
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
            }
        });
        layoutBackground = findViewById(R.id.layout_background);
        buttonGreen      = findViewById(R.id.button_green);
        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Green", "The Green button was clicked");
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            }
        });
        layoutBackground = findViewById(R.id.layout_background);
        buttonBlue       = findViewById(R.id.button_blue);
        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Blue", "The Blue button was clicked");
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
            }
        });

        layoutBackground = findViewById(R.id.layout_background);
        buttonRed        = findViewById(R.id.button_red);
        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Red", "The Red button was clicked");
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            }
        });
    }
}
