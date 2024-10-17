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
public class Streams {
    private String nombre;
    private String tipo;
    private int vistas;
    private Streamer youtuber;
    
    public Streams (String unNombre, String unTipo, int cantV, Streamer S){
        this.setNombre(unNombre);
        this.setTipo(unTipo);
        this.setVistas(cantV);
        this.setYoutuber(S);
    }
    
    @Override
    public String toString (){
        String aux=this.getNombre()+" - "+this.getTipo()+" - "+this.getVistas()+" - "+youtuber.toString();
        return aux;
    }
    
    public boolean chequearTipo (String x){
        boolean ok=false;
        if (this.getTipo().equals(x))
            ok=true;
        return ok;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVistas() {
        return vistas;
    }

    public void setVistas(int vistas) {
        this.vistas = vistas;
    }

    public Streamer getYoutuber() {
        return youtuber;
    }

    public void setYoutuber(Streamer youtuber) {
        this.youtuber = youtuber;
    }
    
}

