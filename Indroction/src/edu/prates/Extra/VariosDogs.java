package edu.prates.Extra;

public class VariosDogs {

    public static void main(String[]args){

        ProjetoDogs bea = new ProjetoDogs();
        bea.raça = "Beagle";
        bea.tamanho = 40;
        bea.euSou = "Eu sou o Bea.";
        bea.latir();
        bea.setRaça(bea.getRaça());
        bea.setTamanho(bea.getTamanho());

        ProjetoDogs xiu = new ProjetoDogs();
        xiu.raça = "XiuAua";
        xiu.tamanho = 20;
        xiu.euSou = "Eu sou o Xiu.";
        xiu.latir();
        xiu.setRaça(xiu.getRaça());
        xiu.setTamanho(xiu.getTamanho());
    }

    

        

    
}
