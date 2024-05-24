package com.example.disaster_app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.constraintlayout.widget.ConstraintLayout;


public class Manual extends AppCompatActivity {

    private int[] drawableResources = {
            R.drawable.manual_1,
            R.drawable.manual_2,
            R.drawable.manual_3,
            R.drawable.manual_4,
            R.drawable.manual_5,
            R.drawable.manual_6,
            R.drawable.manual_7,
            R.drawable.manual_8,
            R.drawable.manual_9,
            R.drawable.manual_10,
            R.drawable.manual_11,
            R.drawable.manual_12,
            R.drawable.manual_13,
            R.drawable.manual_14};
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


    }

    public void pageNext(View view) {
        ConstraintLayout layout = findViewById(R.id.main);


        if (i < drawableResources.length) {
            layout.setBackgroundResource(drawableResources[i]);
            i++;
        } else {
            i = 0;
        }
    }

    public void pagePrev(View view) {
        ConstraintLayout layout = findViewById(R.id.main);

        if (i > 0) {
            i--;
        } else {
            i = drawableResources.length - 1;
        }
        layout.setBackgroundResource(drawableResources[i]);
    }

    public void pageBack(View view) {
        startActivity(new Intent(Manual.this, MainActivity.class));
    }
}