package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Smartphone nothing = new Smartphone("3A", "telefono con ia", 350, 22, 1234, 128);

        System.out.println("codice: " + nothing.getCodice());
        System.out.println("nome: " + nothing.getNome());
        System.out.println("imei: " + nothing.getImei());
    }
}
