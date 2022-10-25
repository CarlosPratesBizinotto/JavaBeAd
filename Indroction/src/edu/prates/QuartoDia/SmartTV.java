package edu.prates.QuartoDia;

public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 23;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }


    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando para: " + volume);
    }
    
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo para: " + volume);
    }


       
    
    
}
