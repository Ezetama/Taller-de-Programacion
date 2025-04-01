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
public class Investigador {
    private String nombre;
    private int categoria;
    private String especialidad;
    private Subsidio[] subsidios;
    private int dl;
    
    public Investigador (String unNombre,int unaCategoria,String unaEspecialidad){
        this.setNombre(unNombre);
        this.setCategoria(unaCategoria);
        this.setEspecialidad(unaEspecialidad);
        subsidios= new Subsidio[5];
        dl=0;
    }
    public double totalSubsidios (){
        double aux=0;
        int i;
        for (i=0;i<dl;i++){
            if (subsidios[i].isOtorgado()==true)
                aux=aux+subsidios[i].getMonto();
        }
        return aux;
    }
    public void otorgarTodos2 (){
        int i;
        for (i=0;i<dl;i++){
            subsidios[i].setOtorgado(true);
        }
    }
    public void agregarSub (Subsidio s){
        if (dl<5){
            subsidios [dl]=s;
            dl++;
        }
        else
            System.out.println("Se alcanzo el maximo de subsidios para este investigador");
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    @Override
    public String toString (){
        String aux="Nombre: "+this.getNombre()+" categoria: "+this.getCategoria()+" total de apoyo economico: "+this.totalSubsidios();
        
        return aux;
    }

}
