package org.lessons.java.shop;
public class Televisore extends Prodotto {
  protected float pollici;
  protected boolean smart;
  public String rispostaSmart;

  public Televisore(float pollici, boolean smart, String nome, String marca, float prezzo, float iva) {
    this.pollici = pollici;
    this.smart = smart;
    super( nome, marca, prezzo, iva);
  }

  public String getPollici(){
    return this.pollici + " ";
  }
  
 

  public String getSmart(){
        if (this.smart == true){
      this.rispostaSmart = "SI";
   } else {
      this.rispostaSmart = "NO";
   }

   return rispostaSmart;
  }
  


  
@Override
  public String toString(){
    return super.toString() + "Pollici televisore: " + getPollici() + "E' smart? " + getSmart();
  }
}
