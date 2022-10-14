package edu.prates.PrimeiroDia;

public class BoletimEstudante {
    public static void main(String[] args){
        int mediaFinal = 5;
        if(mediaFinal < 6)
           System.out.println("REPROVADO");
        else if (mediaFinal == 6)
           System.out.println("ULTIMA PROVA");
        else 
          System.out.println("APROVADO");
    }
}
