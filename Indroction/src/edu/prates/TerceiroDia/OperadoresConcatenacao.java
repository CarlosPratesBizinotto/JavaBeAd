package edu.prates.TerceiroDia;

public class OperadoresConcatenacao {
    
    public static void main(String[]args){
        String nomeCompleto = "LINGUAGEM " + "JAVA";

        String concatenacao = "?";

        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

        System.out.println(nomeCompleto);
        //Exemplo Concatenacao String simples
    }
}
