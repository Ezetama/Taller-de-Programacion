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
public class Estante {
    private Producto produc;
    
    public Estante(){
        produc=null;
    }
    public void agregarProductoEstante (Producto p){
        produc=p;
    }
    public String sacarProducto (){
        String aux="";
        if (produc.getCant()==0){
            aux= produc.toString();
            produc=null;
        }
        return aux;   
    }
    public boolean esONoEs(String marca){
        boolean ok= false;
        if ((produc!=null)&&(produc.getMarca().equals(marca))){
            System.out.println("ENCONTRE UN PRODUCTO MODELVE");
            ok=true;
        }
        return ok;
    } 
    @Override
    public String toString (){
        String aux="Producto "+"{";
                if (produc!=null)
                aux=aux+produc.toString()+"}";
        return aux;
    }
}
