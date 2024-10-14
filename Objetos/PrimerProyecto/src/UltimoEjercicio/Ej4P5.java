/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UltimoEjercicio;

/**
 *
 * @author New User
 */
public class Ej4P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Director direc1= new Director ("Juancho",45538839,22,4);
        Director direc2 = new Director ("PepeGrillo",22680611,53,27);
        CoroPorHileras miCoro= new CoroPorHileras ("El coro loco",direc1,3,2);
        CoroSemicircular miCoroCircular= new CoroSemicircular ("Crono pono choco", direc2,5);
        Corista c1=new Corista ("Spiderman",22211187,23,1);
        Corista c2=new Corista ("Superman",22233187,23,1);
        Corista c3=new Corista ("Batrman",22223187,23,2);
        Corista c4=new Corista ("Spider",22271187,24,3);
        Corista c5=new Corista ("man",22219887,23,3);
        Corista c6=new Corista ("dermanor",21211187,23,3);
        Corista c7=new Corista ("Spiderman del universo 13",22311187,23,1);
        Corista c8=new Corista ("Spiderwomen",22212387,23,1);
        Corista c9=new Corista ("Spidergwen",22232187,23,2);
        Corista c10=new Corista ("Spiderman77",26211187,23,2);
        Corista c11=new Corista ("Spidermano",26481187,23,3);
        miCoroCircular.agregarCorista(c7);
        miCoroCircular.agregarCorista(c8);
        miCoroCircular.agregarCorista(c9);
        miCoroCircular.agregarCorista(c10);
      //  miCoroCircular.agregarCorista(c11);
      //  System.out.println("Mi coro se encuentra lleno? " +miCoroCircular.lleno());
      //  System.out.println(miCoroCircular.toString());
      //  System.out.println("Mi coro se encuentra ordenado y lleno? "+miCoroCircular.llenoYOrdenado());
        miCoro.agregarCorista(c1);
        miCoro.agregarCorista(c2);
        miCoro.agregarCorista(c3);
        miCoro.agregarCorista(c4);
        miCoro.agregarCorista(c5);
        miCoro.agregarCorista(c6);
        System.out.println("Mi coro esta lleno= "+miCoro.lleno());
        System.out.println("ayuda");
        System.out.println(miCoro.toString());
        System.out.println("Mi coro esta ordenado y lleno? "+miCoro.llenoYOrdenado());
        
    }
    
}