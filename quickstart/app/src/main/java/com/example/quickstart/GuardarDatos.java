package com.example.quickstart;

import java.util.ArrayList;

/*
 Se instancian cada una de las preguntas que tendra la aplicacion
 */

public class GuardarDatos {

    //instanciación global
    public static GuardarDatos instancia = new GuardarDatos();

    //datos

    private ArrayList<String> opcion5 = new ArrayList<String>();//primero(1)

    //obtener datos

    public ArrayList<String> getOpciones5(){
        return opcion5;
    }

    private ArrayList<String> opcion1 = new ArrayList<String>();//pregunta1(2)
    
    //obtener datos
    public ArrayList<String> getOpciones(){
        return opcion1;
    }

    private ArrayList<String> opcion2 = new ArrayList<String>();//pregunta2(3)

    //obtener datos
    public ArrayList<String> getOpciones2(){
        return opcion2;
    }

    private ArrayList<String> opcion3 = new ArrayList<String>();//pregunta3(4)

    //obtener datos
    public ArrayList<String> getOpciones3(){
        return opcion3;
    }


    private ArrayList<String> opcion4 = new ArrayList<String>();//ultima(9)

    //obtener datos
    public ArrayList<String> getOpciones4(){
        return opcion4;
    }

    private ArrayList<String> opcion6 = new ArrayList<String>();//cuarto(6)

    //obtener datos
    public ArrayList<String> getOpciones6(){
        return opcion6;
    }

    private ArrayList<String> opcion7 = new ArrayList<String>();//quinto(7)

    //obtener datos
    public ArrayList<String> getOpciones7(){
        return opcion7;
    }

    private ArrayList<String> opcion8 = new ArrayList<String>();//pregunta6(8)

    //obtener datos
    public ArrayList<String> getOpciones8(){
        return opcion8;
    }

    private ArrayList<String> opcion9 = new ArrayList<String>();//corte(5)

    //obtener datos
    public ArrayList<String> getOpciones9(){
        return opcion9;
    }

    private ArrayList<String> opcion10 = new ArrayList<String>();//pregunta 2 firebase seleccion multiple

    //obtener datos
    public ArrayList<String> getOpciones10(){
        return opcion10;
    }

    }