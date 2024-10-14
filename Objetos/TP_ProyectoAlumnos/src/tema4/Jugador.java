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
public class Jugador extends Empleado {
    private int partidosJugados;
    private int golesAnotados;

    public Jugador (String unNombre, double unSueldo, int unaAntiguedad, int pj, int ga){
        super(unNombre,unSueldo,unaAntiguedad);
        this.setPartidosJugados(pj);
        this.setGolesAnotados(ga);
        
    }
    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }
    @Override
    public double calcularEfectividad (){
        double aux= (double) this.getGolesAnotados()/this.getPartidosJugados();
        return aux;
    }
    @Override
    public double calcularSueldoACobrar(){
        double aux= super.calcularSueldoACobrar();
        if (this.calcularEfectividad()>0.5)
            aux=aux+this.getSueldo();
        return aux;
        

        
    }
    }