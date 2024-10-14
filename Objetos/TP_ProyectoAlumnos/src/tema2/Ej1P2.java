/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
    import PaqueteLectura.Lector;
/**
 *
 * @author tamam
 */
public class Ej1P2 {
        public static void main(String[] args) {
    Persona p;
    p = new Persona ();
    System.out.println ("Ingrese nombre de la persona");
    p.setNombre(Lector.leerString());
    System.out.println ("Ingrese Dni de la persona");
    p.setDNI(Lector.leerInt());
    System.out.println ("Ingrese edad de la persona");
    p.setEdad(Lector.leerInt());
    System.out.println (p.toString());
    
    
}
}
