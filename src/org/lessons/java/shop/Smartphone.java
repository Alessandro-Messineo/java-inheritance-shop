package org.lessons.java.shop;

public class Smartphone extends Prodotto {

    protected int imei;
    protected int memoria;

    public Smartphone(String nome, String descrizione, float prezzo, int iva, int imei, int memoria) {
        super(nome, descrizione, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
    }

    // getter
    public int getImei() {
        return imei;
    }

    public int getMemoria() {
        return memoria;
    }

    // setter
    public void setImei(int imei) {
        this.imei = imei;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
}
