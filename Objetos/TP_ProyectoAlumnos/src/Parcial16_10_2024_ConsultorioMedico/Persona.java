/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial16_10_2024_ConsultorioMedico;

/**
 *
 * @author tamam
 */
public abstract class Persona {
    private int dni;
    private String apellido;
    private String nombre;
    private int telefono;
    
    public Persona (int unDNI, String unApellido, String unNombre, int unTelefono){
        this.setDni(unDNI);
        this.setApellido(unApellido);
        this.setNombre(unNombre);
        this.setTelefono(unTelefono);
    }
    @Override
    public String toString (){
        String aux= "DNI: "+this.getDni()+" apellido: "+this.getApellido()+" nombre: "+this.getNombre()+" telefono "+this.getTelefono()+" ";
        return aux;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
