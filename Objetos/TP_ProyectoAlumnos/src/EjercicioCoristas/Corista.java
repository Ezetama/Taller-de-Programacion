/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioCoristas;

/**
 *
 * @author tamam
 */
public class Corista extends Persona {
    private int tono;
    
    public Corista (String unNombre,int unDni, int unaEdad, int unTono){
        super(unNombre,unDni,unaEdad);
        this.setTono(unTono);
    }

    public int getTono() {
        return tono;
    }
    

    public void setTono(int tono) {
        this.tono = tono;
    }
    @Override
    public String toString (){
        String aux=super.toString()+" tono fundamental: "+this.getTono();
        return aux;
    }
}