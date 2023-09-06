package com.example;

import java.util.ArrayList;

public class Jogador {

    private int pontos = 0;

    private ArrayList<Carta> cartas = new ArrayList<Carta>();
    private boolean parou;


    public int getPontos() {
        return pontos;
    }
 
    public ArrayList<Carta> getCarta() {
        return cartas;
    }
   
    public boolean Parou() {
        return parou;
    }
    public void setParou(boolean parou) {
        this.parou = parou;
    }

 public void receberCarta (Carta cartas){
    this.pontos += cartas.getNumero();
    this.cartas.add(cartas);


 }

    public void parar(){
        this.parou = true;
    }




}