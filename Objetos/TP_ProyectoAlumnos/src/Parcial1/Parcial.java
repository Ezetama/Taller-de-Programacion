/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1;

/**
 *
 * @author tamam
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libreria miLibreria= new Libreria ("Yenny",3);
        miLibreria.agregarTicket(1, 45538839, 2, 355, "Efectivo");
        miLibreria.agregarTicket(2, 45538839, 2, 3550, "Efectivo");
        miLibreria.agregarTicket(3, 45538839, 2, 3535, "Efectivo");
        miLibreria.agregarTicket(4, 45538839, 2, 415, "Efectivo");
        miLibreria.agregarTicket(1, 45538839, 2, 3245, "Efectivo");
        miLibreria.agregarTicket(1, 45538839, 2, 56, "Efectivo");
        miLibreria.agregarTicket(2, 45538839, 2, 13612, "TARJETA");
        miLibreria.agregarTicket(2, 45538839, 2, 3325, "Efectivo");
        miLibreria.agregarTicket(4, 45538839, 2, 35, "Efectivo");
        miLibreria.cerrarCajas(4); //PREGUNTAR POR QUE NO SE CIERRA LA CAJA 4
        Ticket Elcaro= miLibreria.mayorMonto();
        System.out.println(Elcaro.toString());
        System.out.println(miLibreria.toString());
    }
    
}
