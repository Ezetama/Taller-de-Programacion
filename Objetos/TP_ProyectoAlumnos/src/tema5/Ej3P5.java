/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;
import PaqueteLectura.Lector;
/**
 *
 * @author tamam
 */
public class Ej3P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventoOcasional miEvento= new EventoOcasional ("Los picapiedras",5,"show de TV","Ezequiel Tamame",7);
        Gira miGira= new Gira ("Duki",12,"Hasta el fin del mundo",12);
        System.out.println("El evento costara"+miEvento.calcularCosto());
        System.out.println("La gira costara"+miGira.calcularCosto());
        System.out.println("Actuacion del evento: "+miEvento.actuar());
        Fecha f= new Fecha ("La plata",7);
        miGira.agregarFecha(f);
        System.out.println("Actuacion de la gira"+miGira.actuar());
    }
}
