package edu.prates.terceiraSemana;

public class OperadoresBoolean {
    public static void main(String[]args){
        boolean variavel = true;

        System.out.println("Vai imprimir a variel conforme foi declarada inicialmente, que é " + variavel);
        System.out.println("Se usar ! na variavel na impressão, ela inverte e fica " + !variavel + " porem é apenas na impressão, original ainda continua " + variavel);

        variavel = !variavel;

        System.out.println("Porem agora foi feito a alteração de negação da variavel original ficando " + variavel);
    }
    
}
