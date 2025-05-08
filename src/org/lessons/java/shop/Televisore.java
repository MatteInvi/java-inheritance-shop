package org.lessons.java.shop;
public class Televisore extends Prodotto {
  protected float pollici;
  protected boolean smart;
  String rispostaSmart;

  public Televisore(float pollici, boolean smart, String nome, String marca, float prezzo, float iva) {
    this.pollici = pollici;
    this.smart = smart;
    super(nome, marca, prezzo, iva);
  }

  public String getPollici(){
    return this.pollici + " ";
  }
  
 
  public String getSmart(){
    if (this.smart == true){
      rispostaSmart = "SI";
   } else {
     rispostaSmart = "NO";
   }

      return rispostaSmart + " ";
  }
    
  


  

  public String leggiTelevisore(){
    return "Pollici televisore: " + getPollici() + "E' smart? " + getSmart() + leggiProdotto();
  }
}
