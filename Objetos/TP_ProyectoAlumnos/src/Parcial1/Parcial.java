/*
 Una librería quiere administrar la información correspondiente a los tickets de compra emitidos. La librería posee un nombre, el número de venta actual y la información de sus 4 cajas. De cada caja se conoce si se encuentra disponible y la información de los tickets que emitió (como máximo T). De cada ticket de compra se registra: número de ticket, DNI del cliente, cantidad de libros comprados, monto abonado y el medio de pago utilizado (débito, crédito o efectivo).
1- Genere las clases necesarias. Provea constructores para crear: la librería con sus 4 cajas, a partir de un nombre y un máximo T de tickets de compra por caja (el número de venta actual inicial es 0); cada caja en disponible y con capacidad para un máximo de T tickets (inicialmente sin tickets); cada ticket partir de la información necesaria.
2- Implemente los métodos necesarios, en las clases que corresponda, para:
a) Dado un número N de caja, el DNI de un cliente, una cantidad de libros comprada, un monto abonado y una forma de pago, generar el ticket de compra (el número de ticket se corresponde con el número de venta actual de la librería) y agregarlo en dicha caja de la librería. Asumir que el número N de caja es válido.
b) Dado un valor X, marcar como no disponible aquellas cajas que hayan vendido menos de X libros en total. c) Obtener el ticket emitido con mayor monto abonado de toda la librería.
d) Obtener un String que represente la librería siguiendo el ejemplo:
"Libreria: Nombre;
Caja 1: Si está disponible o no; Tickets emitidos: [Nro, DNI del cliente, cantidad de libros, monto abonado, medio pago; ...] Caja 2: Si está disponible o no; Tickets emitidos: [Nro, DNI del cliente, cantidad de libros, monto abonado, medio pago; ...]
3- Realice un programa que instancie una librería. Genere tickets de compra sobre distintas cajas. Compruebe el correcto funcionamiento de los métodos implementados.
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
