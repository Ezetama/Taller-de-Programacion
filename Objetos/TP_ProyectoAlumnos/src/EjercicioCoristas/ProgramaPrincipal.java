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
public class ProgramaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Director dire1= new Director ("Juancho",22680611,51,4);
        Director dire2= new Director ("Pedro",22680920,58,6);
        CoroSemicircular miCoro= new CoroSemicircular ("Los pollera",dire1,4);
        CoroHileras miCoro2= new CoroHileras ("Los inflables",dire2,3,2);
        Corista c1= new Corista ("1",228090,24,4);
        Corista c2= new Corista ("2",228090,24,4);
        Corista c3= new Corista ("3",228090,24,3);
        Corista c4= new Corista ("4",228090,24,3);
        Corista c5= new Corista ("5",228090,24,3);
        Corista c6= new Corista ("6",228090,24,3);
        Corista c7= new Corista ("7",228090,24,3);
        Corista c8= new Corista ("8",228090,24,2);
        Corista c9= new Corista ("9",228090,24,2);
        Corista c10= new Corista ("10",228090,24,2);
        
        miCoro.agregarCorista(c1);
        miCoro.agregarCorista(c3);
        miCoro.agregarCorista(c2);
        miCoro.agregarCorista(c4);
        miCoro.agregarCorista(c5);    
        System.out.println(miCoro.toString());
        if (miCoro.orden()==true)
            System.out.println("Esta ordenado");
        else
            System.out.println("NO ESTA ORDENADO");
        miCoro2.agregarCorista(c5);
        miCoro2.agregarCorista(c6);
        miCoro2.agregarCorista(c7);
        miCoro2.agregarCorista(c8);
        miCoro2.agregarCorista(c9);
        miCoro2.agregarCorista(c10);
        miCoro2.agregarCorista(c4);
        System.out.println("-------------------------------------------------------------------");
        System.out.println(miCoro2.toString());
        if (miCoro2.orden()==true)
            System.out.println("Esta ordenado");
        else
            System.out.println("NO ESTA ORDENADO");
        
        System.out.println("-----------");
        System.out.println(miCoro2.ayuda());
    }
    
}
