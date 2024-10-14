/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1;

/**
 *
 * @author tamam
 */
public class Ticket {
    private int numeroTicket;
    private int dni;
    private int cantCompras;
    private double monto;
    private String metodoPago;
    
    public Ticket (int unNumero, int unDNI, int cantCompra, double unMonto, String unMetodoPago){
        this.setNumeroTicket(unNumero);
        this.setDni(unDNI);
        this.setCantCompras(cantCompra);
        this.setMonto(unMonto);
        this.setMetodoPago(unMetodoPago);
        
    }
    @Override
    public String toString (){
        String aux= "numero de ticket: "+this.getNumeroTicket()+" dni del comprador: "+this.getDni()+" cantidad de libros comprados: "+this.getCantCompras()+
                    " monto de la compra: "+this.getMonto()+"$ metodo de pago: "+this.getMetodoPago();
        return aux;
    }
    public Ticket (){
        this.setMonto(-1);
    }

    public int getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCantCompras() {
        return cantCompras;
    }

    public void setCantCompras(int cantCompras) {
        this.cantCompras = cantCompras;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    
}

