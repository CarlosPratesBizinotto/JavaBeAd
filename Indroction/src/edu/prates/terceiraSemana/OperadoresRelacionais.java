package edu.prates.terceiraSemana;

public class OperadoresRelacionais {
    public static void main(String[]args){
        int numero1 = 1;
        int numero2 = 2;

        String nomeUm = "CARLOS";
        String nomeDois = "VINICIUS";

        boolean simNao = numero1 == numero2;

        System.out.println("Numero Um é igual a numero Dois? " + simNao);
    
        simNao = numero1 != numero2;

        System.out.println("Numero Um é diferente a numero Dois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero Um é maior que numero Dois? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("Numero Um é menor que numero Dois? " + simNao);
    
        System.out.println("Usando String para saber se o nomeUm e igual o nomeDois, o resutlado é " + nomeUm == nomeDois);
    
    }
    
}
