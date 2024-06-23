package com.example.disaster_app;

import android.content.Intent;
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
    private int i = 0, j = 0;
    private ImageView
            platform,floodCard,secondChoice,firstChoice,messFlood1,btnPrev,btnNext,curtain,
            welldone,btnProceed,wrongflood1,btnOk,thirdchoice,fourthchoice,messFlood2,btnExit,
            wrongflood2, messFlood3, fifthchoice, sixthchoice, wrongflood3,
            seventhChoice, eightchoice, messFlood4, wrongflood4,
            ninthChoice, tenthChoice, messFlood5, wrongflood5,
            eleventhChoice, twelveChoice, messFlood6, wrongflood6;

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
        messFlood2 = findViewById(R.id.mess_prompt2);
        wrongflood2 = findViewById(R.id.wrong_flood2);
        messFlood3 = findViewById(R.id.mess_flood3);
        fifthchoice = findViewById(R.id.fifthchoice);
        sixthchoice = findViewById(R.id.sixthchoice);
        wrongflood3 = findViewById(R.id.wrong_flood3);
        seventhChoice = findViewById(R.id.seventhChoice);
        eightchoice = findViewById(R.id.eightChoice);
        messFlood4 = findViewById(R.id.mess_flood4);
        wrongflood4 = findViewById(R.id.wrong_flood4);
        ninthChoice = findViewById(R.id.ninthchoice);
        tenthChoice = findViewById(R.id.tenthchoice);
        messFlood5 = findViewById(R.id.mess_flood5);
        wrongflood5 = findViewById(R.id.wrong_flood5);
        eleventhChoice = findViewById(R.id.eleventhchoice);
        twelveChoice = findViewById(R.id.twelvechoice);
        messFlood6 = findViewById(R.id.mess_flood6);
        wrongflood6 = findViewById(R.id.wrong_flood6);

    }

    public void pageNext(View view) {

        switch(i) {
            case 0:
                // visible
                setVisibility(firstChoice, secondChoice, messFlood1, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev,
                        curtain, welldone, btnProceed, wrongflood1, btnOk,
                        thirdchoice, fourthchoice, messFlood2
                );

                // Change the background image
                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                i++;
                break;

            case 1:

                // visible
                setVisibility(thirdchoice, fourthchoice, messFlood2, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev,
                        curtain, welldone, btnProceed, wrongflood1, btnOk,
                        firstChoice, secondChoice, messFlood1, wrongflood2
                );
                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken); // example resource
                i++;
                break;

            case 2:

                // visible
                setVisibility(fifthchoice, sixthchoice, messFlood3, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev,
                        curtain, welldone, btnProceed, wrongflood1, btnOk,
                        firstChoice, secondChoice, thirdchoice, fourthchoice, wrongflood2, messFlood2,messFlood1
                );
                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                i++;
                break;
            case 3:
                // visible
                setVisibility(seventhChoice, eightchoice, messFlood4, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev,
                        curtain, welldone, btnProceed, wrongflood1, btnOk,
                        firstChoice, secondChoice, thirdchoice, fourthchoice, wrongflood2, messFlood2,messFlood1,
                        fifthchoice, sixthchoice, messFlood3
                );
                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                i++;
                break;

            case 4:
                // visible
                setVisibility(ninthChoice, tenthChoice, messFlood5, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev,
                        curtain, welldone, btnProceed, wrongflood1, btnOk,
                        firstChoice, secondChoice, thirdchoice, fourthchoice, wrongflood2, messFlood2,messFlood1,
                        fifthchoice, sixthchoice, messFlood3,seventhChoice, eightchoice, messFlood4
                );
                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                i++;
                break;
            case 5:
                // visible
                setVisibility(eleventhChoice, twelveChoice, messFlood6, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev,
                        curtain, welldone, btnProceed, wrongflood1, btnOk,
                        firstChoice, secondChoice, thirdchoice, fourthchoice, wrongflood2, messFlood2,messFlood1,
                        fifthchoice, sixthchoice, messFlood3,seventhChoice, eightchoice, messFlood4,
                        ninthChoice, tenthChoice, messFlood5
                );
                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                i++;
                break;

            default:
                break;
        }

    }

    public void pageBack(View view) {
        startActivity(new Intent(FloodStory.this, StartPage.class));
    }

    public void pageFirstChoice(View view) {

        // visible
        setVisibility(welldone, btnProceed, curtain);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, messFlood1,platform,floodCard, wrongflood1, btnOk,
                thirdchoice, fourthchoice, messFlood2
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
                thirdchoice, fourthchoice, messFlood2
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void btnProceedPage(View view) {
        switch(j) {
            case 0:
                // visible
                setVisibility(btnExit, btnNext, btnPrev);

                // gone
                setGone(
                        firstChoice, secondChoice, messFlood1, platform, floodCard,
                        curtain, welldone, btnProceed, wrongflood1, btnOk,
                        thirdchoice, fourthchoice, messFlood2
                );

                mainLayout.setBackgroundResource((R.drawable.f11));
                break;
            case 1:
                // visible
                setVisibility(btnExit, btnNext, btnPrev);

                // gone
                setGone(
                        firstChoice, secondChoice, messFlood1, platform, floodCard,
                        curtain, welldone, btnProceed, wrongflood1, btnOk,
                        thirdchoice, fourthchoice, messFlood2
                );

                mainLayout.setBackgroundResource((R.drawable.f12));
                break;
            case 2:
                // visible
                setVisibility(btnExit, btnNext, btnPrev);

                // gone
                setGone(
                        firstChoice, secondChoice, messFlood1, platform, floodCard,
                        curtain, welldone, btnProceed, wrongflood1, btnOk,
                        thirdchoice, fourthchoice, messFlood2
                );

                mainLayout.setBackgroundResource((R.drawable.f13));
                break;
            case 3:
                // visible
                setVisibility(btnExit, btnNext, btnPrev);

                // gone
                setGone(
                        firstChoice, secondChoice, messFlood1, platform, floodCard,
                        curtain, welldone, btnProceed, wrongflood1, btnOk,
                        thirdchoice, fourthchoice, messFlood2
                );

                mainLayout.setBackgroundResource((R.drawable.f14));
                break;
            case 4:
                // visible
                setVisibility(btnExit, btnNext, btnPrev);

                // gone
                setGone(
                        firstChoice, secondChoice, messFlood1, platform, floodCard,
                        curtain, welldone, btnProceed, wrongflood1, btnOk,
                        thirdchoice, fourthchoice, messFlood2
                );

                mainLayout.setBackgroundResource((R.drawable.f15));
                break;
            case 5:
                // visible
                setVisibility(btnProceed);

                // gone
                setGone(
                        firstChoice, secondChoice, messFlood1, platform, floodCard,
                        curtain, welldone, wrongflood1, btnOk,
                        thirdchoice, fourthchoice, messFlood2
                );

                mainLayout.setBackgroundResource((R.drawable.end_flood));
                break;
            case 6:
                startActivity(new Intent(FloodStory.this, StartPage.class));
                break;
            default:
                break;
        }
        j++;
    }

    public void btnOk(View view) {
        switch(j){
            case 0:
                // visible
                setVisibility(firstChoice, secondChoice, messFlood1, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev,
                        curtain, welldone, btnProceed, wrongflood1, btnOk,
                        thirdchoice, fourthchoice, messFlood2, wrongflood2, wrongflood3
                );
                break;
            case 1:
                // visible
                setVisibility(thirdchoice, fourthchoice, messFlood2, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev,
                        curtain, welldone, btnProceed, wrongflood1, btnOk,
                        firstChoice, secondChoice, messFlood1, wrongflood2, wrongflood3
                );
                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                break;
            case 2:
                // visible
                setVisibility(fifthchoice, sixthchoice, messFlood3, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev,
                        curtain, welldone, btnProceed, wrongflood1, btnOk,
                        firstChoice, secondChoice, messFlood1, wrongflood2,
                        thirdchoice, fourthchoice, wrongflood3
                );
                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                break;
            case 3:
                // visible
                setVisibility(seventhChoice, eightchoice, messFlood4, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev,
                        curtain, welldone, btnProceed, wrongflood1, btnOk,
                        firstChoice, secondChoice, messFlood1, wrongflood2,
                        thirdchoice, fourthchoice, wrongflood3, fifthchoice,
                        sixthchoice, wrongflood4
                );
                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                break;
            case 4:
                // visible
                setVisibility(ninthChoice, tenthChoice, messFlood5, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev,
                        curtain, welldone, btnProceed, wrongflood1, btnOk,
                        firstChoice, secondChoice, messFlood1, wrongflood2,
                        thirdchoice, fourthchoice, wrongflood3, fifthchoice,
                        sixthchoice, wrongflood4, seventhChoice, eightchoice,
                        messFlood4, wrongflood5
                );
                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                break;
            case 5:
                // visible
                setVisibility(eleventhChoice, twelveChoice, messFlood6, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev,
                        curtain, welldone, btnProceed, wrongflood1, btnOk,
                        firstChoice, secondChoice, messFlood1, wrongflood2,
                        thirdchoice, fourthchoice, wrongflood3, fifthchoice,
                        sixthchoice, wrongflood4, seventhChoice, eightchoice,
                        messFlood4, wrongflood5, ninthChoice, tenthChoice, messFlood5,
                        wrongflood6
                );
                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                break;
            default:
                return;

        }
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

    public void btnThirdChoice(View view) {
        // visible
        setVisibility(welldone, btnProceed, curtain);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, messFlood1,platform,floodCard, wrongflood1, btnOk,
                thirdchoice, fourthchoice, messFlood2
        );

        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void btnFourthChoice(View view) {
        // visible
        setVisibility(wrongflood2, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, messFlood1,platform,floodCard, welldone, btnProceed,
                thirdchoice, fourthchoice, messFlood2
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void btnFifthChoice(View view) {
        // visible
        setVisibility(welldone, btnProceed, curtain);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, messFlood1,platform,floodCard, wrongflood1, btnOk,
                thirdchoice, fourthchoice, messFlood2, messFlood3, fifthchoice, sixthchoice
        );

        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void btnSixthChoice(View view) {
        // visible
        setVisibility(wrongflood3, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, messFlood1,platform,floodCard, welldone, btnProceed,
                thirdchoice, fourthchoice, messFlood2, fifthchoice, sixthchoice, messFlood3
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void btnSeventhChoice(View view) {
        // visible
        setVisibility(welldone, btnProceed, curtain);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, messFlood1,platform,floodCard, wrongflood1, btnOk,
                thirdchoice, fourthchoice, messFlood2, messFlood3, fifthchoice, sixthchoice,
                seventhChoice, eightchoice, messFlood4
        );

        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void btnEightChoice(View view) {
        // visible
        setVisibility(wrongflood4, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, messFlood1,platform,floodCard, welldone, btnProceed,
                thirdchoice, fourthchoice, messFlood2, fifthchoice, sixthchoice, messFlood3,
                seventhChoice, eightchoice, messFlood4
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void btnNinthChoice(View view) {
        // visible
        setVisibility(wrongflood5, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, messFlood1,platform,floodCard, welldone, btnProceed,
                thirdchoice, fourthchoice, messFlood2, fifthchoice, sixthchoice, messFlood3,
                seventhChoice, eightchoice, messFlood4, ninthChoice, tenthChoice, messFlood5
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void btnTenthChoice(View view) {
        // visible
        setVisibility(welldone, btnProceed, curtain);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, messFlood1,platform,floodCard, wrongflood1, btnOk,
                thirdchoice, fourthchoice, messFlood2, messFlood3, fifthchoice, sixthchoice,
                seventhChoice, eightchoice, messFlood4, ninthChoice, tenthChoice, messFlood5
        );

        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void pageEleventhChoice(View view) {
        // visible
        setVisibility(welldone, btnProceed, curtain);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, messFlood1,platform,floodCard, wrongflood1, btnOk,
                thirdchoice, fourthchoice, messFlood2, messFlood3, fifthchoice, sixthchoice,
                seventhChoice, eightchoice, messFlood4, ninthChoice, tenthChoice, messFlood5,
                eleventhChoice, twelveChoice, messFlood6
        );

        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void pageTwelveChoice(View view) {
        // visible
        setVisibility(wrongflood6, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, messFlood1,platform,floodCard, welldone, btnProceed,
                thirdchoice, fourthchoice, messFlood2, fifthchoice, sixthchoice, messFlood3,
                seventhChoice, eightchoice, messFlood4, ninthChoice, tenthChoice, messFlood5,
                eleventhChoice, twelveChoice, messFlood6
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void pageExit(View view) {
        startActivity(new Intent(FloodStory.this, StartPage.class));
    }

}