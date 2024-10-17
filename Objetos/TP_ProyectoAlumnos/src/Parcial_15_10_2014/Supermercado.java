/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial_15_10_2014;

/**
 *
 * @author tamam
 */
public class Supermercado {
    private String nombre;
    private String direccion;
    private Producto[][] matriz;
    private int gondolas;
    private int estantes;
    
    public Supermercado (String unNombre, String unaDireccion,int x,int y){
        this.setNombre(unNombre);
        this.setDireccion(unaDireccion);
        gondolas=x;
        estantes=y;
        matriz= new Producto[gondolas][estantes];
        int i,j;
        for (i=0;i<gondolas;i++){
            for (j=0;j<estantes;j++){
                matriz[i][j]=null;
           }
        }
    }
    
    public void exhibir(Producto p,int x, int y){
        if (matriz[x-1][y-1]==null)
            matriz[x-1][y-1]=p;
        else
            System.out.println("Se encuentra ocupado el lugar donde se quiere almacenar el producto");
    }
    
    public String liberarGondola(int gondola){
        String aux="";
        int i;
        for (i=0;i<estantes;i++){
            if ((matriz[gondola-1][i]!=null)&&(matriz[gondola-1][i].checkCantidad()==true)){
                aux=aux+matriz[gondola-1][i].toString()+"\n";
                matriz[gondola-1][i]=null;
            }
        }
        return aux;
    }
    public int buscarMarca (String marca){
        int numg=-1,i,j,maximo=-1,suma;
            for (i=0;i<gondolas;i++){
                suma=0;
                for (j=0;j<estantes;j++){
                    if ((matriz[i][j]!=null)&&(matriz[i][j].getMarca().equals(marca)))
                        suma++;
                }
                if (suma>maximo){
                    numg=(i+1);
                    maximo=suma;
                }
            }
        return numg;
    }
    @Override
    public String toString (){
        String aux="Supermercado: "+this.getNombre()+"; "+this.getDireccion()+"\n";
        int i,j;
        for (i=0;i<gondolas;i++){
            aux=aux+"Gondola "+(i+1)+":"+"\n";
            for (j=0;j<estantes;j++){
                if (matriz[i][j]!=null){
                    aux=aux+"estante "+(j+1)+": "+matriz[i][j].toString()+"\n";
                }         
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
