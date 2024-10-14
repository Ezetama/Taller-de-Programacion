/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;


public class Ej3P2 {
public static void main(String[] args) {
    GeneradorAleatorio.iniciar();
    Persona[][] matriz;
    matriz = new Persona [5][8];
    int dias=0,turnos=0;
    Persona perso=new Persona();
    perso.setNombre(Lector.leerString());
    while ((dias<5)&&(perso.getNombre().equals("ZZZ")==false)){
        turnos=0;
        System.out.println ("Dia "+(dias+1));
        while ((turnos<8)&&(perso.getNombre().equals("ZZZ")==false)){
            System.out.println ("Turno "+(turnos+1));
            perso.setDNI(GeneradorAleatorio.generarInt(10000)+1);
            perso.setEdad(GeneradorAleatorio.generarInt(100)+1);
            matriz[dias][turnos]=perso;
            perso=new Persona();
            //perso.setNombre(Lector.leerString());
            perso.setNombre(GeneradorAleatorio.generarString(3));
            turnos++;
        }
        dias++;
    }
    int i,j;
    for (i=0;i<dias;i++){
        System.out.println ("Informe del dia "+(i+1));
        for (j=0;j<turnos;j++){
            System.out.println ("Turno "+(j+1)+matriz[i][j].toString());
            
        }
    }
    
    
    
}
}
