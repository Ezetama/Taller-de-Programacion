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
public class Libreria {
    private String nombre;
    private int numeroVenta;
    private Caja[] cajas;
    
    public Libreria (String unNombre, int maximoT){
        this.setNombre(unNombre);
        this.setNumeroVenta(0);
        cajas= new Caja[4];
        int i;
        for (i=0;i<4;i++)
            cajas[i]= new Caja(maximoT);
    }
    public void cerrarCajas (int x){
        int i;
        for (i=0;i<4;i++){
            cajas[i].chequeo(x);
        }
    }
    @Override
    public String toString (){
        String aux="Libreria: "+this.getNombre()+"\n";
        int i;
        for (i=0;i<4;i++){
            aux=aux+"Caja "+(i+1)+": "+cajas[i].toString();
        }
        return aux;
    }
    public Ticket mayorMonto (){
        int i;
        double montoMax=-1;
        Ticket elTicket= new Ticket ();//
        Ticket unTicket= new Ticket ();// Los inicializo para que no de error
        for (i=0;i<4;i++){
            unTicket= cajas[i].elMayorMonto();
           // System.out.println(unTicket.toString());
            if (unTicket.getMonto()>montoMax){
                elTicket=unTicket;
                montoMax=elTicket.getMonto();
            }
        }
        return elTicket;
    }
    public void agregarTicket (int nCaja, int dni, int cant, double monto, String metodoPago){
        int numero=this.getNumeroVenta();
        cajas[nCaja-1].agregarUnTicket (numero,dni,cant,monto,metodoPago);
        this.setNumeroVenta(this.getNumeroVenta()+1);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }
    
}
