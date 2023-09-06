package com.example;

public class Carta {
    private int numero;
    private Naipe naipe;

    public Carta(int numero, Naipe naipe) {

        this.numero = numero;
        this.naipe = naipe;

    }

    



    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }




    
    public String imagePath() {

        return "classic-cards" + numero + this.naipe + ".png";
    }



}