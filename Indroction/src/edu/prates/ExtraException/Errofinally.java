package edu.prates.ExtraException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Errofinally {
    
    public static void main(String[]args){

        Scanner s = new Scanner(System.in);
        boolean continuar = true;

        do{
           try{
                System.out.print("Numero: ");
                int a = s.nextInt();
                System.out.print("Divisor: ");
                 int b = s.nextInt();

                System.out.println(a / b);
                continuar = false;
    }
       catch(InputMismatchException e1){
         System.err.println("Favor inserir números inteiros");
         s.nextLine();//descartar entrada inválida
       }
       catch(Throwable e2){
         System.err.println("O divisor deve ser diferente de zero!");
       }
       finally{
         System.err.println("Finally executado...");
       }
       }while (continuar);

    }

}