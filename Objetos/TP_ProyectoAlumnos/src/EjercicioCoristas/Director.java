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
public class Director extends Persona {
    private int antiguedad;
    
    public Director (String unNombre,int unDni, int unaEdad, int unaAntiguedad){
        super(unNombre,unDni,unaEdad);
        this.setAntiguedad(unaAntiguedad);
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString (){
        String aux= "Director "+super.toString()+" antiguedad: "+this.getAntiguedad()+" años";
        return aux;
    }
}

