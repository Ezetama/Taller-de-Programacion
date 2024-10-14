/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;

public class Ej5p2 {
public static void main(String[] args) {
    GeneradorAleatorio.iniciar();
    Partido[] vec;
    int df=5;
    vec=new Partido[df];
    String visitante;
    int i=0,dl=0;
    System.out.println("Ingrese el visitante de la fecha 1");
    visitante=Lector.leerString();
    while ((visitante.equals("ZZZ")==false)&&(dl<df)){
        vec[dl]= new Partido();
        vec[dl].setVisitante(visitante);
        System.out.println ("Ingrese el local de la fecha "+(dl+1));
        vec[dl].setLocal(Lector.leerString());
        vec[dl].setGolesLocal(GeneradorAleatorio.generarInt(5));
        vec[dl].setGolesVisitante(GeneradorAleatorio.generarInt(4));
        dl++;
        if (dl<df){
            System.out.println("Ingrese el visitante de la fecha "+(dl+1));
            visitante=Lector.leerString();
        }
    }
    int cantriver=0,cantgolesboca=0;
    for (i=0;i<dl;i++){
        System.out.println(vec[i].getLocal()+" "+vec[i].getGolesLocal()+" VS "+vec[i].getVisitante()+" "+vec[i].getGolesVisitante());
        if (vec[i].getGanador().equals("River"))
            cantriver++;
        if (vec[i].getLocal().equals("Boca"))
            cantgolesboca=cantgolesboca+vec[i].getGolesLocal();
            
    }
    System.out.println ("River gano "+cantriver+" partidos");
    System.out.println ("Boca metio "+cantgolesboca+" goles jugando de local");
}
}
