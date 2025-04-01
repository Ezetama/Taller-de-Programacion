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
public class ProgramaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Plataforma netflix= new Plataforma ("Netflix",1000,3);
        Estreno peli1= new Estreno ("Harry Potter 1","Peli",350,4701);
        Estreno peli2= new Estreno ("Harry Potter 2","Peli",30,11);
        Estreno peli3= new Estreno ("Harry Potter 3","Peli",3520,14301);
        Estreno peli4= new Estreno ("Harry Potter 4","Peli",31250,171);
        Estreno peli5= new Estreno ("Harry Potter 5","Peli",3450,101);
        Estreno peli6= new Estreno ("Harry Potter 6","Peli",35120,143701);
        Estreno peli7= new Estreno ("Harry Potter 7","Peli",40,1401);
        Estreno peli8= new Estreno ("Harry Potter 7 parte 2","Peli",3150,14701);
    
        netflix.agregarEstreno(peli1, 3);
        netflix.agregarEstreno(peli2, 2);
        netflix.agregarEstreno(peli3, 3);
        netflix.agregarEstreno(peli4, 2);
        netflix.agregarEstreno(peli5, 2);
        netflix.agregarEstreno(peli6, 3);
        netflix.agregarEstreno(peli7, 3);
        netflix.agregarEstreno(peli8, 3);
        System.out.println("--------------------------------------");
        System.out.println(netflix.categoriaX(3));
        System.out.println("--------------------------------------");
        System.out.println(netflix.toString());
    }
    
    
}
