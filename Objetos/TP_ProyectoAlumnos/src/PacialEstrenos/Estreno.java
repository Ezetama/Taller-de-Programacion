/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacialEstrenos;

/**
 *
 * @author tamam
 */
public class Estreno {
    private String titulo;
    private String tipo;
    private double recaudacion;
    private int vistas;
    
    public Estreno (String unTitulo,String unTipo, double unaRecaudacion, int unaVistas){
        this.setTitulo(unTitulo);
        this.setTipo(unTipo);
        this.setRecaudacion(unaRecaudacion);
        this.setVistas(unaVistas);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(double recaudacion) {
        this.recaudacion = recaudacion;
    }

    public int getVistas() {
        return vistas;
    }

    public void setVistas(int vistas) {
        this.vistas = vistas;
    }
    
    @Override
    public String toString (){
        String aux=" Titulo: "+this.getTitulo()+" "+this.getTipo()+" recaudacion: "+this.getRecaudacion()+" cantidad de vizualicaciones: "+this.getVistas();
        return aux;
    }
    
    
    
}
