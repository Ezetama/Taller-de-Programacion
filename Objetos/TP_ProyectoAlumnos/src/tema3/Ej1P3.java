/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
import PaqueteLectura.Lector;
/**
 *
 * @author tamam
 */
public class Ej1P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo tri= new Triangulo(10,20,12,"verde","rojo");
        tri.setLinea(Lector.leerString());
        Triangulo tri2 =new Triangulo();
        System.out.println ("El perimetro del triangulo es : "+tri.calcularPerimetro());
        System.out.println ("El area del triangulo es: "+tri.calcularArea());
        System.out.println (tri.toString());
        System.out.println (tri2.toString());
    }
    
}
