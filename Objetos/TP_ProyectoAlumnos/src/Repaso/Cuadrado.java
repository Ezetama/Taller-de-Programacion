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
public class Cuadrado {
    
    
    private String nombre;
    private int lado;
    
    public Cuadrado (String unNombre,int unLado){
        this.setLado(unLado);
        this.setNombre(unNombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    @Override
    public String toString (){
        String aux="Soy un cuadrado llamado: "+this.getNombre()+"cada uno de mis lados mide:"+this.getLado();
        return aux;
    }
    
    
}
