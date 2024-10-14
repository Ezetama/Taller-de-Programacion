/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerproyecto;
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author New User
 */
public class Ej4 {
public static void main(String[] args) {
    GeneradorAleatorio.iniciar();
    int[][] edificio;
    edificio = new int [8][4];
    int i,j;
    for (i=0;i<8;i++){ // Inicializo en 0 toda la matriz
        for (j=0;j<4;j++)
            edificio [i][j]=0;
    }
    System.out.println ("Ingrese numero de piso");
    int piso,ofi;
    ofi=0;// AL PEDO
    piso=Lector.leerInt();
    if (piso!=9){
        System.out.println ("Ingrese numero de oficina");
        ofi=Lector.leerInt();
    }
    while (piso!=9){
        edificio[piso][ofi]=edificio[piso][ofi]+1;
        System.out.println ("Ingrese numero de piso");
        piso=Lector.leerInt();
        if (piso!=9){
            System.out.println ("Ingrese numero de oficina");
            ofi=Lector.leerInt();    
        }
    }
    for (i=0;i<8;i++){
        for (j=0;j<4;j++)
            System.out.println ("En el piso "+(i+1)+" ,oficina "+(j+1)+" han concurrido "+edificio[i][j]+" personas");
    }
}
}
