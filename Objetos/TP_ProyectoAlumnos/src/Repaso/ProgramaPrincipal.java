/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso;
import PaqueteLectura.Lector;
/**
 *
 * @author tamam
 */
public class ProgramaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrado cua= new Cuadrado ("Juancito",8);
        System.out.println(cua.toString());
        System.out.println("Gracias por la info");
        double precio= 3.14*2;
        System.out.println(cua.toString()+"Su valor es de: $"+precio);
        Doctor d= new Doctor ("pepe",53,77.5,22680611,"Flebologo","calle 30 718");
        System.out.println(d.toString());
    }
    
}
