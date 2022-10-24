package edu.prates.QuartoDia;

public class Usuario {

    public static void main (String []args){

        SmartTV smartTv = new SmartTV();
        
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        System.out.println("Canal atual é: " + smartTv.canal);  
        smartTv.mudarCanal(10);
        System.out.println("Canal atual é: " + smartTv.canal);  

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

    



    }
    
}
