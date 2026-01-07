package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanti prodotti vuoi inserire? ");
        int input = scanner.nextInt();
        scanner.nextLine();

        Prodotto[] carrello = new Prodotto[input];

        for (int i = 0; i < input; i++) {

            System.out.println("Che prodotto vuoi inserire? (smartphone / televisore / cuffie)");
            String tipo = scanner.nextLine().toLowerCase();

            if (!tipo.equals("smartphone") && !tipo.equals("televisore") && !tipo.equals("cuffie")) {
                System.out.println("Tipo non valido, riprova.");
                i--;
                continue;
            }

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Descrizione: ");
            String descrizione = scanner.nextLine();

            System.out.print("Prezzo: ");
            float prezzo = scanner.nextFloat();

            System.out.print("IVA: ");
            int iva = scanner.nextInt();
            scanner.nextLine();

            if (tipo.equals("smartphone")) {

                System.out.print("IMEI: ");
                int imei = scanner.nextInt();

                System.out.print("Memoria (GB): ");
                int memoria = scanner.nextInt();
                scanner.nextLine();

                carrello[i] = new Smartphone(nome, descrizione, prezzo, iva, imei, memoria);

            } else if (tipo.equals("televisore")) {

                System.out.print("Dimensioni: ");
                String dimensioni = scanner.nextLine();

                System.out.print("È smart? (true/false): ");
                boolean isSmart = scanner.nextBoolean();
                scanner.nextLine();

                carrello[i] = new Televisori(nome, descrizione, prezzo, iva, dimensioni, isSmart);

            } else if (tipo.equals("cuffie")) {

                System.out.print("Colore: ");
                String colore = scanner.nextLine();

                System.out.print("Sono wireless? (true/false): ");
                boolean isWireless = scanner.nextBoolean();
                scanner.nextLine();

                carrello[i] = new Cuffie(nome, descrizione, prezzo, iva, colore, isWireless);

            }
        }

        System.out.println("--- CONTENUTO CARRELLO ---");
        for (int i = 0; i < carrello.length; i++) {
            System.out.println(carrello[i]);
        }

        scanner.close();
    }
}
