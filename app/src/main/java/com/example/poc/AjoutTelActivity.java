package com.example.poc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class AjoutTelActivity extends AppCompatActivity {

    private Button validate;
    private Vibrator vib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_ajout_tel);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        validate = findViewById(R.id.valide_btn);

        vib=(Vibrator)getSystemService(MainActivity.VIBRATOR_SERVICE);

        validate.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                vib.vibrate(10);
                Intent AjouTelActivity = new Intent(AjoutTelActivity.this, MenuActivity.class);
                startActivity(AjouTelActivity);
            }
        });
    }
}
