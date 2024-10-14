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
public class Entrenador extends Empleado {
    private int campeonatosGanados;

    public Entrenador (String unNombre, double unSueldo, int unaAntiguedad, int cg){
        super(unNombre,unSueldo,unaAntiguedad);
        this.setCampeonatosGanados(cg);
    }
    public int getCampeonatosGanados() {
        return campeonatosGanados;
    }

    public void setCampeonatosGanados(int campeonatosGanados) {
        this.campeonatosGanados = campeonatosGanados;
    }
    @Override
    public double calcularEfectividad (){
        double aux= this.getCampeonatosGanados()/this.getAntiguedad();
        return aux;
    }
    @Override
    public double calcularSueldoACobrar() {
    double aux= super.calcularSueldoACobrar();
    if ((this.getCampeonatosGanados()>0) && (this.getCampeonatosGanados()<5))
        aux=aux+5000;
    else {
        if ((this.getCampeonatosGanados()>4)&&(this.getCampeonatosGanados()<11))
            aux=aux+30000;
        else
            aux=aux+50000;
    }
    return aux;
    
}
}
