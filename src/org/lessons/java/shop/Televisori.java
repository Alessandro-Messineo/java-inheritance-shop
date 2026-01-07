package org.lessons.java.shop;

public class Televisori extends Prodotto {

    protected String dimensioni;
    protected boolean isSmart;

    public Televisori(String nome, String descrizione, float prezzo, int iva, String dimensioni, boolean isSmart) {
        super(nome, descrizione, prezzo, iva);
        this.dimensioni = dimensioni;
        this.isSmart = isSmart;
    }

    // getter
    public String getDimensioni() {
        return dimensioni;
    }

    public boolean getIsSmart() {
        return isSmart;
    }

    // setter
    public void setDimensioni(String dimensioni) {
        this.dimensioni = dimensioni;
    }

    public void setIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return super.toString() +
                " - Dimensioni: " + dimensioni +
                " - Smart: " + isSmart;
    }

}
