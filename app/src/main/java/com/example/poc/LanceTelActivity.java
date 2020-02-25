package com.example.poc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class LanceTelActivity extends AppCompatActivity {

    private Button param;
    private Button ajout;
    private Button lance;
    private Button log;

    private Vibrator vib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_lance_tel);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        param = findViewById(R.id.param_btn);
        ajout = findViewById(R.id.ajout_btn);
        lance = findViewById(R.id.lance_btn);
        log = findViewById(R.id.log_btn);

        vib = (Vibrator) getSystemService(MainActivity.VIBRATOR_SERVICE);

    }
}

