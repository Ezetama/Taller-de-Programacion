/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author tamam
 */
public class Trabajador extends Persona {
    private String profesion;
    
    public Trabajador (String unNombre, int unDNI, int unaEdad, String unaProfesion ){
        super(unNombre,unDNI,unaEdad);
        this.setProfesion(unaProfesion);
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    @Override
    public String toString (){
        String aux= super.toString()+"Soy "+this.getProfesion();
        return aux;
    }
}
