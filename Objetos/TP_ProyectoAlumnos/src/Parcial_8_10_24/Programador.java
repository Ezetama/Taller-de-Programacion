/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial_8_10_24;

/**
 *
 * @author tamam
 */
public class Programador {
    private String nombre;
    private int dni;
    private double sueldo;
    private int lineasXHora;
    private String lenguaje;
    
    public Programador (String unNombre, int unDNI, double unSueldo, int lineas, String len){
        this.setNombre(unNombre);
        this.setDni(unDNI);
        this.setSueldo(unSueldo);
        this.setLineasXHora(lineas);
        this.setLenguaje(len);
    }

    public double calcularSueldoFinal (){
        double aux=this.getSueldo();
        if (this.getLineasXHora()>200)
            aux=aux+50000;
        return aux;
    }
    public void incrementarUnSueldo (double x){
        this.setSueldo(this.getSueldo()+x);
    }
    @Override
    public String toString (){
        String aux= this.getNombre()+this.getDni()+this.getLenguaje()+this.calcularSueldoFinal();
        return aux;
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getLineasXHora() {
        return lineasXHora;
    }

    public void setLineasXHora(int lineasXHora) {
        this.lineasXHora = lineasXHora;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    
}
