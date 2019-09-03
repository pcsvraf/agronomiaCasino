package com.example.quickstart;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import com.google.api.client.util.ExponentialBackOff;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Arrays;

public class primero extends AppCompatActivity{
    PrincipalActivity timee;
    GuardarDatos datos;
    Animation uptodown,downtoup;
    GoogleAccountCredential mCredential;
    private TextView mOutputText;
    private Button mCallApiButton;
    RadioGroup radio;
    Button BOTON_RESPUESTAS, boton, boton1, boton2,boton4,boton5;
    ProgressDialog mProgress;
    TextView texto,txt, imagen1,imagen2,imagen3,imagen4, imagen5;
    public static String seleccionado1;
    RadioButton r1,r2,r3,r4;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primero);
        //instanciación global
        txt = (TextView) findViewById(R.id.textView4);
        BOTON_RESPUESTAS = (Button) findViewById(R.id.BTNsiguiente5);
        datos = GuardarDatos.instancia;
        final ArrayList<String> opcion5 = datos.getOpciones5();
        texto = (TextView) findViewById(R.id.textotime4);
        boton = (Button)findViewById(R.id.volver);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        //radio = (RadioGroup) findViewById(R.id.radioprimero);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#006064")));
        txt.setText(Html.fromHtml(getResources().getString(R.string.primero)));
        timee = PrincipalActivity.intancia;
        CountDownTimer countDownTimer = PrincipalActivity.mCountDownTimer;


        //imagen1 = (TextView) findViewById(R.id.dental);
        //imagen2 = (TextView) findViewById(R.id.social);
        //imagen3 = (TextView) findViewById(R.id.medico);
        //imagen4 = (TextView) findViewById(R.id.psicoedu);

        imagen1 = (TextView) findViewById(R.id.imagen1);
        imagen2 = (TextView) findViewById(R.id.imagen2);
        imagen3 = (TextView) findViewById(R.id.imagen3);
        imagen4 = (TextView) findViewById(R.id.imagen4);
        imagen5 = (TextView) findViewById(R.id.imagen5);
        databaseReference= FirebaseDatabase.getInstance().getReference();
        int nose = 0;

        imagen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado1 = imagen1.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado1);
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("1").setValue(seleccionado1);
                }
                datos.getOpciones5().add(seleccionado1);
                Intent myintent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(myintent);
            }
        });
        imagen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado1 = imagen2.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado1);
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("1").setValue(seleccionado1);
                }
                datos.getOpciones5().add(seleccionado1);
                Intent myintent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(myintent);
            }
        });
        imagen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado1 = imagen3.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado1);
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("1").setValue(seleccionado1);
                }
                datos.getOpciones5().add(seleccionado1);
                Intent myintent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(myintent);
            }
        });
        imagen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado1 = imagen4.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado1);
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("1").setValue(seleccionado1);
                }
                datos.getOpciones5().add(seleccionado1);
                Intent myintent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(myintent);
            }
        });
        imagen5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado1 = imagen5.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado1);
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("1").setValue(seleccionado1);
                }
                datos.getOpciones5().add(seleccionado1);
                Intent myintent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(myintent);
            }
        });
}

    private boolean isDeviceOnline() {
        ConnectivityManager connMgr =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        return (networkInfo != null && networkInfo.isConnected());
    }

}
