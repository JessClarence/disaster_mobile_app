package com.example.disaster_app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Quiz extends AppCompatActivity {

    private int[] drawableQuestions = new int[]{
            R.drawable.q1,
            R.drawable.q2,
            R.drawable.q3,
            R.drawable.q4,
            R.drawable.q5,
            R.drawable.q6,
            R.drawable.q7,
            R.drawable.q8,
            R.drawable.q9,
            R.drawable.q10,
            R.drawable.q11,
            R.drawable.q12,
            R.drawable.q13,
            R.drawable.q14,
            R.drawable.q15};
    private int[] drawableqa = new int[]{
            R.drawable.q1a,
            R.drawable.q2a,
            R.drawable.q3a,
            R.drawable.q4a,
            R.drawable.q5a,
            R.drawable.q6a,
            R.drawable.q7a,
            R.drawable.q8a,
            R.drawable.q9a,
            R.drawable.q10a,
            R.drawable.q11a,
            R.drawable.q12a,
            R.drawable.q13a,
            R.drawable.q14a,
            R.drawable.q15a};
    private int[] drawableqb = new int[]{
            R.drawable.q1b,
            R.drawable.q2b,
            R.drawable.q3b,
            R.drawable.q4b,
            R.drawable.q5b,
            R.drawable.q6b,
            R.drawable.q7b,
            R.drawable.q8b,
            R.drawable.q9b,
            R.drawable.q10b,
            R.drawable.q11b,
            R.drawable.q12b,
            R.drawable.q13b,
            R.drawable.q14b,
            R.drawable.q15b};

    private int[] drawableqc = new int[]{
            R.drawable.q1c,
            R.drawable.q2c,
            R.drawable.q3c,
            R.drawable.q4c,
            R.drawable.q5c,
            R.drawable.q6c,
            R.drawable.q7c,
            R.drawable.q8c,
            R.drawable.q9c,
            R.drawable.q10c,
            R.drawable.q11c,
            R.drawable.q12c,
            R.drawable.q13c,
            R.drawable.q14c,
            R.drawable.q15c};
    private int i = 0;
    private List<Integer> indices = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        int length = drawableQuestions.length;
        for (int i = 0; i < length; i++) {
            indices.add(i);
        }
        Collections.shuffle(indices);

        reorderArray(drawableQuestions, indices);
        reorderArray(drawableqa, indices);
        reorderArray(drawableqb, indices);
        reorderArray(drawableqc, indices);
    }

    private void reorderArray(int[] array, List<Integer> indices) {
        int[] copy = array.clone();
        for (int i = 0; i < indices.size(); i++) {
            array[i] = copy[indices.get(i)];
        }
    }

    public void pageNext(View view) {
        ConstraintLayout layout = findViewById(R.id.main);
        ImageButton qa = findViewById(R.id.q1a);
        ImageButton qb = findViewById(R.id.q1b);
        ImageButton qc = findViewById(R.id.q1c);


        if (i < 9) { // should be 10
            layout.setBackgroundResource(drawableQuestions[i]);
            qa.setImageResource(drawableqa[i]);
            qb.setImageResource(drawableqb[i]);
            qc.setImageResource(drawableqc[i]);
            i++;
        } else {
            startActivity(new Intent(Quiz.this, StartPage.class)); // remove later
        }
    }

    public void q1aButton(View view) {
        ImageButton imageButton = findViewById(R.id.q1a);
        imageButton.setImageResource(R.drawable.q1aw);
    }

    public void q1bButton(View view) {
        ImageButton imageButton = findViewById(R.id.q1b);
        imageButton.setImageResource(R.drawable.q1bc);
    }

    public void q1cButton(View view) {
        ImageButton imageButton = findViewById(R.id.q1c);
        imageButton.setImageResource(R.drawable.q1cw);
    }

    public void backPage(View view) {
        startActivity(new Intent(Quiz.this, StartPage.class));
    }
}