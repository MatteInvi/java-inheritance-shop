package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto pc = new Prodotto("mio", "custom", 1200, 22);
        Smartphone iphone = new Smartphone(468454, 128,  "IPhone 13", "apple", 700, 22);
        Televisore lg = new Televisore(55, true, "NanoCell", "LG", 1300, 22);
        Cuffia sony = new Cuffia("Nera", "Wireless", "Bass", "Sony", 70, 22);
        
        System.out.println(pc.leggiProdotto());
        System.out.println(iphone.leggiSmartphone());
        System.out.println(lg.leggiTelevisore());
        System.out.println(sony.leggiCuffia());

    }
}
