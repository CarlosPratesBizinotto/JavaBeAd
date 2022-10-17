package edu.prates.ExtraException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
    
    public static void main(String[]args){

        try{

        Scanner s = new Scanner(System.in);
        System.out.print("Numero: ");

        int a = s.nextInt();
        System.out.print("Divisor: ");

        int b = s.nextInt();
        System.out.println(a / b);
    }
       catch(InputMismatchException e1){
         System.out.println("Erro de InputMismatchException capturado!");
       }
       catch(Throwable e2){
         System.out.println("Erro de ArithmaticException capturado!");
       }

    }

}
