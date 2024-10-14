package Parcial1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tamam
 */
public class Caja {
    private boolean disponible;
    private Ticket[] tickets;
    private int dl;
    private int df;
    
    public Caja (int x){
        tickets= new Ticket[x];
        this.setDisponible(true);
        dl=0;
        df=x;
    }
    public void chequeo (int x){
        int suma=0,i=0;
        for (i=0;i<dl;i++){ //O uso un while y un booleano como corte?
            suma=suma+tickets[i].getCantCompras();
        }
        if (x>suma)
            this.setDisponible(false);
    }
    @Override
    public String toString (){
        String aux="";
        if (this.isDisponible()==true)
            aux=aux+"Disponible TICKETS: "+"\n";
        else
            aux=aux+"No disponible TICKETS: "+"\n";
        int i;
        for (i=0;i<dl;i++){
            aux=aux+tickets[i].toString()+"\n";
        }
        return aux;
    }
    public Ticket elMayorMonto (){
        int i;
        double montoMax=-1;
        Ticket unTicket= new Ticket();
        for (i=0;i<dl;i++){
            if (tickets[i].getMonto()>montoMax){
                montoMax=tickets[i].getMonto();
                unTicket=tickets[i];
            }
        }
        return unTicket;
    }
    public void agregarUnTicket(int numero, int dni, int cant, double monto, String metodoPago){
        if (dl<df){
            Ticket unTicket= new Ticket (numero,dni,cant,monto,metodoPago);
            tickets[dl]=unTicket;
            dl++;
        }
        else
            System.out.println("Se excedio el limete de tickets");
    } 
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}
