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
public class CoroHileras extends Coro{
    private int fila;
    private int columna;
    private int dl;
    private Corista[][] integrantes;
    
    public CoroHileras (String unNombre, Director unDirector, int tfila, int tcolumna){
        super (unNombre,unDirector);
        fila=tfila;
        columna=tcolumna;
        dl=0;
        integrantes= new Corista[fila][columna];
    }
    @Override
    public void agregarCorista (Corista c){
        if (dl<fila*columna){
            int x=dl/columna,y=dl%columna;
            integrantes[x][y]=c;
            System.out.println("Agregue a "+c.getNombre());
            dl++;
        }
        else
            System.out.println("No hay mas espacio en el coro");
    }
    @Override
    public boolean capacidad (){
        boolean ok;
        if (dl==fila*columna){
            System.out.println("El coro esta lleno");
            ok=true;
        }
        else{
            System.out.println("El coro NO esta lleno");
            ok=false;
        }
        return ok;
    }
    @Override
     public boolean orden (){
        boolean ok= true;
        int i=0,j=0;
        int actual;
        while ((j<columna)&&(ok==true)){
            actual=integrantes[i][j].getTono();
            while ((i+1<columna)&&(ok==true)){
                if (integrantes[i][j].getTono()!=actual){
                    ok=false;
                }
                else{
                    i++;
                }
            }
            j++;
            i=0;
            if ((j<columna)&&(integrantes[i][j].getTono()<=actual)){
                ok=false;
            }  
        }
        return ok;
    }
    @Override
    public String toString (){
        String aux=super.toString();
        int i,j=0,num=1;
        int llenas=dl/columna;
        System.out.println(llenas);
        for (i=0;i<llenas;i++){
            for (j=0;j<columna;j++){
                aux=aux+"\n"+"corisita "+(num)+" "+integrantes[i][j].toString();
                num++;
            }
        }
        int media=dl%fila;
            for (j=0;j<media;j++){
                aux=aux+"\n"+"corisita "+(num)+" "+integrantes[llenas][j].toString();
                num++;
            }
        return aux;
    }
    public String ayuda(){
        String aux=integrantes[0][0].toString()+"\n"+integrantes[0][1].toString()+"\n"+integrantes[1][0].toString()+"\n"+integrantes[1][1].toString()+"\n"+integrantes[2][0].toString()+"\n"+integrantes[2][1].toString();
        return aux;
    }
}
