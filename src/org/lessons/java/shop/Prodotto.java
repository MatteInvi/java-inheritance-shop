package org.lessons.java.shop;

import java.util.Random;

import org.lessons.java.shop.utilities.SostituienteLettere;

public class Prodotto {
  protected int codice;
  protected String nome;
  protected String marca;
  protected float prezzo;
  protected float iva;

  public Prodotto(String nome, String marca, float prezzo, float iva) {
    this.nome = nome;
    this.marca = marca;
    this.prezzo = prezzo;
    this.iva = iva;
  }

  // Metodi
  public String getCodice() {
    Random randomCode = new Random();
    return randomCode.nextInt(1000000) + " ";
  }

  public String getPrezzo() {
    String formattedPrice = String.format("%.2f", prezzo);
    return formattedPrice + "€ ";
  }

  public String getNome(){
   return this.nome + " ";
  }

  public String getMarca(){
    return this.marca + " ";
  }

  public String getIva(){
    return this.iva + "% ";
  }

  public String leggiProdotto(){
    return this.trasmormaInSlashed("Codice prodotto: " + getCodice() + "Nome prodotto: " + getNome() + "Marca prodotto: " + getMarca()
    + "Prezzo prodotto: " + getPrezzo() + "Percentuale iva: " + getIva());
  }
// Prova poco sensata per esercitarsi
  public String trasmormaInSlashed(String frase ){
    SostituienteLettere sostUtility = new SostituienteLettere();
    return sostUtility.sostituisciConCarattereScelto(frase, ' ', '/');
  }






}


