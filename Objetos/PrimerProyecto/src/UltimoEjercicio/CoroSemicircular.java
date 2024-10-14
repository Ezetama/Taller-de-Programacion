/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UltimoEjercicio;

/**
 *
 * @author tamam
 */
public class CoroSemicircular extends Coro {
    private Corista[] coristas;
    private int df;
    private int dl;
    
    public CoroSemicircular (String nombre, Director unDirec, int x){
        super(nombre,unDirec);
        df=x;
        coristas= new Corista[df];
        dl=0;
    }
    @Override
    public String toString (){
        String aux=super.toString();
        int i;
        for (i=0;i<dl;i++)
            aux=aux+coristas[i].toString();
        return aux;
    }
    @Override
    public void agregarCorista(Corista c){
        if (dl<df){
            coristas[dl]=c;
            dl++;
        }
        else
            System.out.println("No hay mas espacio para ingresar mas coristas");
    }
    @Override
    public boolean lleno (){
        boolean ok=false;
        if (dl==df)
            ok=true;
        return ok;
    }
    @Override
    public boolean llenoYOrdenado(){
        boolean ok=true;
        int i=1,actual=coristas[0].getTonoFundamental();
        while ((i<df)&&(ok==true)){
            if (coristas[i].getTonoFundamental()>=actual){
                actual=coristas[i].getTonoFundamental();
                i++;
            }
            else 
                ok=false;
        }
        return ok;
    }
    
}