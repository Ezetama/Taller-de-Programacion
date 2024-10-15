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
public class ProgramaPrincipal {

    /**
     * @param args the command line arguments
     *///int unCodigo, String unNombre, String unaMarca, int unaCant, double unPrecio
    public static void main(String[] args) {
        Supermercado miSuper= new Supermercado ("Elchino","30 718",5,3);
        Producto produ1= new Producto (777,"Oreos","Mondelev",22,950);
        Producto produ2= new Producto (777,"pepitos","Mondelev",22,9530);
        Producto produ3= new Producto (777,"sonrisas","terrabusi",22,950);
        Producto produ4= new Producto (777,"leche","Mondelev",22,910);
        Producto produ5= new Producto (777,"jabon","avon",22,950);
        Producto produ6= new Producto (777,"Atun","xxx",0,1302);
        Producto produ7= new Producto (777,"Oreos","xxx",2,321);
        Producto produ8= new Producto (777,"Carambolas","xxdasd",0,950);
        Producto produ9= new Producto (7727,"error","xxdasd",9,950);
        miSuper.agregarProducto(produ1, 1, 1);
        miSuper.agregarProducto(produ2, 2, 2);
        miSuper.agregarProducto(produ3, 3, 1);
        miSuper.agregarProducto(produ4, 2, 1);
        miSuper.agregarProducto(produ5, 3, 2);
        miSuper.agregarProducto(produ6, 5, 2);
        miSuper.agregarProducto(produ7, 5, 1);
        miSuper.agregarProducto(produ8, 5, 3);
        miSuper.agregarProducto(produ9, 5, 3);
        System.out.println("PRUEBAAAA");
        System.out.println(miSuper.vaciarGondola(5));
        System.out.println(miSuper.toString());
        System.out.println("El numero de gonodola que exhibe mas de la marca x es: "+miSuper.marcaRepetida("Mondelev"));
        
        
    }
    
}
