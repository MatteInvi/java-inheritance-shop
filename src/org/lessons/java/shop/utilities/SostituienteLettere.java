package org.lessons.java.shop.utilities;

public class SostituienteLettere {
    public String sostituisciConCarattereScelto(String fraseDaModificare,char carattereDaSosituire, char carattereSostituente){
       StringBuilder stringBuilder = new StringBuilder(fraseDaModificare);
       
        for (int i = 0; i< fraseDaModificare.length(); i++){
        if (fraseDaModificare.charAt(i) == carattereDaSosituire){
            stringBuilder.setCharAt(i, carattereSostituente);
        }
       }
       return stringBuilder.toString();
    }

}
