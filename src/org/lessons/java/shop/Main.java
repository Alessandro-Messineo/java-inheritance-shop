package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Smartphone nothing = new Smartphone("3A", "telefono con ia", 350, 22, 1234, 128);

        System.out.println("Smartphone ");

        System.out.println("codice: " + nothing.getCodice());
        System.out.println("nome: " + nothing.getNome());
        System.out.println("imei: " + nothing.getImei());
        System.out.println("prezzo con iva: " + nothing.getPrezzoConIva());

        System.out.println("-------------- ");
        System.out.println("Televisore ");

        Televisori samsung = new Televisori("TV", "tv in 4k", 999, 22, "106x93x52", true);

        System.out.println("codice: " + samsung.getCodice());
        System.out.println("dimensioni: " + samsung.getDimensioni());
        System.out.println("smart: " + samsung.getIsSmart());
        System.out.println("prezzo con iva: " + samsung.getPrezzoConIva());

        System.out.println("-------------- ");
        System.out.println("Cuffie ");

        Cuffie hyperx = new Cuffie("cloud stinger", "cuffie da gaming", 70, 22, "nero", false);

        System.out.println("codice: " + hyperx.getCodice());
        System.out.println("colore: " + hyperx.getColore());
        System.out.println("wireles: " + hyperx.getIsWireless());
        System.out.println("prezzo con iva: " + hyperx.getPrezzoConIva());

    }
}
