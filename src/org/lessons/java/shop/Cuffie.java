package org.lessons.java.shop;

public class Cuffie extends Prodotto {

    protected String colore;
    protected boolean isWireless;

    public Cuffie(String nome, String descrizione, float prezzo, int iva, String colore, boolean isWireless) {
        super(nome, descrizione, prezzo, iva);
        this.colore = colore;
        this.isWireless = isWireless;
    }

    // getter
    public String getColore() {
        return colore;
    }

    public boolean getIsWireless() {
        return isWireless;
    }

    // setter
    public void setColore(String colore) {
        this.colore = colore;
    }

    public void setIsWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        return super.toString() +
                " - Colore: " + colore +
                " - Wireless: " + isWireless;
    }

}
