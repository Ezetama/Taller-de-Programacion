/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;
import PaqueteLectura.Lector;
/**
 *
 * @author tamam
 */
public class Ej2p4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre1= "Juancho", nombre2="Pepito";
        double sueldo1= 4550, sueldo2=2133;
        int antiguedad1= 4, antiguedad2=3;
        System.out.println ("Ingrese la cantidad de partidos jugados y la cantidad de goles hecho del jugador");
        int partidos= Lector.leerInt();
        int goles= Lector.leerInt();
        Jugador jugadorazo= new Jugador (nombre1,sueldo1,antiguedad1,partidos,goles);
        System.out.println (jugadorazo.toString());
        System.out.println ("Ingrese la cantidad de campeonatos ganados por el etrenador");
        int ganados= Lector.leerInt();
        Entrenador master= new Entrenador (nombre2,sueldo2,antiguedad2,ganados);
        System.out.println (master.toString());
    }
    
}
