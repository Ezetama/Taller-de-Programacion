/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso;

/**
 *
 * @author tamam
 */
public abstract class Persona {
    private String nombre;
    private int edad;
    private double peso;
    
    public Persona (String unNombre,int unaEdad,double unPeso){
        this.setNombre(unNombre);
        this.setEdad(unaEdad);
        this.setPeso(unPeso);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString (){
        String aux= "Nombre: "+this.getNombre()+" edad: "+this.getEdad()+" peso: "+this.getPeso();
        return aux;
    }
    
}
