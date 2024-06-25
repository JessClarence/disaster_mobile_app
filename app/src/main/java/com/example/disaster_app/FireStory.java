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

public class FireStory extends AppCompatActivity {

    private ConstraintLayout mainLayout;
    private ImageView
            platform,fireCard1,secondChoice,firstChoice,thirdChoice,btnPrev,btnNext,btnExit,welldone,btnProceed,curtain,wrongfire1,btnOk,
            fireCard2,fourthChoice,fifthChoice,sixthChoice,wrongfire2,
            fireCard3, seventhChoice, eightChoice, ninthChoice, wrongfire3,
            fireCard4, tenthChoice, eleventhChoice, twelveChoice, wrongfire4,
            fireCard5, thirteenChoice, fourteenChoice, wrongfire5;

    private int i = 0, j = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_story);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        mainLayout = findViewById(R.id.main);
        platform = findViewById(R.id.platform);
        fireCard1 = findViewById(R.id.fire_card1);
        secondChoice = findViewById(R.id.second_choice);
        firstChoice = findViewById(R.id.first_choice);
        thirdChoice = findViewById(R.id.third_choice);
        btnPrev = findViewById(R.id.btnPrev);
        btnNext = findViewById(R.id.btnNext);
        btnExit = findViewById(R.id.btnExit);
        btnOk = findViewById(R.id.btnOk);
        wrongfire1 = findViewById(R.id.wrongfire1);
        welldone = findViewById(R.id.welldone);
        btnProceed = findViewById(R.id.btnProceed);
        curtain = findViewById(R.id.curtain);
        fireCard2 = findViewById(R.id.fire_card2);
        fourthChoice = findViewById(R.id.fourth_choice);
        fifthChoice = findViewById(R.id.fifth_choice);
        sixthChoice = findViewById(R.id.sixth_choice);
        wrongfire2 = findViewById(R.id.wrongfire2);
        fireCard3 = findViewById(R.id.fire_card3);
        seventhChoice = findViewById(R.id.seventh_choice);
        eightChoice = findViewById(R.id.eight_choice);
        ninthChoice = findViewById(R.id.ninth_choice);
        wrongfire3 = findViewById(R.id.wrongfire3);
        fireCard4 = findViewById(R.id.fire_card4);
        tenthChoice = findViewById(R.id.tenth_choice);
        eleventhChoice = findViewById(R.id.eleventh_choice);
        twelveChoice = findViewById(R.id.twelve_choice);
        wrongfire4 = findViewById(R.id.wrongfire4);
        fireCard5 = findViewById(R.id.fire_card5);
        thirteenChoice = findViewById(R.id.thirteen_choice);
        fourteenChoice = findViewById(R.id.fourteen_choice);
        wrongfire5 = findViewById(R.id.wrongfire5);
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
            case 6:
                // visible
                setVisibility(firstChoice, secondChoice, thirdChoice, platform, fireCard1);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev
                );

                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                i++;
               break;
            case 7:
                i++;
                mainLayout.setBackgroundResource(R.drawable.fire_scene6);
                break;
            case 8:
                // visible
                setVisibility(fourthChoice, fifthChoice, sixthChoice, platform, fireCard2);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev
                );
                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                i++;
                break;
            case 9:
                i++;
                mainLayout.setBackgroundResource(R.drawable.fire_scene8);
                break;
            case 10:
                i++;
                mainLayout.setBackgroundResource(R.drawable.fire_scene9);
                break;
            case 11:
                // visible
                setVisibility(seventhChoice, eightChoice, ninthChoice, platform, fireCard3);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev
                );
                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                i++;
                break;
            case 12:
                i++;
                mainLayout.setBackgroundResource(R.drawable.fire_scene11);
                break;
            case 13:
                i++;
                mainLayout.setBackgroundResource(R.drawable.fire_scene12);
                break;
            case 14:
                // visible
                setVisibility(tenthChoice, eleventhChoice, twelveChoice, platform, fireCard4);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev
                );
                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                i++;
                break;
            case 15:
                i++;
                mainLayout.setBackgroundResource(R.drawable.fire_scene14);
                break;
            case 16:
                // visible
                setVisibility(thirteenChoice, fourteenChoice, fireCard5);

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
        startActivity(new Intent(FireStory.this, StartPage.class));
    }

    public void pageFirstChoice(View view) {
        // visible
        setVisibility(wrongfire1, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, thirdChoice,platform,fireCard1, welldone, btnProceed
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void pageSecondChoice(View view) {
        // visible
        setVisibility(welldone, btnProceed, curtain);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, thirdChoice,platform,fireCard1,
                wrongfire1, btnOk
        );

        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void pageThirdChoice(View view) {
        // visible
        setVisibility(wrongfire1, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, thirdChoice,platform,fireCard1, welldone, btnProceed
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void btnOk(View view) {
        switch(j){
            case 0:
                // visible
                setVisibility(firstChoice, secondChoice, thirdChoice, platform, fireCard1);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev, btnOk, wrongfire1
                );
                break;
            case 1:
                // visible
                setVisibility(fourthChoice, fifthChoice, sixthChoice, platform, fireCard2);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev, btnOk, wrongfire2
                );
                break;
            case 2:
                // visible
                setVisibility(seventhChoice, eightChoice, ninthChoice, platform, fireCard3);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev, btnOk, wrongfire3
                );
                break;
            case 3:
                // visible
                setVisibility(tenthChoice, eleventhChoice, twelveChoice, platform, fireCard4);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev, btnOk, wrongfire4
                );
                break;
            case 4:
                // visible
                setVisibility(thirteenChoice,fourteenChoice, platform, fireCard5);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev, btnOk, wrongfire5
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
                        firstChoice, secondChoice, thirdChoice, platform, fireCard1,
                        curtain, welldone, btnProceed, btnOk
                );
                mainLayout.setBackgroundResource((R.drawable.fire_scene5));
                break;
            case 1:
                // visible
                setVisibility(btnExit, btnNext, btnPrev);

                // gone
                setGone(
                        fourthChoice, fifthChoice, sixthChoice, platform, fireCard2,
                        curtain, welldone, btnProceed, btnOk
                );
                mainLayout.setBackgroundResource((R.drawable.fire_scene7));
                break;
            case 2:
                // visible
                setVisibility(btnExit, btnNext, btnPrev);

                // gone
                setGone(
                        seventhChoice, eightChoice, ninthChoice, platform, fireCard3,
                        curtain, welldone, btnProceed, btnOk
                );
                mainLayout.setBackgroundResource((R.drawable.fire_scene10));
                break;
            case 3:
                // visible
                setVisibility(btnExit, btnNext, btnPrev);

                // gone
                setGone(
                        tenthChoice, eleventhChoice, twelveChoice, platform, fireCard4,
                        curtain, welldone, btnProceed, btnOk
                );
                mainLayout.setBackgroundResource((R.drawable.fire_scene13));
                break;
            case 4:
                setVisibility(btnProceed);
                // gone
                setGone(
                        fourteenChoice, thirteenChoice, platform, fireCard5,
                        curtain, welldone, btnOk
                );
                mainLayout.setBackgroundResource((R.drawable.fire_end));
                break;
            case 5:
                startActivity(new Intent(FireStory.this, StartPage.class));
                break;
            default:
                break;
        }
        j++;
    }

    public void pageFourthChoice(View view) {
        // visible
        setVisibility(wrongfire2, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, fourthChoice
                ,fifthChoice, sixthChoice,platform,fireCard2, welldone, btnProceed
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void pageFifthChoice(View view) {
        // visible
        setVisibility(wrongfire2, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, fourthChoice
                ,fifthChoice, sixthChoice,platform,fireCard2, welldone, btnProceed
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void pageSixthChoice(View view) {
        // visible
        setVisibility(welldone, btnProceed, curtain);

        // gone
        setGone(
                btnExit, btnNext, btnPrev,
                fourthChoice,fifthChoice, sixthChoice,
                platform,fireCard2,
                wrongfire1, btnOk
        );

        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void pageSeventhChoice(View view) {
        // visible
        setVisibility(wrongfire3, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, seventhChoice
                ,eightChoice, ninthChoice,platform,fireCard3, welldone, btnProceed
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void pageEightChoice(View view) {
        // visible
        setVisibility(wrongfire3, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, seventhChoice
                ,eightChoice, ninthChoice,platform,fireCard3, welldone, btnProceed
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void pageNinthChoice(View view) {
        // visible
        setVisibility(welldone, btnProceed, curtain);

        // gone
        setGone(
                btnExit, btnNext, btnPrev,
                seventhChoice,eightChoice, ninthChoice,
                platform,fireCard3,
                wrongfire3, btnOk
        );

        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void pageTenthChoice(View view) {
        // visible
        setVisibility(welldone, btnProceed, curtain);

        // gone
        setGone(
                btnExit, btnNext, btnPrev,
                tenthChoice,eleventhChoice, twelveChoice,
                platform,fireCard4,
                wrongfire4, btnOk
        );

        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void pageEleventhChoice(View view) {
        // visible
        setVisibility(wrongfire4, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, tenthChoice
                ,eleventhChoice, twelveChoice,platform,fireCard4, welldone, btnProceed
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void pageTwelveChoice(View view) {
        // visible
        setVisibility(wrongfire4, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, tenthChoice
                ,eleventhChoice, twelveChoice,platform,fireCard4, welldone, btnProceed
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
                platform,fireCard5,
                wrongfire5, btnOk
        );

        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void pageFourteenChoice(View view) {
        // visible
        setVisibility(wrongfire5, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, thirteenChoice
                ,fourteenChoice, platform,fireCard5, welldone, btnProceed
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }
}