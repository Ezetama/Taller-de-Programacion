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
public class Director extends Persona {
    private int antiguedad;
    
    public Director (String unNombre,int unDNI, int unaEdad, int ant){
        super (unNombre,unDNI,unaEdad);
        this.setAntiguedad(ant);
    }
    @Override
    public String toString (){
        String aux="Director "+ super.toString()+" antiguedad: "+this.getAntiguedad()+"\n";
        return aux;
    }
    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
}