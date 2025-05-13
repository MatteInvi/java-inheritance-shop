package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {
        Prodotto[] prodotti = new Prodotto[2];

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < prodotti.length; i++) {
            System.out.println("Inserisci nome");
            String nome = scan.nextLine();
            System.out.println("Inserisci marca");
            String marca = scan.nextLine();
            System.out.println("Inserisci prezzo");
            Float prezzo = Float.parseFloat(scan.nextLine());
            System.out.println("Inserisci iva");
            Float iva = Float.parseFloat(scan.nextLine());
            System.out.println("Inserisci che tipo di prodotto vuoi caricare tra: ");
            System.out.println("Smartphone/Televisore/Cuffie");
            String risposta = scan.nextLine();

            switch (risposta) {

                case "Smartphone":

                    System.out.println("Inserisci IMEI");
                    int IMEI = Integer.parseInt(scan.nextLine());
                    System.out.println("Inserisci memoria");
                    int memoria = Integer.parseInt(scan.nextLine());

                    Smartphone newSmartphone = new Smartphone(IMEI, memoria, nome, marca, prezzo, iva);
                    prodotti[i] = newSmartphone;
                    break;

                case "Televisore":

                    System.out.println("Inserisci i pollici");
                    int pollici = scan.nextInt();
                    System.out.println("Inserisci è smart?");
                    boolean smart = Boolean.parseBoolean(scan.nextLine());


                    Televisore newTelevisore = new Televisore(pollici, smart, nome, marca, prezzo, iva);
                    prodotti[i] = newTelevisore;
                    break;

                case "Cuffie":
                    System.out.println("Inserisci colore");
                    String colore = scan.nextLine();
                    System.out.println("Inserisci tipo di collegamento");
                    String tipoConnessione = scan.nextLine();


                    Cuffia newCuffia = new Cuffia(colore, tipoConnessione, nome, marca, prezzo, iva);
                    prodotti[i] = newCuffia;
                    break;

                default:
                prodotti[i] = new Prodotto(nome, marca, prezzo, iva);
                break;
            }

        }

        scan.close();
        System.out.println("Contenuto carrello: ");
        for (Prodotto p : prodotti) {
            System.out.println(p);
        }

    }
}
