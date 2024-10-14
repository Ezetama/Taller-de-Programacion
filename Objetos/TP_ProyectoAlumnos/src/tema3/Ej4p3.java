/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author tamam
 */
public class Ej4p3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        Hotel miHotel;
        System.out.println ("Ingrese el numero de habitaciones que tiene el hotel");
        int cant= Lector.leerInt();
        miHotel= new Hotel (cant);
        Cliente miCliente= new Cliente("Juancho",77777,20);
        Cliente miCliente2= new Cliente ("Don ramon",66666,56);
        miHotel.agregarHospedaje(2, miCliente);
        miHotel.agregarHospedaje(5, miCliente2);
        miHotel.informar();
        miHotel.aumentarPrecio(4500);
        miHotel.informar();
    }
    
}
