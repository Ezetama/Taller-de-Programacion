/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UltimoEjercicio;

/**
 *
 * @author tamam
 */
public class Corista extends Persona {
    private int tonoFundamental;
    
    public Corista (String unNombre,int unDNI, int unaEdad, int tono){
    super (unNombre,unDNI,unaEdad);
    this.setTonoFundamental(tono);
    }
    @Override
    public String toString (){
        String aux=super.toString()+" tono fundamental "+this.getTonoFundamental()+"\n";
        return aux;
    }
    public int getTonoFundamental() {
        return tonoFundamental;
    }

    public void setTonoFundamental(int tonoFundamental) {
        this.tonoFundamental = tonoFundamental;
    }

}