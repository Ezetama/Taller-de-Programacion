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
public abstract class Persona {
    private String nombre;
    private int dni;
    private int edad;
    
    
public Persona (String unNombre, int unDni, int unaEdad){
    this.setNombre(unNombre);
    this.setDni(unDni);
    this.setEdad(unaEdad);
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString (){
        String aux="Nombre: "+this.getNombre()+" dni: "+this.getDni()+" edad: "+this.getEdad();
        return aux;
    }

}
