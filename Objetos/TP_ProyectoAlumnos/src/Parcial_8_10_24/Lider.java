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
public class Lider extends Programador {
    private int antiguedad;
    private int cant;
    
    public Lider (String unNombre, int unDNI, double unSueldo, int lineas, String len, int unaAntiguedad, int unaCant){
        super(unNombre,unDNI,unSueldo,lineas,len);
        this.setAntiguedad(unaAntiguedad);
        this.setCant(unaCant);
    }

    @Override
    public double calcularSueldoFinal (){
        double aux=this.getSueldo()+10000*this.getAntiguedad()+20000*this.getCant();
        return aux;
    }
    
    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
}
