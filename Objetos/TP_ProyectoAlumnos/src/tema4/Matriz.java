/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author tamam
 */
public abstract class Matriz {
    private double[][] temperatura;
    private String nombre;
    private double latitud;
    private double longitud;
    private int anoBase;
    private int cantAnos;
    
    public Matriz(String unNombre, double unaLatitud, double unaLongitud, int unAnoBase, int unaCantAnos){
        this.setNombre(unNombre);
        this.setLatitud(unaLatitud);
        this.setLongitud(unaLongitud);
        this.setAnoBase(unAnoBase);
        this.setCantAnos(unaCantAnos);
        temperatura= new double[cantAnos][12];
        int i,j;
        for (i=0;i<this.getCantAnos();i++){
            for (j=0;j<12;j++){
                temperatura[i][j]=999;//GeneradorAleatorio.generarDouble(10)+100;
            }
        }
        
    }
    public void setTemperatura (int unAno,int unMes, double x){
        System.out.println(unAno-this.getAnoBase());
        temperatura[unAno-this.getAnoBase()][unMes-1]=x;
    }
    public double getTemperatura (int i, int j){
        return temperatura[i][j];
    }
    public int getCantAnos() {
        return cantAnos;
    }

    public void setCantAnos(int cantAños) {
        this.cantAnos = cantAños;
    }

    public int getAnoBase() {
        return anoBase;
    }

    public void setAnoBase(int añoBase) {
        this.anoBase = añoBase;
    }
    
    public String getNombre() {
        return nombre;
    }
    public String mayorTemp (){
        int i,j=0,mesMax,añoMax;
        double tempMax=-9999;
        for (i=0;i<this.getCantAnos();i++){
            for (j=0;j<12;j++){
                if (temperatura[i][j]>tempMax) {
                    tempMax= temperatura[i][j];
                    añoMax=i;
                    mesMax=j;
                }
            }
        }
        String aux= ("El año en el que hizo mas calor fue "+(this.getAnoBase()+i)+" en el mes "+(j+1));
        return aux;
    }
    @Override
    public String toString(){
        String aux= this.getNombre()+" ("+this.getLatitud()+" - "+this.getLongitud()+"):";
        return aux;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
