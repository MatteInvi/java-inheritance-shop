package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto pc = new Prodotto("mio", "custom", 1200, 22);
        Smartphone iphone = new Smartphone(468454, 128,  "IPhone 13", "apple", 700, 22);
        Televisore lg = new Televisore(55, false, "NanoCell", "LG", 1300, 22);
        Cuffia sony = new Cuffia("Nera", "Wireless", "Bass", "Sony", 70, 22);
        
        System.out.println(Prodotto.PAD_LEFT(45564));
        System.out.println(pc.toString());
        System.out.println(iphone.toString());
        System.out.println(lg.toString());
        System.out.println(sony.toString());

    }
}
