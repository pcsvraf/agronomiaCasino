package com.example.quickstart;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    PrincipalActivity tiempo;
    LinearLayout l1;
    TextView textView;
    Animation uptodown,downtoup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        tiempo = PrincipalActivity.intancia;
        textView = (TextView) findViewById(R.id.textfinal);
        l1 = (LinearLayout) findViewById(R.id.l1);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#006064")));
        l1.setAnimation(uptodown);
    }

    CountDownTimer timer = new CountDownTimer(7000,10) {
       @Override
       public void onTick(long l) {
        textView.setText("este es el tiempo: "+ l);
       }

       @Override
       public void onFinish() {
           Intent i = getBaseContext().getPackageManager().getLaunchIntentForPackage(getBaseContext().getPackageName());
           i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
           startActivity(i);

       }

   }.start();




}
