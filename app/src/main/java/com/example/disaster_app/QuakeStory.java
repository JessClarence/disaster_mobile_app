package com.example.disaster_app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.constraintlayout.widget.ConstraintLayout;

public class QuakeStory extends AppCompatActivity {

    private ConstraintLayout mainLayout;
    private int i = 0, j = 0;
    private ImageView
            platform,floodCard,secondChoice,firstChoice,messQuake1,btnPrev,btnNext,
            btnExit, curtain, welldone, btnProceed, wrongQuake1, btnOk,
            thirdChoice, fourthChoice, messQuake2, wrongQuake2,
            fifthChoice,sixthChoice,messQuake3,wrongQuake3,
            seventhChoice, eightChoice, messQuake4,wrongQuake4,
            ninthChoice, tenthChoice, messQuake5, wrongQuake5,
            eleventhChoice, twelveChoice, messQuake6, wrongQuake6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quake_story);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        mainLayout = findViewById(R.id.main);
        platform = findViewById(R.id.platform);
        floodCard = findViewById(R.id.flood_card);
        secondChoice = findViewById(R.id.second_choice);
        firstChoice = findViewById(R.id.first_choice);
        messQuake1 = findViewById(R.id.mess_quake1);
        btnPrev = findViewById(R.id.btnPrev);
        btnNext = findViewById(R.id.btnNext);
        btnExit = findViewById(R.id.btnExit);
        curtain = findViewById(R.id.curtain);
        welldone = findViewById(R.id.welldone);
        btnProceed = findViewById(R.id.btnProceed);
        wrongQuake1 = findViewById(R.id.wrongquake1);
        btnOk = findViewById(R.id.btnOk);
        thirdChoice = findViewById(R.id.third_choice);
        fourthChoice = findViewById(R.id.fourth_choice);
        messQuake2 = findViewById(R.id.mess_quake2);
        wrongQuake2 = findViewById(R.id.wrongquake2);
        fifthChoice = findViewById(R.id.fifth_choice);
        sixthChoice = findViewById(R.id.sixth_choice);
        messQuake3 = findViewById(R.id.mess_quake3);
        wrongQuake3 = findViewById(R.id.wrongquake3);
        seventhChoice = findViewById(R.id.seventh_choice);
        eightChoice = findViewById(R.id.eight_choice);
        messQuake4 = findViewById(R.id.mess_quake4);
        wrongQuake4 = findViewById(R.id.wrongquake4);
        ninthChoice = findViewById(R.id.ninth_choice);
        tenthChoice = findViewById(R.id.tenth_choice);
        messQuake5 = findViewById(R.id.mess_quake5);
        wrongQuake5 = findViewById(R.id.wrongquake5);
        eleventhChoice = findViewById(R.id.eleventh_choice);
        twelveChoice = findViewById(R.id.twelve_choice);
        messQuake6 = findViewById(R.id.mess_quake6);
        wrongQuake6 = findViewById(R.id.wrongquake6);
    }
    public void pageBack(View view) {
        startActivity(new Intent(QuakeStory.this, StartPage.class));
    }


    public void pageExit(View view) {
        startActivity(new Intent(QuakeStory.this, StartPage.class));
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

    public void pageNext(View view) {
        switch(i){
            case 0:
                i++;
                mainLayout.setBackgroundResource(R.drawable.q17);
                break;
            case 1:
                // visible
                setVisibility(firstChoice, secondChoice, messQuake1, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev
                );

                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                i++;
                break;
            case 2:
                // visible
                setVisibility(thirdChoice, fourthChoice, messQuake2, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev
                );

                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                i++;
                break;
            case 3:
                i++;
                mainLayout.setBackgroundResource(R.drawable.q20);
                break;
            case 4:
                // visible
                setVisibility(fifthChoice, sixthChoice, messQuake3, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev
                );

                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                i++;
                break;
            case 5:
                // visible
                setVisibility(seventhChoice, eightChoice, messQuake4, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev
                );

                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                i++;
                break;
            case 6:
                // visible
                setVisibility(ninthChoice, tenthChoice, messQuake5, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev
                );

                mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
                i++;
                break;
            case 7:
                // visible
                setVisibility(eleventhChoice, twelveChoice, messQuake6, platform, floodCard);

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

    public void pageFirstChoice(View view) {
        // visible
        setVisibility(welldone, btnProceed, curtain);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, messQuake1,platform,floodCard,
                wrongQuake1, btnOk
        );

        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void pageSecondChoice(View view) {
        // visible
        setVisibility(wrongQuake1, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, messQuake1,platform,floodCard, welldone, btnProceed
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));

    }

    public void btnProceedPage(View view) {
        switch(j){
            case 0:
                // visible
                setVisibility(btnExit, btnNext, btnPrev);

                // gone
                setGone(
                        firstChoice, secondChoice, messQuake1, platform, floodCard,
                        curtain, welldone, btnProceed, btnOk
                );
                mainLayout.setBackgroundResource((R.drawable.q18));
                break;
            case 1:
                // visible
                setVisibility(btnExit, btnNext, btnPrev);

                // gone
                setGone(
                        thirdChoice, fourthChoice, messQuake2, platform, floodCard,
                        curtain, welldone, btnProceed, btnOk
                );
                mainLayout.setBackgroundResource((R.drawable.q19));
                break;
            case 2:
                // visible
                setVisibility(btnExit, btnNext, btnPrev);

                // gone
                setGone(
                        fifthChoice, sixthChoice, messQuake3, platform, floodCard,
                        curtain, welldone, btnProceed, btnOk
                );
                mainLayout.setBackgroundResource((R.drawable.q21));
                break;
            case 3:
                // visible
                setVisibility(btnExit, btnNext, btnPrev);

                // gone
                setGone(
                        seventhChoice, eightChoice, messQuake4, platform, floodCard,
                        curtain, welldone, btnProceed, btnOk
                );
                mainLayout.setBackgroundResource((R.drawable.q22));
                break;
            case 4:
                // visible
                setVisibility(btnExit, btnNext, btnPrev);

                // gone
                setGone(
                        eightChoice, ninthChoice, messQuake5, platform, floodCard,
                        curtain, welldone, btnProceed, btnOk
                );
                mainLayout.setBackgroundResource((R.drawable.q22));
                break;
            case 5:
                // visible
                setVisibility(btnProceed);

                // gone
                setGone(
                        eleventhChoice, twelveChoice, messQuake6, platform, floodCard,
                        curtain, welldone, btnOk
                );
                mainLayout.setBackgroundResource((R.drawable.end_quake));
                break;
            case 6:
                startActivity(new Intent(QuakeStory.this, StartPage.class));
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
                setVisibility(firstChoice, secondChoice, messQuake1, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev, btnOk, wrongQuake1
                );
                break;
            case 1:
                // visible
                setVisibility(thirdChoice, fourthChoice, messQuake2, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev, btnOk, wrongQuake2
                );
                break;
            case 2:
                // visible
                setVisibility(fifthChoice, sixthChoice, messQuake3, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev, btnOk, wrongQuake3
                );
                break;
            case 3:
                // visible
                setVisibility(seventhChoice, eightChoice, messQuake4, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev, btnOk, wrongQuake4
                );
                break;
            case 4:
                // visible
                setVisibility(ninthChoice, tenthChoice, messQuake5, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev, btnOk, wrongQuake5
                );
                break;
            case 5:
                // visible
                setVisibility(eleventhChoice, twelveChoice, messQuake6, platform, floodCard);

                // gone
                setGone(
                        btnExit, btnNext, btnPrev, btnOk, wrongQuake6
                );
                break;
            default:
                break;
        }
    }

    public void pageThirdChoice(View view) {
        // visible
        setVisibility(wrongQuake2, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, thirdChoice
                ,fourthChoice, messQuake1,platform,floodCard, welldone, btnProceed, messQuake2
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void pageFourthChoice(View view) {
        // visible
        setVisibility(welldone, btnProceed, curtain);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, messQuake1,platform,floodCard, wrongQuake1, btnOk,
                thirdChoice, fourthChoice, messQuake2
        );

        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void pageFifthChoice(View view) {
        // visible
        setVisibility(welldone, btnProceed, curtain);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, messQuake1,platform,floodCard, wrongQuake1, btnOk,
                fifthChoice, sixthChoice, messQuake3
        );

        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void pageSixthChoice(View view) {
        // visible
        setVisibility(wrongQuake3, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, thirdChoice
                ,fourthChoice, messQuake1,platform,floodCard, welldone, btnProceed, messQuake2,
                fifthChoice, sixthChoice, messQuake3
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void pageSeventhChoice(View view) {
        // visible
        setVisibility(wrongQuake4, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, thirdChoice
                ,fourthChoice, messQuake1,platform,floodCard, welldone, btnProceed, messQuake2,
                seventhChoice, eightChoice, messQuake4
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void pageEightChoice(View view) {
        // visible
        setVisibility(welldone, btnProceed, curtain);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, messQuake1,platform,floodCard, wrongQuake1, btnOk,
                seventhChoice, eightChoice, messQuake4
        );

        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void pageNinthChoice(View view) {
        // visible
        setVisibility(welldone, btnProceed, curtain);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, messQuake1,platform,floodCard, wrongQuake1, btnOk,
                ninthChoice, tenthChoice, messQuake5
        );

        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void pageTenthChoice(View view) {
        // visible
        setVisibility(wrongQuake5, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, thirdChoice
                ,fourthChoice, messQuake1,platform,floodCard, welldone, btnProceed, messQuake2,
                ninthChoice, tenthChoice, messQuake5
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }

    public void pageEleventhChoice(View view) {
        // visible
        setVisibility(welldone, btnProceed, curtain);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, firstChoice
                ,secondChoice, messQuake1,platform,floodCard, wrongQuake1, btnOk,
                eleventhChoice, twelveChoice, messQuake6
        );

        mainLayout.setBackgroundResource(R.drawable.bg_plaindarken);
    }

    public void pageTwelveChoice(View view) {
        // visible
        setVisibility(wrongQuake6, btnOk);

        // gone
        setGone(
                btnExit, btnNext, btnPrev, thirdChoice
                ,fourthChoice, messQuake1,platform,floodCard, welldone, btnProceed, messQuake2,
                eleventhChoice, twelveChoice, messQuake6
        );

        mainLayout.setBackgroundResource((R.drawable.bg_plaindarken));
    }
}