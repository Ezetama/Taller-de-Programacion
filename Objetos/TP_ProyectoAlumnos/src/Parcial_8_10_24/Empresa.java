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
public class Empresa {
    private String nombre;
    private Lider programadorLider;
    private Programador[] equipo;
    private int dl;
    private int df;
    
    public Empresa (String unNombre, Lider p, int cant){
        this.setNombre(unNombre);
        this.setLider(p);
        dl=0;
        df=cant;
        equipo= new Programador[df];
    }
    
    public void agregarProgramador (Programador p){
        if (dl<df){
            equipo[dl]=p;
            dl++;
        }
        else 
            System.out.println("No hay mas espacio para ingresar programadores");
    }
    public double calcularGastos (){
        double aux=0;
        int i;
        for (i=0;i<dl;i++){
            aux=aux+equipo[i].calcularSueldoFinal();
        }
        aux=aux+programadorLider.calcularSueldoFinal();
        return aux;
    }
    public void incrementarSueldos (double monto){
        int i;
        for (i=0;i<dl;i++){
            equipo[i].incrementarUnSueldo(monto);
        }
        programadorLider.incrementarUnSueldo(monto);
    }
    @Override
    public String toString (){
        String aux= "Empresa: "+this.getNombre()+"\n"+"Programador lider: {"+programadorLider.toString()+"}"+"\n";
        int i;
        for (i=0;i<dl;i++){
            aux=aux+"Programador "+(i+1)+": {"+equipo[i].toString()+"}"+"\n";
        }
        aux=aux+"monto total en sueldos a abaonar de la empresa: "+this.calcularGastos();
        return aux;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Programador getLider() {
        return programadorLider;
    }

    public void setLider(Lider lider) {
        programadorLider = lider;
    }
    
}
