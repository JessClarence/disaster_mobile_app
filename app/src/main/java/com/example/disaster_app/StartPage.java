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

public class StartPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void backPage(View view) {
        startActivity(new Intent(StartPage.this, MainActivity.class));
    }

    public void quizPage(View view) {
        startActivity(new Intent(StartPage.this, Quiz.class));
    }

    public void firePage(View view) {
        startActivity(new Intent(StartPage.this, FireStory.class));
    }

    public void minigamePage(View view) {
        startActivity(new Intent(StartPage.this, MiniGame.class));
    }

}