package com.example.disaster_app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class FireGame extends AppCompatActivity {

    private boolean Subtitle1Displayed = false;
    private boolean Subtitle2Displayed = false;
    private boolean Subtitle3Displayed = false;
    private boolean Subtitle4Displayed = false;
    private boolean Subtitle5Displayed = false;
    private boolean Subtitle6Displayed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_game);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        ConstraintLayout mainLayout = findViewById(R.id.main);
        ImageButton playButton = findViewById(R.id.minigame_playbutton);
        ImageView instructionBackground = findViewById(R.id.minifire_bginstruction);
        ImageButton okayButton = findViewById(R.id.minigame_okaybutton);
        ImageView sparkyCostume = findViewById(R.id.minifire_sparky0);
        ImageButton gloveButton = findViewById(R.id.minifire_button_gloves);
        ImageButton maskButton = findViewById(R.id.minifire_button_mask);
        ImageButton topButton = findViewById(R.id.minifire_button_top);
        ImageButton shoesButton = findViewById(R.id.minifire_button_shoes);
        ImageButton capButton = findViewById(R.id.minifire_button_cap);
        ImageButton bottomButton = findViewById(R.id.minifire_button_bottoms);
        ImageView scoreDisplay = findViewById(R.id.minifire_score0);
        ImageView subtitleDisplay = findViewById(R.id.minifire_mess1);
        ImageButton exitButton = findViewById(R.id.exitbutton);
        ImageButton homeButton = findViewById(R.id.mini_buttonhome);
        ImageButton replayButton = findViewById(R.id.mini_buttonreplay);

        //initial run
        playButton.setVisibility(View.VISIBLE);
        instructionBackground.setVisibility(View.GONE);
        okayButton.setVisibility(View.GONE);
        sparkyCostume.setVisibility(View.GONE);
        gloveButton.setVisibility(View.GONE);
        maskButton.setVisibility(View.GONE);
        topButton.setVisibility(View.GONE);
        shoesButton.setVisibility(View.GONE);
        capButton.setVisibility(View.GONE);
        bottomButton.setVisibility(View.GONE);
        scoreDisplay.setVisibility(View.GONE);
        subtitleDisplay.setVisibility(View.GONE);
        exitButton.setVisibility(View.GONE);
        homeButton.setVisibility(View.GONE);
        replayButton.setVisibility(View.GONE);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mainLayout.setBackgroundResource(R.drawable.minifire_bgfirestation);
                playButton.setVisibility(View.GONE);
                instructionBackground.setVisibility(View.VISIBLE);
                okayButton.setVisibility(View.VISIBLE);
                sparkyCostume.setVisibility(View.GONE);
                gloveButton.setVisibility(View.GONE);
                maskButton.setVisibility(View.GONE);
                topButton.setVisibility(View.GONE);
                shoesButton.setVisibility(View.GONE);
                capButton.setVisibility(View.GONE);
                bottomButton.setVisibility(View.GONE);
                scoreDisplay.setVisibility(View.GONE);
                subtitleDisplay.setVisibility(View.GONE);
                exitButton.setVisibility(View.VISIBLE);
                homeButton.setVisibility(View.GONE);
                replayButton.setVisibility(View.GONE);
            }
        });

        okayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mainLayout.setBackgroundResource(R.drawable.minifire_bgchoice);
                instructionBackground.setVisibility(View.GONE);
                okayButton.setVisibility(View.GONE);
                sparkyCostume.setVisibility(View.VISIBLE);
                gloveButton.setVisibility(View.VISIBLE);
                maskButton.setVisibility(View.VISIBLE);
                topButton.setVisibility(View.VISIBLE);
                shoesButton.setVisibility(View.VISIBLE);
                capButton.setVisibility(View.VISIBLE);
                bottomButton.setVisibility(View.VISIBLE);
                scoreDisplay.setVisibility(View.VISIBLE);
                subtitleDisplay.setVisibility(View.VISIBLE);
                exitButton.setVisibility(View.VISIBLE);
                homeButton.setVisibility(View.GONE);
                replayButton.setVisibility(View.GONE);

                Subtitle1Displayed = true;
                Subtitle2Displayed = false;
                Subtitle3Displayed = false;
                Subtitle4Displayed = false;
                Subtitle5Displayed = false;
                Subtitle6Displayed = false;
            }
        });

        maskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Subtitle1Displayed){
                    mainLayout.setBackgroundResource(R.drawable.minifire_bgchoice);
                    instructionBackground.setVisibility(View.GONE);
                    okayButton.setVisibility(View.GONE);
                    sparkyCostume.setVisibility(View.VISIBLE);
                    gloveButton.setVisibility(View.VISIBLE);
                    maskButton.setVisibility(View.VISIBLE);
                    topButton.setVisibility(View.VISIBLE);
                    shoesButton.setVisibility(View.VISIBLE);
                    capButton.setVisibility(View.VISIBLE);
                    bottomButton.setVisibility(View.VISIBLE);
                    scoreDisplay.setVisibility(View.VISIBLE);
                    subtitleDisplay.setVisibility(View.VISIBLE);
                    exitButton.setVisibility(View.VISIBLE);
                    homeButton.setVisibility(View.GONE);
                    replayButton.setVisibility(View.GONE);
                    sparkyCostume.setImageResource(R.drawable.minifire_sparky1);

                    Subtitle1Displayed = false;
                    subtitleDisplay.setImageResource(R.drawable.minifire_mess2);
                    scoreDisplay.setImageResource(R.drawable.minifire_score1);

                    Subtitle2Displayed = true;
                    Subtitle3Displayed = false;
                    Subtitle4Displayed = false;
                    Subtitle5Displayed = false;
                    Subtitle6Displayed = false;
                }
            }
        });

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Subtitle2Displayed){
                    mainLayout.setBackgroundResource(R.drawable.minifire_bgchoice);
                    instructionBackground.setVisibility(View.GONE);
                    okayButton.setVisibility(View.GONE);
                    sparkyCostume.setVisibility(View.VISIBLE);
                    gloveButton.setVisibility(View.VISIBLE);
                    maskButton.setVisibility(View.VISIBLE);
                    topButton.setVisibility(View.VISIBLE);
                    shoesButton.setVisibility(View.VISIBLE);
                    capButton.setVisibility(View.VISIBLE);
                    bottomButton.setVisibility(View.VISIBLE);
                    scoreDisplay.setVisibility(View.VISIBLE);
                    subtitleDisplay.setVisibility(View.VISIBLE);
                    exitButton.setVisibility(View.VISIBLE);
                    homeButton.setVisibility(View.GONE);
                    replayButton.setVisibility(View.GONE);
                    sparkyCostume.setImageResource(R.drawable.minifire_sparky2);

                    Subtitle2Displayed = false;
                    subtitleDisplay.setImageResource(R.drawable.minifire_mess3);
                    scoreDisplay.setImageResource(R.drawable.minifire_score2);

                    Subtitle1Displayed = false;
                    Subtitle3Displayed = true;
                    Subtitle4Displayed = false;
                    Subtitle5Displayed = false;
                    Subtitle6Displayed = false;
                }
            }
        });

        gloveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Subtitle3Displayed){
                    mainLayout.setBackgroundResource(R.drawable.minifire_bgchoice);
                    instructionBackground.setVisibility(View.GONE);
                    okayButton.setVisibility(View.GONE);
                    sparkyCostume.setVisibility(View.VISIBLE);
                    gloveButton.setVisibility(View.VISIBLE);
                    maskButton.setVisibility(View.VISIBLE);
                    topButton.setVisibility(View.VISIBLE);
                    shoesButton.setVisibility(View.VISIBLE);
                    capButton.setVisibility(View.VISIBLE);
                    bottomButton.setVisibility(View.VISIBLE);
                    scoreDisplay.setVisibility(View.VISIBLE);
                    subtitleDisplay.setVisibility(View.VISIBLE);
                    exitButton.setVisibility(View.VISIBLE);
                    homeButton.setVisibility(View.GONE);
                    replayButton.setVisibility(View.GONE);
                    sparkyCostume.setImageResource(R.drawable.minifire_sparky3);

                    Subtitle3Displayed = false;
                    subtitleDisplay.setImageResource(R.drawable.minifire_mess4);
                    scoreDisplay.setImageResource(R.drawable.minifire_score3);

                    Subtitle1Displayed = false;
                    Subtitle2Displayed = false;
                    Subtitle4Displayed = true;
                    Subtitle5Displayed = false;
                    Subtitle6Displayed = false;
                }
            }
        });

        shoesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Subtitle4Displayed){
                    mainLayout.setBackgroundResource(R.drawable.minifire_bgchoice);
                    instructionBackground.setVisibility(View.GONE);
                    okayButton.setVisibility(View.GONE);
                    sparkyCostume.setVisibility(View.VISIBLE);
                    gloveButton.setVisibility(View.VISIBLE);
                    maskButton.setVisibility(View.VISIBLE);
                    topButton.setVisibility(View.VISIBLE);
                    shoesButton.setVisibility(View.VISIBLE);
                    capButton.setVisibility(View.VISIBLE);
                    bottomButton.setVisibility(View.VISIBLE);
                    scoreDisplay.setVisibility(View.VISIBLE);
                    subtitleDisplay.setVisibility(View.VISIBLE);
                    exitButton.setVisibility(View.VISIBLE);
                    homeButton.setVisibility(View.GONE);
                    replayButton.setVisibility(View.GONE);
                    sparkyCostume.setImageResource(R.drawable.minifire_sparky4);

                    Subtitle4Displayed = false;
                    subtitleDisplay.setImageResource(R.drawable.minifire_mess5);
                    scoreDisplay.setImageResource(R.drawable.minifire_score4);

                    Subtitle1Displayed = false;
                    Subtitle2Displayed = false;
                    Subtitle3Displayed = false;
                    Subtitle5Displayed = true;
                    Subtitle6Displayed = false;
                }
            }
        });

        capButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Subtitle5Displayed){
                    mainLayout.setBackgroundResource(R.drawable.minifire_bgchoice);
                    instructionBackground.setVisibility(View.GONE);
                    okayButton.setVisibility(View.GONE);
                    sparkyCostume.setVisibility(View.VISIBLE);
                    gloveButton.setVisibility(View.VISIBLE);
                    maskButton.setVisibility(View.VISIBLE);
                    topButton.setVisibility(View.VISIBLE);
                    shoesButton.setVisibility(View.VISIBLE);
                    capButton.setVisibility(View.VISIBLE);
                    bottomButton.setVisibility(View.VISIBLE);
                    scoreDisplay.setVisibility(View.VISIBLE);
                    subtitleDisplay.setVisibility(View.VISIBLE);
                    exitButton.setVisibility(View.VISIBLE);
                    homeButton.setVisibility(View.GONE);
                    replayButton.setVisibility(View.GONE);
                    sparkyCostume.setImageResource(R.drawable.minifire_sparky5);

                    Subtitle5Displayed = false;
                    subtitleDisplay.setImageResource(R.drawable.minifire_mess6);
                    scoreDisplay.setImageResource(R.drawable.minifire_score5);

                    Subtitle1Displayed = false;
                    Subtitle2Displayed = false;
                    Subtitle3Displayed = false;
                    Subtitle4Displayed = false;
                    Subtitle6Displayed = true;
                }
            }
        });

        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Subtitle6Displayed){
                    mainLayout.setBackgroundResource(R.drawable.minifire_bgchoice);
                    instructionBackground.setVisibility(View.GONE);
                    okayButton.setVisibility(View.GONE);
                    sparkyCostume.setVisibility(View.VISIBLE);
                    gloveButton.setVisibility(View.VISIBLE);
                    maskButton.setVisibility(View.VISIBLE);
                    topButton.setVisibility(View.VISIBLE);
                    shoesButton.setVisibility(View.VISIBLE);
                    capButton.setVisibility(View.VISIBLE);
                    bottomButton.setVisibility(View.VISIBLE);
                    scoreDisplay.setVisibility(View.VISIBLE);
                    subtitleDisplay.setVisibility(View.VISIBLE);
                    exitButton.setVisibility(View.VISIBLE);
                    homeButton.setVisibility(View.GONE);
                    replayButton.setVisibility(View.GONE);
                    sparkyCostume.setImageResource(R.drawable.minifire_sparky6);

                    Subtitle6Displayed = false;
                    scoreDisplay.setImageResource(R.drawable.minifire_score6);

                    Subtitle1Displayed = false;
                    Subtitle2Displayed = false;
                    Subtitle3Displayed = false;
                    Subtitle4Displayed = false;

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            mainLayout.setBackgroundResource(R.drawable.mini_bglevelcomplete);
                            instructionBackground.setVisibility(View.GONE);
                            okayButton.setVisibility(View.GONE);
                            sparkyCostume.setVisibility(View.GONE);
                            gloveButton.setVisibility(View.GONE);
                            maskButton.setVisibility(View.GONE);
                            topButton.setVisibility(View.GONE);
                            shoesButton.setVisibility(View.GONE);
                            capButton.setVisibility(View.GONE);
                            bottomButton.setVisibility(View.GONE);
                            scoreDisplay.setVisibility(View.GONE);
                            subtitleDisplay.setVisibility(View.GONE);
                            exitButton.setVisibility(View.GONE);
                            homeButton.setVisibility(View.VISIBLE);
                            replayButton.setVisibility(View.VISIBLE);
                        }
                    }, 3000);
                }
            }
        });

    }

    public void minigamePage(View view) {
        startActivity(new Intent(FireGame.this, MiniGame.class));
    }

    public void replayFireGame(View view) {
        startActivity(new Intent(FireGame.this, FireGame.class));
    }
}
