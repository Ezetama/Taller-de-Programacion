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
public class Ej5p3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println ("Ingrese el radio del circulo");
        double r= Lector.leerDouble();
        System.out.println ("Ingrese el color de relleno del circulo");
        String relle= Lector.leerString();
        System.out.println ("Ingrese el color de la linea del circulo");
        String line= Lector.leerString();
        Circulo miCirculo= new Circulo (r,relle,line);
        System.out.println ("El perimetro del circulo es "+miCirculo.calcularPerimetro());
        System.out.println ("El area del circulo es "+miCirculo.calcularArea());
    }
    
}
