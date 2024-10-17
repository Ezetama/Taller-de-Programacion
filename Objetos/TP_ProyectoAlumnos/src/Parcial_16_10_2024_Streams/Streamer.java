/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial_16_10_2024_Streams;

/**
 *
 * @author tamam
 */
public class Streamer {
    private String nombre;
    private int follows;
    private int horas;
    
    public Streamer (String unNombre, int cantF, int cantH){
        this.setNombre(unNombre);
        this.setFollows(cantF);
        this.setHoras(cantH);
    }

    @Override
    public String toString (){
        String aux="Nombre del Streamer: "+this.getNombre()+" followers: "+this.getFollows()+" horas streameadas: "+this.getHoras();
        return aux;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFollows() {
        return follows;
    }

    public void setFollows(int follows) {
        this.follows = follows;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
}
