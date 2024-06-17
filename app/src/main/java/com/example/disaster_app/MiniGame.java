package com.example.disaster_app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MiniGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_game);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

    }

    public void backPage(View view) {
        startActivity(new Intent(MiniGame.this, StartPage.class));
    }

    public void minigameFirePage(View view) {
        startActivity(new Intent(MiniGame.this, FireGame.class));
    }

    public void minigameFloodPage(View view) {
//        startActivity(new Intent(MiniGame.this, FloodGame.class));
    }

    public void minigameQuakePage(View view) {
//        startActivity(new Intent(MiniGame.this, QuakeGame.class));
    }
}