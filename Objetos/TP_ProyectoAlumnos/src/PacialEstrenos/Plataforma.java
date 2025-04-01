/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacialEstrenos;

/**
 *
 * @author tamam
 */
public class Plataforma {
    private String nombre;
    private int subs;
    private int categorias;
    private Estreno[][] estrenos;
    private int[] dl;
    
    public Plataforma (String unNombre, int unosSubs, int unCant){
        this.setNombre(unNombre);
        this.setSubs(unosSubs);
        categorias=unCant;
        dl= new int[categorias];
        int i;
        for (i=0;i<categorias;i++){
            dl[i]=0;
        }
        estrenos= new Estreno[12][categorias];
    }
    
    public void agregarEstreno(Estreno e,int c){
        c--;
        if (c<categorias){
            estrenos[dl[c]][c]=e;
            System.out.println("Se agrego en la pos: "+dl[c]+" "+c);
            dl[c]++;
        } 
        else{
            System.out.println("No se pudo agregar el Estreno");
        }
    }
    public String categoriaX (int c){
        c--;
        String aux=" ";
        if (c<categorias){
            int i=0;
            while (i<dl[c]){
                aux=aux+estrenos[i][c].toString()+"\n";
                i++;
            }
        }
        else
            aux="La categoria ingresada no existe";
        
        return aux;
    }
    public double gananciaTotal (){
        double aux=0;
        int i,j;
        for (i=0;i<categorias;i++){
            for (j=0;j<dl[i];j++){
                aux=aux+estrenos[dl[j]][i].getRecaudacion()/2.0;
            }
        }
        return aux;
    }
    @Override
    public String toString (){
        String aux="Plataforma: "+this.getNombre()+", cantidad de suscriptores: "+this.getSubs()+"\n";
        int i,j;
        //System.out.println(estrenos[2][1]);
        for (i=0;i<categorias;i++){
            aux=aux+"Categoria "+(i+1)+":"+"\n";
            j=0;
            while (j<dl[i]){
                aux=aux+"Mes "+(j+1)+":"+"\n"+estrenos[j][i].toString()+"\n";
                j++;
            }
        }
                
        return aux;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSubs() {
        return subs;
    }

    public void setSubs(int subs) {
        this.subs = subs;
    }
    
}
