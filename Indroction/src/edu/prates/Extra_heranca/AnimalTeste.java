package edu.prates.Extra_heranca;

public class AnimalTeste {
    public static void main(String[]args){

        cachorro Av = new cachorro();
        Av.nome = "Av";
        Av.corDoPelo = "Caramelo";
        Av.nomeComida = "Ração";
        Av.Dormir();
        Av.setCorDoPelo(Av.getCorDoPelo());

        galinha Lu = new galinha();
        Lu.nome = "Lulu";
        Lu.corDaPena = "Marron";
        Lu.nomeComida = "Milho";
        Lu.Dormir();


    }
    
}
