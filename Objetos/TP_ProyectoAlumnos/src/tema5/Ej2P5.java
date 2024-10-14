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
public class Ej2P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estacionamiento capi= new Estacionamiento ("Eze car","Calle 30 718","12:00","23:59",3,3);
        Auto auto1= new Auto ("Ezequiel","GZM475");
        Auto auto2= new Auto ("Federico","GZM476");
        Auto auto3= new Auto ("Leo","GZM477");
        Auto auto4= new Auto ("Damian","GZM478");
        Auto auto5= new Auto ("Chekita","GZM479");
        Auto auto6= new Auto ("Oli","GZM480");
        capi.agregarAuto(auto1, 1, 1);
        capi.agregarAuto(auto2, 2, 1);
        capi.agregarAuto(auto3, 1, 2);
        capi.agregarAuto(auto4, 3, 1);
        capi.agregarAuto(auto5, 3, 3);
        capi.agregarAuto(auto6, 2, 3);
        System.out.println("prueba");
        System.out.println(capi.toString());
        System.out.println("La cantidad de autos estacionados en la plaza 1 es: "+capi.chequearPlaza(1));
        System.out.println(capi.estaPatente("GZM480"));
    }
    
}
