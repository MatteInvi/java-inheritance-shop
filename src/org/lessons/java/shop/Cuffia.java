package org.lessons.java.shop;

public class Cuffia extends Prodotto {
     protected String colore;
     protected String tipoConnessione;

     public Cuffia(String colore, String tipoConnessione, String nome, String marca, float prezzo, float iva) {
          this.colore = colore;
          this.tipoConnessione = tipoConnessione;
          super( nome, marca, prezzo, iva);
     }

     public String getColore(){
          return this.colore + " ";
     }

     public String getTipoConnessione(){
          return this.tipoConnessione + " ";
     }
     @Override
     public String toString(){
          return super.toString() + "Colore: " + getColore() + "Tipo connessione: " + getTipoConnessione();
     }
}
