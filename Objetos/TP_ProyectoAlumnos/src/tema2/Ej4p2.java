/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;


public class Ej4p2 {
public static void main(String[] args) {
    GeneradorAleatorio.iniciar();
    Persona[][] matriz;
    matriz = new Persona [5][8];
    int [] vec= new int [5];
    int i,j;
    for (i=0;i<5;i++){
        vec[i]=0;
    }
    int dias=0,turnos=0,dl=0;
    int diains;
    Persona perso=new Persona();
    perso.setNombre(Lector.leerString());
    while ((dl<40)&&(perso.getNombre().equals("ZZZ")==false)){
        diains=(Lector.leerInt()-1);
        //diains=GeneradorAleatorio.generarInt(5);
        if (vec[diains]<8) {
            perso.setDNI(GeneradorAleatorio.generarInt(10000)+1);
            perso.setEdad(GeneradorAleatorio.generarInt(100)+1);
            matriz[diains][vec[diains]]=perso;
            dl++;
            vec[diains]=vec[diains]+1;
        }
        else
            System.out.println ("El dia que ingreso se encuentra lleno");
        perso=new Persona();
        perso.setNombre(Lector.leerString());
        //perso.setNombre(GeneradorAleatorio.generarString(3));
    }
    for (i=0;i<5;i++){
        System.out.println ("Informe del dia "+(i+1));
        System.out.println ("Hubo "+vec[i]+" inscriptos");
    }
    
    
    
}
}
