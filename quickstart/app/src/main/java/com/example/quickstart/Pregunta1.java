package com.example.quickstart;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.CountDownTimer;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Locale;

public class Pregunta1 extends AppCompatActivity {
    Button pruebaa;
    GuardarDatos datos;
    TextView textView, textView2;
    TextView txt,txt2;
    DatabaseReference databaseReference;
    public static String seleccionado;

    TextView imagen1,imagen2,imagen3,imagen4,imagen5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta1);
        pruebaa = (Button)findViewById(R.id.prueba);
        txt = (TextView)findViewById(R.id.textView);
        imagen1 = (TextView) findViewById(R.id.like);
        imagen2 = (TextView) findViewById(R.id.dislike);
        databaseReference= FirebaseDatabase.getInstance().getReference();
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#006064")));
        txt.setText(Html.fromHtml(getResources().getString(R.string.pregunta1)));

        //instanciación global
        datos = GuardarDatos.instancia;
        //final ArrayList<String> opcion1 = datos.getOpciones();

        imagen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = imagen1.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado);
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("2").setValue(seleccionado);
                }
                datos.getOpciones().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(myintent);
            }
        });

        imagen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = imagen2.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado);
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("2").setValue(seleccionado);
                }
                datos.getOpciones().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(myintent);
            }
        });

        pruebaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datos.getOpciones().clear();
                datos.getOpciones5().clear();
                Intent myintent = new Intent(getApplicationContext(),primero.class);
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
