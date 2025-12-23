package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    // variabili di istanza
    private int codice;
    private String nome;
    private String descrizione;
    private float prezzo;
    private int iva;

    // costruttore vuoto
    public Prodotto() {
        this.codice = generaCodice();
        this.nome = "";
        this.descrizione = "";
        this.prezzo = 0.0f;
        this.iva = 0;
    }

    // costruttore con parametri
    public Prodotto(String nome, String descrizione, float prezzo, int iva) {
        this.codice = generaCodice();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // genera codice random
    private int generaCodice() {
        Random random = new Random();
        return random.nextInt(1000); // 0–999
    }

    // getter
    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public int getIva() {
        return iva;
    }

    // setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    // prezzo con iva
    public float getPrezzoConIva() {
        float prezzoIva = prezzo + (prezzo * iva / 100f);
        return Math.round(prezzoIva * 100) / 100f;
    }

    // nome completo
    public String getNomeCompleto() {
        return codice + "-" + nome;
    }
}
