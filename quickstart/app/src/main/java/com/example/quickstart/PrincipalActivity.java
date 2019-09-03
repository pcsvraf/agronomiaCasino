package com.example.quickstart;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Locale;

public class PrincipalActivity extends AppCompatActivity {
    private static final long START_TIME_IN_MILLIS = 120000;
    //primero timer;
    LinearLayout l1;
    GuardarDatos datos;
    Button btningresar;
    Animation uptodown,downtoup;
    private boolean mTimerRunning;
    public static CountDownTimer mCountDownTimer;
    TextView textView;
    Animation anim;
    public static PrincipalActivity intancia = new PrincipalActivity();
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        textView = (TextView)findViewById(R.id.texto1);
        btningresar = (Button) findViewById(R.id.buttonsub);
        l1 = (LinearLayout) findViewById(R.id.l1);
        anim = AnimationUtils.loadAnimation(this,R.anim.traslacion);

        datos = GuardarDatos.instancia;
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        l1.setAnimation(uptodown);
        btningresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startTimer();
                datos.getOpciones().clear();
                datos.getOpciones2().clear();
                datos.getOpciones3().clear();
                datos.getOpciones5().clear();
                datos.getOpciones6().clear();
                datos.getOpciones7().clear();
                datos.getOpciones8().clear();
                datos.getOpciones9().clear();
                datos.getOpciones4().clear();

                Intent myintent = new Intent(PrincipalActivity.this,primero.class);
                startActivity(myintent);
            }
        });

    }
    private void startTimer() {
        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 10) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
            }

            @Override
            public void onFinish() {
                Intent myIntent = new Intent(getApplicationContext(), PrincipalActivity.class);
                startActivity(myIntent);
            }
        }.start();

        mTimerRunning = true;
    }







}
