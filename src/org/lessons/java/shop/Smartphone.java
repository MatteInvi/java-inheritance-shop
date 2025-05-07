package org.lessons.java.shop;
public class Smartphone extends Prodotto {
    protected int IMEI;
    protected int memoria;

    public Smartphone(int IMEI, int memoria, String nome, String marca, float prezzo, float iva) {
        this.IMEI = IMEI;
        this.memoria = memoria;
        super(nome, marca, prezzo, iva);
    }

    public String getIMEI(){
        return this.IMEI  + " ";
    }

    public String getMemoria(){
        return this.memoria + " ";
    }

    public  String leggiSmartphone(){
        return "Codice IMEI: " + getIMEI() + "Quantità memoria: " + getMemoria() + leggiProdotto();
      }
}
