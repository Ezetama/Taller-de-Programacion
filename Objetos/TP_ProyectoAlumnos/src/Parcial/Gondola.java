/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial;

/**
 *
 * @author tamam
 */
public class Gondola {
    private Estante[] estantes;
    private int df;
    public Gondola (int x){
        df=x;
        estantes= new Estante[df];
        int i;
        for (i=0;i<df;i++){
            estantes[i]= new Estante();
        }
    }
    public void agregarProductoGondola(Producto p, int y){
        if (estantes[y]!=null)
            estantes[y].agregarProductoEstante(p);
        else
            System.out.println("Este estante ya tiene un producto exhibido");
    }
    @Override
    public String toString (){
        String aux="";
        int i;
        for(i=0;i<df;i++){
            aux=aux+"\n"+"Estante "+(i+1)+": "+estantes[i].toString();
        }
        return aux;
    }
    public int cantRepetidas (String marca){
        int cant=0,i;
        for (i=0;i<df;i++){
            if (estantes[i].esONoEs(marca)==true)
               cant++; 
        }
        return cant;
    }
    public String liberarEstantes (){
        String aux="";
        int i;
        for (i=0;i<df;i++){
            aux=aux+estantes[i].sacarProducto();
        }
        return aux;
    }
}
