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

    private ConstraintLayout mainLayout;

    private int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_story);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        mainLayout = findViewById(R.id.main);
    }

    public void pageBack(View view) {
        startActivity(new Intent(FireStory.this, StartPage.class));
    }


    public void pageNext(View view) {
        switch(i){
            case 0:
                i++;
                mainLayout.setBackgroundResource(R.drawable.fire_scene2);
                break;
            case 1:
                i++;
                mainLayout.setBackgroundResource(R.drawable.fire_scene3);
                break;
            case 2:
                i++;
                mainLayout.setBackgroundResource(R.drawable.fire_scene4);
                break;
            case 3:
                i++;
                mainLayout.setBackgroundResource(R.drawable.fire_scene4_1);
                break;
            case 4:
                i++;
                mainLayout.setBackgroundResource(R.drawable.fire_scene4_2);
                break;
            case 5:
                i++;
                mainLayout.setBackgroundResource(R.drawable.fire_scene4_3);
                break;
            default:
                break;
        }

    }

    public void pageExit(View view) {
        startActivity(new Intent(FireStory.this, StartPage.class));
    }

    public void pageFirstChoice(View view) {

    }

    public void pageSecondChoice(View view) {

    }

    public void pageThirdChoice(View view) {

    }
}