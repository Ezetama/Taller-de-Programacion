/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioCoristas;

/**
 *
 * @author tamam
 */
public class CoroSemicircular extends Coro {
    private Corista[] integrantes;
    private int df;
    private int dl;
    
    public CoroSemicircular (String unNombre, Director unDirector, int cant){
        super (unNombre,unDirector);
        df=cant;
        dl=0;
        integrantes=new Corista [df];
    }
    
    @Override
    public void agregarCorista (Corista c){
        if (dl<df){
            integrantes[dl]=c;
            dl++;
        }
        else
            System.out.println("No hay mas espacio en el coro");
    }
    @Override
    public boolean capacidad (){
        boolean ok;
        if (dl==df){
            System.out.println("Esta lleno");
            ok=true;
        }
        else{
            System.out.println("No esta lleno");
            ok=false;
        }
        return ok;
    }
    @Override
    public boolean orden (){
        boolean ok=true;
        if (dl!=0){
            int actual=integrantes[0].getTono(),i=1;
            while ((i<df)&&(ok==true)){
                if (integrantes[i].getTono()<=actual){
                    if (integrantes[i].getTono()<actual)
                        actual=integrantes[i].getTono();
                    i++;
                }
                else
                    ok=false;
            }
        }
        else
            System.out.println("EL CORO ESTA VACIO BANANA");
    return ok;   
    }
    @Override
    public String toString (){
        String aux=super.toString();
        int i;
        for (i=0;i<dl;i++){
            aux=aux+"\n"+"corisita "+(i+1)+" "+integrantes[i].toString();
        }
        return aux;
    }
}
