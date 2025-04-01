/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso;

/**
 *
 * @author tamam
 */
public class Proyecto {
    private String nombre;
    private int codigo;
    private String director;
    private Investigador[] investigadores;
    private int dl;
    
    public Proyecto (String unNombre, int unCodigo, String unDirector){
    
    this.setNombre(unNombre);
    this.setCodigo(unCodigo);
    this.setDirector(unDirector);
    investigadores= new Investigador[50];
    dl=0;
}

    public void agregarIns (Investigador i){
        if (dl<50) {
            investigadores[dl]=i;
            dl++;
            System.out.println("Se agrego a "+i.getNombre()+" al proyecto");
        }
        else
            System.out.println("Se alcanzo la maxima capacidad de investigadores en el proyecto");
         
    } 
    public double totalOtorgado (){
        double aux=0;
        int i;
        for (i=0;i<dl;i++){
            aux=aux+investigadores[i].totalSubsidios();
        }
        
        return aux;
    }
    public void otorgatTodos (String unNombre){
        int i=0;
        while ((i<dl)&&(investigadores[i].getNombre().equals(unNombre)==false)){
            i++;
        }
        if (i!=dl) {
            investigadores[i].otorgarTodos2();
        
        }
        else{
            System.out.println("No se encontro el investigador en el proyecto");
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    @Override
    public String toString (){
        String aux="Nombre del proyecto: "+this.getNombre()+" Codigo: "+this.getCodigo()+" Director: "+this.getDirector()+" Total de dinero otorgado al proyecto: "+this.totalOtorgado();
        aux=aux+" ";
        int i;
        for (i=0;i<dl;i++){
            aux=aux+"\n"+"investigador "+(i+1)+" "+investigadores[i].toString();
        }
        
        return aux;
    }
    
}
