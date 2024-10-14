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
public class ReporteMensual extends Matriz{
    public ReporteMensual (String unNombre, double unaLatitud, double unaLongitud, int unAnoBase, int unaCantAnos){
        super(unNombre,unaLatitud,unaLongitud,unAnoBase,unaCantAnos);
    }
    @Override
    public String toString(){
        String[] vecMeses=new String [12];
        vecMeses[0]="Enero";vecMeses[1]="Febrero";vecMeses[2]="Marzo";vecMeses[3]="Abril";vecMeses[4]="Mayo";vecMeses[5]="Junio";vecMeses[6]="Julio";
        vecMeses[7]="Agosto";vecMeses[8]="Septiembre";vecMeses[9]="Octubre";vecMeses[10]="Noviembre";vecMeses[11]="Diciembre";
        String aux= super.toString();
        int i;
        for (i=0; i<12;i++){
            aux=aux+"\n" + ("-Año "+vecMeses[i]+": "+this.calcularPromedio(i)+"°C");
        }
        return aux;
    }

    public double calcularPromedio (int i){
        int j;
        double aux=0;
        for (j=0;j<this.getCantAnos();j++){
            aux= aux+this.getTemperatura(j, i);
        }
        aux=(double)aux/this.getCantAnos();
        return aux;
    }
}
