/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author tamam
 */
public class Habitacion {
    private double costo;
    private boolean ocupado;
    private Cliente clien;
    

    public Habitacion() {
        this.costo = GeneradorAleatorio.generarDouble(6000)+2001;
        this.ocupado = false;
    }
    public void cargarCliente (Cliente cli){
        ocupado=true;
        clien=cli;
    }
    public void aumentar (double x){
        costo=costo+x;
    }
    public double getCosto() {
        return costo;
    }

    public boolean getOcupado() {
        return ocupado;
    }

    public Cliente getClien() {
        return clien;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void setClien(Cliente clien) {
        this.clien = clien;
    }
    public String informe (){
        String aux= (costo+"$");
        if (ocupado==true)
            aux+=" Ocupada "+clien.toString();
        else
            aux+=" Libre";
        return aux;
            
    }
}
