package com.example.disaster_app;
import android.os.Handler;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.welldone);
//        mediaPlayer.start();
    }

    public void openManual(View view) {
        startActivity(new Intent(MainActivity.this, Manual.class));
    }

    public void closeApp(View view) {
        finish();
    }

    public void startPage(View view) {
        startActivity(new Intent(MainActivity.this, StartPage.class));
    }
}