package com.example.disaster_app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FireStory extends AppCompatActivity {
    private int[] drawableResources = {
            R.drawable.frame1,
            R.drawable.frame2,
            R.drawable.frame3,
            R.drawable.frame4,
            R.drawable.frame4_1,
            R.drawable.frame4_2,
            R.drawable.frame4_3,
            R.drawable.frame5,
            R.drawable.frame6,
            R.drawable.frame7,
            R.drawable.frame8,
            R.drawable.frame9,
            R.drawable.frame10,
            R.drawable.frame11,
            R.drawable.frame12,
            R.drawable.frame13,
            R.drawable.frame14};
    private int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_story);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void closePage(View view) {
        startActivity(new Intent(FireStory.this, StartPage.class));
    }

    public void nextPage(View view) {
        ConstraintLayout layout = findViewById(R.id.main);

        if (i < drawableResources.length) {
            layout.setBackgroundResource(drawableResources[i]);
            i++;
        } else {
            i = 0;
        }
    }
}