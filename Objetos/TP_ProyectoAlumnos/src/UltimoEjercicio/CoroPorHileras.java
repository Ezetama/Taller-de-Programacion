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
public class CoroPorHileras extends Coro {
    private Corista[][] coristas;
    private int[] dimension;
    private int dfx;
    private int dfy;
    private int dlx;
    
    public CoroPorHileras (String nombre, Director unDirec, int x, int y){
        super(nombre,unDirec);
        dfx=x;
        dfy=y;
        dimension= new int[dfx];
        int i;
        for (i=0;i<dfx;i++){
            dimension[i]=0;
        }
        dlx=0;
        coristas= new Corista[dfx][dfy];
    }
    @Override
    public boolean llenoYOrdenado (){
      boolean ok=true;
      int i=0,j=0,actual;
      while ((i<dfx)&&(ok==true)){
          actual=coristas[i][j].getTonoFundamental();
          j++;
          while ((j<dfy)&&(ok==true)){
          if (actual!=coristas[i][j].getTonoFundamental())
              ok=false;
          j++;
          }
          i++;
          j=0;
          if ((i<dfx)&&(actual>coristas[i][j].getTonoFundamental()))
              ok=false;
      }
      return ok;
    }
    
    @Override
    public boolean lleno(){
        boolean ok=true;
        int i=0;
        while ((i<dfx)&&(ok==true)){
            if (dimension[i]!=dfy)
                ok=false;
            i++;
        }
            
        return ok;
    }
    @Override
    public String toString(){
        String aux=super.toString();
        int i,j;
        for (i=0;i<dfx;i++){
            j=0;
            while(j<dimension[i]){
                aux=aux+"fila "+(i+1)+" columna "+(j+1)+" "+coristas[i][j].toString();
                j++;
            }
        }
        return aux;
    }
    @Override
    public void agregarCorista(Corista c){
        if (dlx<dfx){
            if (dimension[dlx]<dfy){
                coristas[dlx][dimension[dlx]]=c;
                dimension[dlx]++;
            }
            else{
                dlx++;
                this.agregarCorista(c);
            }
        }
        else
            System.out.println("No hay mas espacio para ingresar mas coristas");
    }
    public void agregarCorista2(Corista c){
        if (dlx<dfx){
            if (dimension[dlx]>dfy){
                coristas[dlx][dimension[dfx]]=c;
                dimension[dlx]++;
            }
            else{
                dlx++;
                if (dlx<dfx){
                    coristas[dlx][dimension[dfx]]=c;
                    dimension[dlx]++;
                }
                else
                    System.out.println("No hay mas espacio para ingresar mas coristas");
            }
        }
        else
            System.out.println("No hay mas espacio para ingresar mas coristas");
    }
}