/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioCoristas;

/**
 *
 * @author tamam
 */
public abstract class Coro {
    private String nombre;
    private Director dire;
    
    public Coro (String unNombre, Director unDirector){
        this.setNombre(unNombre);
        this.setDire(unDirector);
    }

    public abstract void agregarCorista (Corista c);
    public abstract boolean capacidad ();
    public abstract boolean orden ();
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Director getDire() {
        return dire;
    }

    public void setDire(Director dire) {
        this.dire = dire;
    }
 
    @Override
    public String toString(){
        String aux="Nombre del coro: "+this.getNombre()+"\n"+dire.toString();
        return aux;
    }
}
