package com.example;

import java.util.ArrayList;
import java.util.Collections;

public class Monte {
    
    private ArrayList<Carta> cartas = new ArrayList<Carta>();

    public ArrayList<Carta> getCarta() {
        return cartas;
    }

    public void setCarta(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }


    public void embaralhar(){
        Collections.shuffle(cartas);
    }

    public Monte (){
        for (Naipe naipe: Naipe.values()){
            for (int i = 1; i <=13; i++){
                cartas.add(new Carta(i, naipe));
            }
        }
    }

    public Carta vira(){
        return cartas.remove(0);
    
    }

}
