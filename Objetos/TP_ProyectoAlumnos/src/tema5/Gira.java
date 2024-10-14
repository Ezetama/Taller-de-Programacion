/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;


/**
 *
 * @author tamam
 */
public class Gira extends Recital {
    private String nombreGira;
    private Fecha[] fechas;
    private int cantFechas;
    private int actual;
    private int dl;
    
    public Gira (String nombreBanda, int cantCan, String unNombre, int cant){
        super(nombreBanda,cantCan);
        this.setNombre(unNombre);
        this.setCantFechas(cant);
        fechas= new Fecha [cantFechas];
        actual= 0;
        dl=0;
    }
    public void agregarFecha(Fecha f){
        if (dl<this.getCantFechas()){
            fechas[dl]=f;
            dl++;
        }
        else
            System.out.println("No hay espacio para agregar la fecha");
    }
    @Override
    public String actuar(){
        String aux="";
        if (actual<cantFechas){
            aux="Buenas noches "+ fechas[actual].getCiudad();
            aux=aux+super.actuar();
            actual++;
        }
        return aux;
    }
    @Override
    public double calcularCosto (){
       double aux=30000*this.getCantFechas();
       return aux;
    }
    public String getNombreGira() {
        return nombreGira;
    }

    public void setNombreGira(String nombre) {
        this.nombreGira = nombre;
    }

    public int getCantFechas() {
        return cantFechas;
    }

    public void setCantFechas(int cantFechas) {
        this.cantFechas = cantFechas;
    }
    
}
