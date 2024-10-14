
package primerproyecto;

//Paso 1: Importar la funcionalidad para lectura de datos

import PaqueteLectura.Lector;
public class Ej2 {

  
    public static void main(String[] args) {
       double [] vector; //Paso 2: Declarar la variable vector de double 
       int df=5;
       vector = new double[df]; //Paso 3: Crear el vector para 15 double 
        
        double promedio =0;
        int i,cant=0;//Paso 4: Declarar indice y variables auxiliares a usar
                
       for (i=0; i<df;i++){
           System.out.println ("Ingrese altura del jugador en las pos "+ i);
           vector[i]=Lector.leerDouble();
           promedio= promedio+vector[i];
           
       }//Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas
        promedio = promedio / df;
        System.out.println ("El promedio de las alturas es: "+promedio);
        //Paso 7: Calcular el promedio de alturas, informarlo
        for (i=0; i<df; i++){
            if (vector[i]>promedio){
                System.out.println ("El jugador en la posicion "+i+" es mas alto que el promedio");
                cant++;
            }
            else
                System.out.println ("El jugador en la posicion "+i+" NOOOOOO es mas alto que el promedio");
        }
        //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
        System.out.println ("El promedio de jugadores mas altos que el promedio es "+cant);
        //Paso 9: Informar la cantidad.
    }
}