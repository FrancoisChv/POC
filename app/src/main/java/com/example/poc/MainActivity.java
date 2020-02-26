package com.example.poc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button validate;
    private Button inscription;
    private Vibrator vib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        validate = findViewById(R.id.valide_btn);
        inscription = findViewById(R.id.inscription_btn);

        vib=(Vibrator)getSystemService(MainActivity.VIBRATOR_SERVICE);

        validate.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                vib.vibrate(10);
                Intent MainActivity = new Intent(MainActivity.this, MenuActivity.class);
                    startActivity(MainActivity);
            }
        });

        inscription.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                vib.vibrate(10);
                Intent MainActivity = new Intent(MainActivity.this, InscriptionActivity.class);
                startActivity(MainActivity);
            }
        });
    }
}
