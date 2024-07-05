package com.example.disaster_app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Quiz extends AppCompatActivity {

    private int[] drawableQuestions = new int[]{
            R.drawable.q1, R.drawable.q2, R.drawable.q3, R.drawable.q4, R.drawable.q5,
            R.drawable.q6, R.drawable.q7, R.drawable.q8, R.drawable.q9, R.drawable.q10,
            R.drawable.q11, R.drawable.q12, R.drawable.q13, R.drawable.q14, R.drawable.q15};
    private int[] drawableqa = new int[]{
            R.drawable.q1a, R.drawable.q2a, R.drawable.q3a, R.drawable.q4a, R.drawable.q5a,
            R.drawable.q6a, R.drawable.q7a, R.drawable.q8a, R.drawable.q9a, R.drawable.q10a,
            R.drawable.q11a, R.drawable.q12a, R.drawable.q13a, R.drawable.q14a, R.drawable.q15a};
    private int[] drawableqb = new int[]{
            R.drawable.q1b, R.drawable.q2b, R.drawable.q3b, R.drawable.q4b, R.drawable.q5b,
            R.drawable.q6b, R.drawable.q7b, R.drawable.q8b, R.drawable.q9b, R.drawable.q10b,
            R.drawable.q11b, R.drawable.q12b, R.drawable.q13b, R.drawable.q14b, R.drawable.q15b};
    private int[] drawableqc = new int[]{
            R.drawable.q1c, R.drawable.q2c, R.drawable.q3c, R.drawable.q4c, R.drawable.q5c,
            R.drawable.q6c, R.drawable.q7c, R.drawable.q8c, R.drawable.q9c, R.drawable.q10c,
            R.drawable.q11c, R.drawable.q12c, R.drawable.q13c, R.drawable.q14c, R.drawable.q15c};

    private int[] correctAnswers = new int[]{
            1, 0, 1, 2, 1, 2, 2, 1, 1, 0, 2, 0, 2, 1, 1};

    private int i = 0;
    private int currentIndex;
    private int correctCount = 0;
    private List<Integer> indices;
    private ImageButton qa, qb, qc;
    private ImageButton scoreButton;
    private ImageButton btnNext;
    private ImageButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        indices = new ArrayList<>();
        int length = drawableQuestions.length;
        for (int i = 0; i < length; i++) {
            indices.add(i);
        }
        Collections.shuffle(indices);

        reorderArray(drawableQuestions, indices);
        reorderArray(drawableqa, indices);
        reorderArray(drawableqb, indices);
        reorderArray(drawableqc, indices);

        qa = findViewById(R.id.qa);
        qb = findViewById(R.id.qb);
        qc = findViewById(R.id.qc);
        scoreButton = findViewById(R.id.scoreButton);
        btnNext = findViewById(R.id.btnNext);
        btnBack = findViewById(R.id.btnBack);

        scoreButton.setVisibility(View.GONE);  // Initially hide the score button
        btnNext.setEnabled(false); // Initially disable the next button

        pageNext(null);
    }

    private void reorderArray(int[] array, List<Integer> indices) {
        int[] copy = array.clone();
        for (int i = 0; i < indices.size(); i++) {
            array[i] = copy[indices.get(i)];
        }
    }

    public void pageNext(View view) {
        btnNext.setEnabled(false);
        if (i < 10) { // Only display 10 questions
            ConstraintLayout layout = findViewById(R.id.main);
            layout.setBackgroundResource(drawableQuestions[i]);

            qa.setImageResource(drawableqa[i]);
            qb.setImageResource(drawableqb[i]);
            qc.setImageResource(drawableqc[i]);

            qa.setEnabled(true);
            qb.setEnabled(true);
            qc.setEnabled(true);

            qa.setVisibility(View.VISIBLE);
            qb.setVisibility(View.VISIBLE);
            qc.setVisibility(View.VISIBLE);
            scoreButton.setVisibility(View.GONE);  // Hide the score button during the quiz
            btnBack.setVisibility(View.VISIBLE);  // Show the back button during the quiz

            currentIndex = indices.get(i);
            i++;
        } else {
            showScore(); // Show the score after 10 questions
        }
    }

    private void showScore() {
        ConstraintLayout layout = findViewById(R.id.main);
        layout.setBackgroundResource(R.drawable.score);

        qa.setVisibility(View.GONE);
        qb.setVisibility(View.GONE);
        qc.setVisibility(View.GONE);
        btnBack.setVisibility(View.GONE);  // Hide the back button when showing the score

        int scoreDrawable = getResources().getIdentifier("score" + correctCount, "drawable", getPackageName());
        scoreButton.setImageResource(scoreDrawable);
        scoreButton.setVisibility(View.VISIBLE);

        btnNext.setEnabled(true);
        btnNext.setImageResource(R.drawable.backbutton);
        btnNext.setOnClickListener(v -> startActivity(new Intent(Quiz.this, StartPage.class)));
    }

    public void q1aButton(View view) {
        handleButtonClick(qa, 0);
    }

    public void q1bButton(View view) {
        handleButtonClick(qb, 1);
    }

    public void q1cButton(View view) {
        handleButtonClick(qc, 2);
    }

    private void handleButtonClick(ImageButton clickedButton, int answerIndex) {
        qa.setEnabled(false);
        qb.setEnabled(false);
        qc.setEnabled(false);

        if (correctAnswers[currentIndex] == answerIndex) {
            clickedButton.setImageResource(getResources().getIdentifier(
                    "q" + (currentIndex + 1) + (char)('a' + answerIndex) + "c",
                    "drawable", getPackageName()));
            correctCount++;

        } else {
            clickedButton.setImageResource(getResources().getIdentifier(
                    "q" + (currentIndex + 1) + (char)('a' + answerIndex) + "w",
                    "drawable", getPackageName()));

            // Show the correct answer
            if (correctAnswers[currentIndex] == 0) {
                qa.setImageResource(getResources().getIdentifier(
                        "q" + (currentIndex + 1) + "ac",
                        "drawable", getPackageName()));
            } else if (correctAnswers[currentIndex] == 1) {
                qb.setImageResource(getResources().getIdentifier(
                        "q" + (currentIndex + 1) + "bc",
                        "drawable", getPackageName()));
            } else if (correctAnswers[currentIndex] == 2) {
                qc.setImageResource(getResources().getIdentifier(
                        "q" + (currentIndex + 1) + "cc",
                        "drawable", getPackageName()));
            }
        }
        btnNext.setEnabled(true);
    }

    public void backButton(View view) {
        startActivity(new Intent(Quiz.this, StartPage.class));
    }
}
