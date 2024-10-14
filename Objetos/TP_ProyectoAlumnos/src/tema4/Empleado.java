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
public abstract class Empleado {
    private String nombre;
    private double sueldo;
    private int antiguedad;
    
    public Empleado (String n,double s, int a){
        this.setNombre(n);
        this.setSueldo(s);
        this.setAntiguedad(a);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    public abstract double calcularEfectividad ();
    
    public double calcularSueldoACobrar (){
        double aux=this.getSueldo()+this.getSueldo()*this.getAntiguedad()*0.1;
        return aux;
        
    }
    @Override
    public String toString (){
        String aux = ("Nombre: "+this.getNombre()+" sueldo a cobrar (con su extra): "+this.calcularSueldoACobrar()+" y su efectividad es de "+this.calcularEfectividad());
        return aux;
    }
}
