/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UltimoEjercicio;

/**
 *
 * @author tamam
 */
public abstract class Coro {
    private String nombre;
    private Director direc;
    
    public Coro (String unNombre, Director unDirec){
        this.setNombre(unNombre);
        this.setDirec(unDirec);
    }
    
    public abstract void agregarCorista(Corista c);
    public abstract boolean lleno();
    public abstract boolean llenoYOrdenado();
    
        @Override
    public String toString(){
     String aux;
     aux= this.getNombre()+" "+direc.toString();
             return aux;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Director getDirec() {
        return direc;
    }

    public void setDirec(Director direc) {
        this.direc = direc;
    }
    
}