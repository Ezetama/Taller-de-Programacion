/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;
import PaqueteLectura.Lector;
/**
 *
 * @author tamam
 */
public class Ej1p4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println ("Ingrese los 3 lados del triangulo");
        double lado1=Lector.leerDouble(),lado2=Lector.leerDouble(),lado3=Lector.leerDouble();
        System.out.println ("Ingrese el color del relleno y la linea del triangulo");
        String relle=Lector.leerString(),line=Lector.leerString();
        Triangulo tri= new Triangulo (lado1,lado2,lado3,relle,line);
        System.out.println ("Datos del triangulo: "+tri.toString());
        System.out.println ("Ingrese el radio, el color de relleno y el color de linea del ciruclo");
        Double radi= Lector.leerDouble();
        String rellenoCirculo= Lector.leerString(),lineaCirculo=Lector.leerString();
        Circulo circu = new Circulo (rellenoCirculo,lineaCirculo,radi);
        System.out.println ("Datos del cirulo: "+circu.toString());
        circu.despintar();
        System.out.println ("Datos del cirulo: "+circu.toString());
        
        
        
    }
    
}
