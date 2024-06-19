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
// @drawable/f11


public class FloodStory extends AppCompatActivity {

    private ConstraintLayout mainLayout;
    private ImageView
            platform,floodCard,secondChoice,firstChoice,messFlood1,btnPrev,btnNext,curtain,
            welldone,btnProceed,wrongflood1,btnOk,thirdchoice,fourthchoice,mess_prompt2,btnExit;

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
        curtain = findViewById(R.id.curtain);
        welldone = findViewById(R.id.welldone);
        btnProceed = findViewById(R.id.btnProceed);
        wrongflood1 = findViewById(R.id.wrongflood1);
        btnOk = findViewById(R.id.btnOk);
        thirdchoice = findViewById(R.id.thirdchoice);
        fourthchoice = findViewById(R.id.fourthchoice);
        mess_prompt2 = findViewById(R.id.mess_prompt2);
    }

    public void pageNext(View view) {
        // visible
        setVisibility(firstChoice, secondChoice, messFlood1, platform, floodCard);

        // gone
        setGone(
                btnExit, btnNext, btnPrev,
                curtain, welldone, btnProceed, wrongflood1, btnOk,
                thirdchoice, fourthchoice, mess_prompt2
        );


        // Change the background image
        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void pageBack(View view) {

    }

    public void pageFirstChoice(View view) {

        // visible
        setVisibility(welldone, btnProceed, curtain);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, messFlood1,platform,floodCard, wrongflood1, btnOk,
                thirdchoice, fourthchoice, mess_prompt2
        );

        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void pageSecondChoice(View view) {
        // visible
        setVisibility(wrongflood1, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, messFlood1,platform,floodCard, welldone, btnProceed,
                thirdchoice, fourthchoice, mess_prompt2
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void btnProceedPage(View view) {
        mainLayout.setBackgroundResource((R.drawable.f11));
    }

    public void btnOk(View view) {
        // visible
        setVisibility(firstChoice, secondChoice, messFlood1, platform, floodCard);

        // gone
        setGone(
                btnExit, btnNext, btnPrev,
                curtain, welldone, btnProceed, wrongflood1, btnOk,
                thirdchoice, fourthchoice, mess_prompt2
        );


        // Change the background image
        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    private void setGone(View... views) {
        for (View view : views) {
            view.setVisibility(View.GONE);
        }
    }

    private void setVisibility(View... views) {
        for (View view : views) {
            view.setVisibility(View.VISIBLE);
        }
    }

}