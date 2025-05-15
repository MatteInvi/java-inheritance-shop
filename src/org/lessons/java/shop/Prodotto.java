package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
  protected String codice;
  protected String nome;
  protected String marca;
  protected float prezzo;
  protected float iva;
  Random random = new Random();    
  int codiceRandom = random.nextInt(1, 9999);

  public Prodotto(String nome, String marca, float prezzo, float iva) {
    this.codice = PAD_LEFT(codiceRandom);
    this.nome = nome;
    this.marca = marca;
    this.prezzo = prezzo;
    this.iva = iva;

  }

  // Metodi
   public static String PAD_LEFT(int codice){
    String stringCode = String.valueOf(codice);
    int lunghezza = stringCode.length();
    int zeriDaAggiuntere = 8 - lunghezza;
    String zeriDaInserire = "";;
    for (int i = 0; i < zeriDaAggiuntere; i++){
      zeriDaInserire += "0";
    }
    return (zeriDaInserire.concat(stringCode));

   }
  public String getCodice() {
    return this.codice;
  }

  public String getPrezzo() {
    String formattedPrice = String.format("%.2f", prezzo);
    return formattedPrice + "€ ";
  }

  public String getNome() {
    return this.nome + " ";
  }

  public String getMarca() {
    return this.marca + " ";
  }

  public String getIva() {
    return this.iva + "% ";
  }

  @Override
  public String toString() {
    return ("Codice prodotto: " + getCodice() + " Nome prodotto: " + getNome() + " Marca prodotto: " + getMarca()
        + " Prezzo prodotto: " + getPrezzo() + " Percentuale iva: " + getIva());
  }
  // Prova poco sensata per esercitarsi
  // public String trasmormaInSlashed(String frase ){
  // SostituienteLettere sostUtility = new SostituienteLettere();
  // return sostUtility.sostituisciConCarattereScelto(frase, ' ', '/');
  // }

}
