package edu.metodos;

public class Controle {
    public static void main (String[] args) throws Exception {
    
    Metodos smartTv = new Metodos();

    smartTv.diminuirVolume();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();

    System.out.println("Canal Atual : " + smartTv.canal);

    smartTv.definirCanal(69);

    System.out.println("Canal Atual : " + smartTv.canal);

    System.out.println("TV Ligada ? " + smartTv.ligada);
   
    System.out.println("Volume Atual : " + smartTv.volume);

    smartTv.ligar();
    System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

    smartTv.desligar();
    System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
    
    // if (novoCanal = 69)
    // System.out.println("Nice");
    // else (novoCanal != 69)

    }
}
