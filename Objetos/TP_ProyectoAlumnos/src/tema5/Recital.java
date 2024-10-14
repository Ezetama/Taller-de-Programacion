/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *
 * @author tamam
 */
public abstract class Recital {
    private String nombre;
    private int cantCanciones;
    private String[] temas;
    private int dl;
   
    public Recital (String unNombre, int cantidadCanciones){
        this.setNombre(unNombre);
        this.setCantCanciones(cantidadCanciones);
        temas= new String[cantCanciones];
        dl=0;
    }
    
    public void agregarTema(String cancion){
        if (dl<cantCanciones){
            temas[dl]=cancion;
            dl++;
        }
    }
    public String actuar (){
        int i;
        String aux="";
        for (i=0;i<this.getCantCanciones();i++){
            aux=aux+" y ahora tocaremos "+temas[i]+"\n ";
        }
        return aux;
    }
    public abstract double calcularCosto ();
            
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantCanciones() {
        return cantCanciones;
    }

    public void setCantCanciones(int cantCanciones) {
        this.cantCanciones = cantCanciones;
    }
    
}

