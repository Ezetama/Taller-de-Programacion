/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial;

/**
 *
 * @author tamam
 */
public class Supermercado {
    private String nombre;
    private String direccion;
    private Gondola[] gondolas;
    private int df;
    
    public Supermercado(String unNombre, String unaDireccion, int cantGondolas, int cantEstantes){
        this.setNombre(unNombre);
        this.setDireccion(unaDireccion);
        df=cantGondolas;
        gondolas= new Gondola[df];
        int i;
        for (i=0;i<df;i++)
            gondolas[i]= new Gondola (cantEstantes);
        
    }
    public void agregarProducto (Producto p, int x, int y){
        gondolas[x-1].agregarProductoGondola(p,y-1);
    }
    public String vaciarGondola (int x){
        String aux;
        aux=gondolas[x-1].liberarEstantes();
        return aux;
    }
    @Override
    public String toString (){
        String aux="Supermercado: "+this.getNombre()+"; "+this.getDireccion();
        int i;
        for (i=0;i<df;i++){
            aux=aux+"\n"+"Gondola "+(i+1)+": "+gondolas[i].toString();
        }
        return aux;
    }
    public int marcaRepetida (String marca){
        int x=-1, cant=0,i;
        for (i=0;i<df;i++)
            if (cant<gondolas[i].cantRepetidas(marca)){
                System.out.println("Entreeee");
                cant= gondolas[i].cantRepetidas(marca);
                x=i+1;
            }
        return x;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
