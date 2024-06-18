package com.example.disaster_app;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.constraintlayout.widget.ConstraintLayout;

// images
// @drawable/f10
// @drawable/bg_plaindarken


public class FloodStory extends AppCompatActivity {

    private ConstraintLayout mainLayout;
    private ImageView
            platform,
            floodCard,
            secondChoice,
            firstChoice,
            messFlood1,
            btnPrev,
            btnNext,
            btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flood_story);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        mainLayout = findViewById(R.id.main);
        platform = findViewById(R.id.platform);
        floodCard = findViewById(R.id.flood_card);
        secondChoice = findViewById(R.id.second_choice);
        firstChoice = findViewById(R.id.first_choice);
        messFlood1 = findViewById(R.id.mess_flood1);
        btnPrev = findViewById(R.id.btnPrev);
        btnNext = findViewById(R.id.btnNext);
        btnExit = findViewById(R.id.btnExit);
    }

    public void pageNext(View view) {
        platform.setVisibility(platform.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
        floodCard.setVisibility(floodCard.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
        secondChoice.setVisibility(secondChoice.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
        firstChoice.setVisibility(firstChoice.getVisibility() == View.VISIBLE ? View.GONE: View.VISIBLE);
        messFlood1.setVisibility(messFlood1.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
        btnExit.setVisibility(btnExit.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
        btnNext.setVisibility(btnNext.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
        btnPrev.setVisibility(btnPrev.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);


        // Change the background image
        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void pageBack(View view) {

    }

    public void pageFirstChoice(View view) {

        mainLayout.setBackgroundResource(R.drawable.welldone);
    }

    public void pageSecondChoice(View view) {
        mainLayout.setBackgroundResource((R.drawable.wrong_flood1));
    }
}