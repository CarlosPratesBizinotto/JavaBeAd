package edu.prates.Extra;

public class ContaTeste {

    public static void main(String[]args){

        Conta conta = new Conta();
        conta.cliente = "Carlos";
        conta.saldo = 4000.00;
        conta.exibirsaldo();

        //conta.saque(2000);
       //conta.exibirsaldo();
        
       //conta.deposito(8000);
      //conta.exibirsaldo();

        Conta destino = new Conta();
        destino.cliente = "Andrea";
        destino.saldo = 5000.00;
        destino.exibirsaldo();

        destino.deposito(2000);
        destino.exibirsaldo();

        destino.transferenciaValor(conta, 1500);
        destino.exibirsaldo();
        conta.exibirsaldo();

    
    }
    
}
