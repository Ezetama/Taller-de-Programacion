/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author tamam
 */
public class ReporteAnual extends Matriz{
    public ReporteAnual (String unNombre, double unaLatitud, double unaLongitud, int unAnoBase, int unaCantAnos){
        super(unNombre,unaLatitud,unaLongitud,unAnoBase,unaCantAnos);
    }
    @Override
    public String toString(){
        String aux= super.toString();
        int i;
        for (i=0; i<super.getCantAnos();i++){
            aux=aux+"\n" +("-Año "+(this.getAnoBase()+i)+": "+this.calcularPromedio(i)+"°C");
        }
        return aux;
    }

    public double calcularPromedio (int i){
        int j;
        double aux=0;
        for (j=0;j<12;j++){
            aux=aux+ this.getTemperatura(i,j);
        }
        aux=(double)aux/12;
        return aux;
    }
}
