package com.example.disaster_app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class VolcanoStory extends AppCompatActivity {
    private int i = 0, j = 0;
    private ImageView
            platform,volcanoCard1,secondChoice,firstChoice,thirdChoice,btnPrev,btnNext,btnExit,welldone,btnProceed,curtain,wrongvolcano1,btnOk,
            volcanoCard2,fourthChoice,fifthChoice,sixthChoice,wrongvolcano2,
            volcanoCard3, seventhChoice, eightChoice, ninthChoice, wrongvolcano3,
            volcanoCard4, tenthChoice, eleventhChoice, twelveChoice, wrongvolcano4,
            volcanoCard5, thirteenChoice, fourteenChoice, wrongvolcano5;
    private ConstraintLayout mainLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_volcano_story);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        mainLayout = findViewById(R.id.main);
        platform = findViewById(R.id.platform);
        volcanoCard1 = findViewById(R.id.volcano_card1);
        firstChoice = findViewById(R.id.first_choice);
        secondChoice = findViewById(R.id.second_choice);
        thirdChoice = findViewById(R.id.third_choice);
        btnPrev = findViewById(R.id.btnPrev);
        btnNext = findViewById(R.id.btnNext);
        btnExit = findViewById(R.id.btnExit);
        welldone = findViewById(R.id.welldone);
        btnProceed = findViewById(R.id.btnProceed);
        curtain = findViewById(R.id.curtain);
        wrongvolcano1 = findViewById(R.id.wrongvolcano1);
        btnOk = findViewById(R.id.btnOk);
        volcanoCard2 = findViewById(R.id.volcano_card2);
        fourthChoice = findViewById(R.id.fourth_choice);
        fifthChoice = findViewById(R.id.fifth_choice);
        sixthChoice = findViewById(R.id.sixth_choice);
        wrongvolcano2 = findViewById(R.id.wrongvolcano2);
        volcanoCard3 = findViewById(R.id.volcano_card3);
        seventhChoice = findViewById(R.id.seventh_choice);
        eightChoice = findViewById(R.id.eight_choice);
        ninthChoice = findViewById(R.id.ninth_choice);
        wrongvolcano3 = findViewById(R.id.wrongvolcano3);
        volcanoCard4 = findViewById(R.id.volcano_card4);
        tenthChoice = findViewById(R.id.tenth_choice);
        eleventhChoice = findViewById(R.id.eleventh_choice);
        twelveChoice = findViewById(R.id.twelve_choice);
        wrongvolcano4 = findViewById(R.id.wrongvolcano4);
        volcanoCard5 = findViewById(R.id.volcano_card5);
        thirteenChoice = findViewById(R.id.thirteen_choice);
        fourteenChoice = findViewById(R.id.fourteen_choice);
        wrongvolcano5 = findViewById(R.id.wrongvolcano5);

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

    public void pageBack(View view) {
        startActivity(new Intent(VolcanoStory.this, StartPage.class));
    }

    public void pageNext(View view) {
        switch(i){
            case 0:
                i++;
                mainLayout.setBackgroundResource(R.drawable.volcano_scene2);
                break;
            case 1:
                i++;
                mainLayout.setBackgroundResource(R.drawable.volcano_scene3);
                break;
            case 2:
                i++;
                mainLayout.setBackgroundResource(R.drawable.volcano_scene4);
                break;
            case 3:
                i++;
                mainLayout.setBackgroundResource(R.drawable.volcano_scene5);
                break;
            case 4:
                // visible
                setVisibility(firstChoice, secondChoice, thirdChoice, platform, volcanoCard1);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev
                );
                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                i++;
                break;
            case 5:
                i++;
                mainLayout.setBackgroundResource(R.drawable.volcano_scene7);
                break;
            case 6:
                i++;
                mainLayout.setBackgroundResource(R.drawable.volcano_scene8);
                break;
            case 7:
                // visible
                setVisibility(fourthChoice, fifthChoice, sixthChoice, platform, volcanoCard2);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev
                );
                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                i++;
                break;
            case 8:
                i++;
                mainLayout.setBackgroundResource(R.drawable.volcano_scene10);
                break;
            case 9:
                // visible
                setVisibility(seventhChoice, eightChoice, ninthChoice, platform, volcanoCard3);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev
                );
                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                i++;
                break;
            case 10:
                i++;
                mainLayout.setBackgroundResource(R.drawable.volcano_scene12);
                break;
            case 11:
                // visible
                setVisibility(tenthChoice, eleventhChoice, twelveChoice, platform, volcanoCard4);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev
                );
                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                i++;
                break;
            case 12:
                i++;
                mainLayout.setBackgroundResource(R.drawable.volcano_scene14);
                break;
            case 13:
                i++;
                mainLayout.setBackgroundResource(R.drawable.volcano_scene15);
                break;
            case 14:
                i++;
                mainLayout.setBackgroundResource(R.drawable.volcano_scene16);
                break;
            case 15:
                // visible
                setVisibility(thirteenChoice, fourteenChoice, platform, volcanoCard5);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev
                );
                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                i++;
                break;
            default:
                break;
        }
    }

    public void pageExit(View view) {
        startActivity(new Intent(VolcanoStory.this, StartPage.class));
    }

    public void pageFirstChoice(View view) {
        // visible
        setVisibility(welldone, btnProceed, curtain);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, thirdChoice,platform,volcanoCard1,
                wrongvolcano1, btnOk
        );

        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void pageSecondChoice(View view) {
        // visible
        setVisibility(wrongvolcano1, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, thirdChoice,platform,volcanoCard1, welldone, btnProceed
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void pageThirdChoice(View view) {
        // visible
        setVisibility(wrongvolcano1, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, thirdChoice,platform,volcanoCard1, welldone, btnProceed
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void btnOk(View view) {
        switch (j){
            case 0:
                // visible
                setVisibility(firstChoice, secondChoice, thirdChoice, platform, volcanoCard1);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev, btnOk, wrongvolcano1
                );
                break;
            case 1:
                // visible
                setVisibility(fourthChoice, fifthChoice, sixthChoice, platform, volcanoCard2);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev, btnOk, wrongvolcano2
                );
                break;
            case 2:
                // visible
                setVisibility(seventhChoice, eightChoice, ninthChoice, platform, volcanoCard3);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev, btnOk, wrongvolcano3
                );
                break;
            case 3:
                // visible
                setVisibility(tenthChoice, eleventhChoice, twelveChoice, platform, volcanoCard4);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev, btnOk, wrongvolcano4
                );
                break;
            case 4:
                // visible
                setVisibility(thirteenChoice,fourteenChoice, platform, volcanoCard5);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev, btnOk, wrongvolcano5
                );
                break;
            default:
                break;
        }

    }

    public void btnProceedPage(View view) {
        switch(j){
            case 0:
                // visible
                setVisibility(btnExit, btnNext, btnPrev);

                // gone
                setGone(
                        firstChoice, secondChoice, thirdChoice, platform, volcanoCard1,
                        curtain, welldone, btnProceed, btnOk
                );
                mainLayout.setBackgroundResource((R.drawable.volcano_scene6));
                break;
            case 1:
                // visible
                setVisibility(btnExit, btnNext, btnPrev);

                // gone
                setGone(
                        fourthChoice, fifthChoice, sixthChoice, platform, volcanoCard2,
                        curtain, welldone, btnProceed, btnOk
                );
                mainLayout.setBackgroundResource((R.drawable.volcano_scene9));
                break;
            case 2:
                // visible
                setVisibility(btnExit, btnNext, btnPrev);

                // gone
                setGone(
                        seventhChoice, eightChoice, ninthChoice, platform, volcanoCard3,
                        curtain, welldone, btnProceed, btnOk
                );
                mainLayout.setBackgroundResource((R.drawable.volcano_scene11));
                break;
            case 3:
                // visible
                setVisibility(btnExit, btnNext, btnPrev);

                // gone
                setGone(
                        tenthChoice, eleventhChoice, twelveChoice, platform, volcanoCard4,
                        curtain, welldone, btnProceed, btnOk
                );
                mainLayout.setBackgroundResource((R.drawable.volcano_scene13));
                break;
            case 4:
                // visible
                setVisibility(btnProceed);

                // gone
                setGone(
                        thirteenChoice, fourteenChoice, platform, volcanoCard5,
                        curtain, welldone, btnOk
                );
                mainLayout.setBackgroundResource((R.drawable.fire_end));
                break;
            case 5:
                startActivity(new Intent(VolcanoStory.this, StartPage.class));
                break;
            default:
                break;
        }
        j++;
    }

    public void pageFourthChoice(View view) {
        // visible
        setVisibility(welldone, btnProceed, curtain);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, fourthChoice
                ,fifthChoice, sixthChoice,platform,volcanoCard2,
                wrongvolcano2, btnOk
        );

        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void pageFifthChoice(View view) {
        // visible
        setVisibility(wrongvolcano2, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, fourthChoice
                ,fifthChoice, sixthChoice,platform,volcanoCard2, welldone, btnProceed
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void pageSixthChoice(View view) {
        // visible
        setVisibility(wrongvolcano2, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, fourthChoice
                ,fifthChoice, sixthChoice,platform,volcanoCard2, welldone, btnProceed
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void pageSeventhChoice(View view) {
        // visible
        setVisibility(wrongvolcano3, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, seventhChoice
                ,eightChoice, ninthChoice,platform,volcanoCard3, welldone, btnProceed
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void pageEightChoice(View view) {
        // visible
        setVisibility(wrongvolcano3, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, seventhChoice
                ,eightChoice, ninthChoice,platform,volcanoCard3, welldone, btnProceed
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void pageNinthChoice(View view) {
        // visible
        setVisibility(welldone, btnProceed, curtain);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, seventhChoice
                ,eightChoice, ninthChoice,platform,volcanoCard3,
                wrongvolcano3, btnOk
        );

        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void pageTenthChoice(View view) {
        // visible
        setVisibility(welldone, btnProceed, curtain);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, tenthChoice
                ,eleventhChoice, twelveChoice,platform,volcanoCard4,
                wrongvolcano4, btnOk
        );

        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void pageEleventhChoice(View view) {
        // visible
        setVisibility(wrongvolcano4, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, tenthChoice
                ,eleventhChoice, twelveChoice,platform,volcanoCard4, welldone, btnProceed
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void pageTwelveChoice(View view) {
        // visible
        setVisibility(wrongvolcano4, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, tenthChoice
                ,eleventhChoice, twelveChoice,platform,volcanoCard4, welldone, btnProceed
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void pageThirteenChoice(View view) {
        // visible
        setVisibility(welldone, btnProceed, curtain);

        // gone
        setGone(
                btnExit, btnNext, btnPrev,
                thirteenChoice,fourteenChoice,
                platform,volcanoCard5,
                wrongvolcano5, btnOk
        );

        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void pageFourteenChoice(View view) {
        // visible
        setVisibility(wrongvolcano5, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, thirteenChoice
                ,fourteenChoice,platform,volcanoCard5, welldone, btnProceed
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }
}