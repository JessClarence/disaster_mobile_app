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

    private int[] drawableResources = new int[]{
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
    private int i = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        shuffleArray(drawableResources);
    }

    private void shuffleArray(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int item : array) {
            list.add(item);
        }
        Collections.shuffle(list);
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
    }

    public void pageNext(View view) {
        ConstraintLayout layout = findViewById(R.id.main);


        if (i < 9) { // should be 10
            layout.setBackgroundResource(drawableResources[i]);
            i++;
        } else {
            startActivity(new Intent(Quiz.this, StartPage.class));
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
}