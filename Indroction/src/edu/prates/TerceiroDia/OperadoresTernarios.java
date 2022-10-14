package edu.prates.TerceiroDia;

public class OperadoresTernarios {
    public static void main(String[]args){
        int a, b;

        a = 6;
        b = 6;
        String resultado = a==b ? "Verdadeiro" : "Falso";

        /*EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         if(a==b)
            resultado = "Verdadeiro";
         else
            resultado = "Falso"; */
         
         System.out.println("Resultado quando é tipo String " + resultado);   

         /*AGORA DE FORMA MAIS RESUMIDA PARA FAZER O MESMO PROCESSO
          * String resultado = a==b ? "Verdadeiro" : "Falso";
          */

        //Podemos fazer caso seja com numero

        int resultado2 = a == b ? 1 : 0;

        System.out.println("Resultado quando for do tipo int " + resultado2);

    }
    
}
