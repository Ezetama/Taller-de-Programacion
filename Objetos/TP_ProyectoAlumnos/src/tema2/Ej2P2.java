/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author tamam
 */
public class Ej2P2 {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        Persona[] v;
        v = new Persona [15];
        int edad=GeneradorAleatorio.generarInt(101);
        int dl=0;
        while ((edad!=0)&& (dl<15)){
            v[dl]=new Persona();
            v[dl].setEdad(edad);
            v[dl].setDNI(GeneradorAleatorio.generarInt(460));
            v[dl].setNombre(GeneradorAleatorio.generarString(10));
            edad=GeneradorAleatorio.generarInt(101);
            System.out.println ("La DL vale " +dl);
            dl++;
        }
        System.out.println("PRUEBA");
        int cant=0;
        int i;
        int menor=101;
        int posmenor=0;
        System.out.println("PRUEBA");
        for (i=0;i<=(dl-1);i++){
            System.out.println ("i vale "+i);
            if (v[i].getEdad()>65){
                cant++;
            }
            System.out.println (v[i].toString());
            if (v[i].getDNI()<menor){
                menor= v[i].getDNI();
                posmenor=i;
            }
        }
        System.out.println ("La cantidad de personas mayores a 65 es "+cant);
        System.out.println ("La persona con menor dni es : "+v[posmenor].getNombre());
        
    }
}
