/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author tamam
 */
public class Ej3p4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        String nombre1="Goku", nombre2= "Vegeta";
        int edad1=(GeneradorAleatorio.generarInt(100)+1),edad2=(GeneradorAleatorio.generarInt(100)+1),dni1=(GeneradorAleatorio.generarInt(100000)+1),dni2=(GeneradorAleatorio.generarInt(100000)+1);
        String profesion="Capitan Moja-pantalones";
        Persona propietario= new Persona (nombre1,dni1,edad1);
        Trabajador laburante= new Trabajador (nombre2,dni2,edad2,profesion);
        System.out.println (propietario.toString());
        System.out.println (laburante.toString());
        
    }
    
}
