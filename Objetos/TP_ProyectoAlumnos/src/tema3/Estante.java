/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author tamam
 */
public class Estante {
    private Libro[] unEstante;
    private int dl;
    
    public Estante(){
        unEstante=new Libro[20];
        dl=0;
    }
    public void agregarLibro (Libro L){
        if (dl<20){
            unEstante[dl]=L;
            dl++;
        }
        else{
            System.out.println ("El estante se encuentra lleno");
        }
    }
    public int cantLibros (){
        return dl;
    }
    public String chequeoLleno (){
        String aux;
        if (dl==20)
            aux= "El estante ESTA lleno";
        else
            aux= "El estante aun tiene espacio disponible";
        return aux;
    }
    public Libro EstaX (String titulo){
        int i=0;
        boolean ok=false;
        while ((i<dl)&&(ok==false)){
            if (unEstante[i].getTitulo().equals(titulo))
                ok=true;
            else
                i++;
        }
        if (unEstante[i].getTitulo().equals(titulo))
            return unEstante[i];
        else{
            System.out.println ("No se encontre un libro con ese titulo en el estante. Se devolvera null");
            return null;
        }
    }
    public String BuscarMujercitas (){
        int i=0;
        boolean ok=false;
        System.out.println ("La DL vale "+dl);
        while ((i<dl)&&(ok==false)){
            System.out.println ("El titulo del libro en la posicion "+i+" es "+unEstante[i].getTitulo());
            if (unEstante[i].getTitulo().equals("Mujercitas"))
                ok=true;
            else
                i++;
        }
        String aux;
        if (i<dl)
            aux=("El autor del libro es "+unEstante[i].getPrimerAutor().getNombre());
        else
            aux=("No se encontro Mujercitas en el estante");
        return aux;
    }
}

