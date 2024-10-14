/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerproyecto;

//Paso 1. importar la funcionalidad para generar datos aleatorios
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

public class Ej3 {

    public static void main(String[] args) {
	GeneradorAleatorio.iniciar();    //Paso 2. iniciar el generador aleatorio     
	int i,j;
        int [][] matriz; 
        matriz= new int [5][5];//Paso 3. definir la matriz de enteros de 5x5 e iniciarla con nros. aleatorios 
        for (i=0; i<5; i++){
            for (j=0; j<5; j++)
                matriz [i] [j]= GeneradorAleatorio.generarInt(15)+1;
        }           
        for (i=0; i<5; i++){ //Paso 4. mostrar el contenido de la matriz en consola
            for (j=0;j<5; j++)
                System.out.print ("|"+matriz [i][j]);
            System.out.println ("|");
            System.out.println ("--------------");
        }
        int fila1 = 0;//Paso 5. calcular e informar la suma de los elementos de la fila 1
        for (i=0; i<5; i++){
            fila1= fila1+matriz [0] [i];
        }
        System.out.println ("La suma de los elementos de la fila 1 es "+fila1);
        int columna;
        int [] v5;
        v5= new int [5];
        for (j=0; j<5; j++){ //Paso 6. generar un vector de 5 posiciones donde cada posición j contiene la suma de los elementos de la columna j de la matriz. 
        //        Luego, imprima el vector.
            columna=0;
            for (i=0;i<5;i++){
                columna=columna+matriz [i][j];
            }
            v5[j]=columna;
        }
        for (i=0;i<5;i++){
            System.out.println ("La suma de los elementos de la columna"+i+ " es "+v5[i]);
        }
        boolean ok=false;
        int posX=0, posY=0, valor;//Paso 7. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna)
        //   y en caso contrario imprima "No se encontró el elemento".
        System.out.println ("Ingrese un valor para buscarlo en la matriz");
        valor = Lector.leerInt();
        for (i=0;ok==false&&i<5;i++){
            for (j=0; ok==false&&j<5;j++){
                if (matriz[i][j]==valor)
                    ok=true;
                    posX= i;
                    posY= j;
            }
            
        }
        if (ok==true){
            System.out.println ("El elementos se encuentra en la fila "+(posX+1)+" ,columna "+(posY+1));
        }
        else 
            System.out.println ("EL VALOR NO SE ENCUENTRA EN LA MATRIZ");
    }
}
