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
public class Producto {
    private int codigo;
    private String nombre;
    private String marca;
    private int cant;
    private double precio;
    
    public Producto(int unCodigo, String unNombre, String unaMarca, int unaCant, double unPrecio){
        this.setCodigo(unCodigo);
        this.setNombre(unNombre);
        this.setMarca(unaMarca);
        this.setCant(unaCant);
        this.setPrecio(unPrecio);
    }
    @Override
    public String toString (){
        String aux= this.getCodigo()+" - "+this.getNombre()+" - "+this.getMarca()+" - "+this.getCant()+" - "+this.getPrecio();
        return aux;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
