package com.example;

public class Computador extends Jogador {
    
    @Override
    public boolean Parou(){
        if(this.getPontos()> 16){
            return true;
        }
        return false;


    }
}
