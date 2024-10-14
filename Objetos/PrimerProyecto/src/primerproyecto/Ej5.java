/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerproyecto;
import PaqueteLectura.Lector;
/**
 *
 * @author New User
 */
public class Ej5 {
public static void main(String[] args) {
int[][] entrevistas;
entrevistas=new int [5][4];
int i,j;
for (i=0;i<5;i++){
    j=0;
    System.out.println ("Cliente "+i);
    System.out.println ("Ingrese puntaje de la atencion al cliente del 1 al 10");
    entrevistas [i][j]=Lector.leerInt();
    j++;
    System.out.println("ingrese puntaje de la calidad de la comida del 1 al 10");
    entrevistas [i][j]=Lector.leerInt();
    j++;
    System.out.println("Ingrese que le parecieron los precios del 1 al 10");
    entrevistas [i][j]=Lector.leerInt();
    j++;
    System.out.println ("Ingrese puntaje del ambiente del restaurante del 1 al 10");
    entrevistas [i][j]=Lector.leerInt();
}
double prom;
for (j=0;j<4;j++){
    prom=0;
    for (i=0;i<5;i++)
        prom=prom+entrevistas[i][j];
prom=(double)prom/5;
System.out.println("El promedio de puntaje para la categoria "+(j+1)+" es "+prom);
    
}
    
    
    
    
}  
}
