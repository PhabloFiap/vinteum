package com.example;

public class Jogo {

    public Jogo(Monte monte, Jogador jogador, Computador computador) {
        this.monte = monte;
        this.jogador = jogador;
        this.computador = computador;
        monte.embaralhar();

    }

    public Carta distribuirCartaParaJogador(Jogador jogador){
        if(jogador.Parou()){
            return null;
        }
       
       
        Carta carta = monte.vira();
        jogador.receberCarta(carta);
        return carta;

    }


    Monte monte = new Monte();
    
    Jogador jogador = new Jogador();
    Computador computador = new Computador();

}
