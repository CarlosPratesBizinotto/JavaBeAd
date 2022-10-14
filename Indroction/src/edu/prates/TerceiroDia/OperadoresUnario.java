package edu.prates.TerceiroDia;

public class OperadoresUnario {
    public static void main(String[]args){
        int numero = 5;

        numero = - numero; //fazer o numero positivo virar negativo

        System.out.println("Fazer o numero positivo virar negativo " + numero);

        numero = numero * -1; //fazer o numero negativo virar positivo

        System.out.println("Fazer o numero negativo virar positivo " + numero);

        numero = numero + 1;  //Uma forma de incremento.

        System.out.println("Vai pegar o numero 5 + 1 = " + numero);

        numero++;

        System.out.println("Vai fazer novamente porem com o ++, ficando  " + numero + " porque tinha somado 1 na anterior."); //Pode ser feito dessa forma tambem.
        
        System.out.println("O numero " + (++ numero) + " foi feito a soma ja direto na impressão usando print(++numero).");

        System.out.println("O numero " + (-- numero) + " foi o DECREMENTO usando print(--numero).");
    }
    
}
