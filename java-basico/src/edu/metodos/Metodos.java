package edu.metodos;

public class Metodos {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void subirCanal(){
        canal++;

    }

    public void descerCanal(){
        canal--;

    }

    public void definirCanal(int novoCanal){
        canal = novoCanal;

    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume: " + volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

}
