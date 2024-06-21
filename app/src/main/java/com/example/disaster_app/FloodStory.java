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
    private int i = 0, j = 0, k = 0;
    private ImageView
            platform,floodCard,secondChoice,firstChoice,messFlood1,btnPrev,btnNext,curtain,
            welldone,btnProceed,wrongflood1,btnOk,thirdchoice,fourthchoice,messFlood2,btnExit,
            wrongflood2, messFlood3, fifthchoice, sixthchoice, wrongflood3,
            seventhChoice, eightchoice, messFlood4, wrongflood4;

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

            default:
                break;
        }

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
                j++;
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
                j++;
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
                j++;
                break;
            default:
                break;
        }


    }

    public void btnOk(View view) {
        switch(k){
            case 0:
                // visible
                setVisibility(firstChoice, secondChoice, messFlood1, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev,
                        curtain, welldone, btnProceed, wrongflood1, btnOk,
                        thirdchoice, fourthchoice, messFlood2, wrongflood2, wrongflood3
                );
                k++;
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
                k++;
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
                k++;
                break;
            default:
                break;

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

    }
}