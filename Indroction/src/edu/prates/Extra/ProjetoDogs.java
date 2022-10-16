package edu.prates.Extra;

public class ProjetoDogs {
    int tamanho;
    String raça;
    String euSou;


    void latir(){
        System.out.println(euSou);
    }

    public int getTamanho() {
        return tamanho;

    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
        System.out.println("Meu tamanho é " + tamanho + " cm.");
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
        System.out.println("Eu sou da raça " + raça);
    }
    
    public String getEuSou() {
        return euSou;
    }

    public void setEuSou(String euSou) {
        this.euSou = euSou;
    }
    
}
