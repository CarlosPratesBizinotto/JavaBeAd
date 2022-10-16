package edu.prates.Extra;

public class MatematicaTeste {
    
    public static void main(String[]args){

        Matematica m = new Matematica();
        int maior = m.maior(50, 30);
        System.out.println(maior);

        double som = m.soma(40, 60);
        System.out.println(som);
    }
}
