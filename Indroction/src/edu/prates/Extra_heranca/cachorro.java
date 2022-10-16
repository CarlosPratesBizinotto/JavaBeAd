package edu.prates.Extra_heranca;

public class cachorro extends Animal{
    
    String corDoPelo;

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
        System.out.println("A cor do pelo da AV é " + corDoPelo);
    }

}
