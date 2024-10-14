/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.awt.BorderLayout;

/**
 *
 * @author tamam
 */
public class Proyecto {
    private String nombre;
    private int codigo;
    private String nombreDirector;
    private Investigador[] equipo;
    private int dl;
    
    public Proyecto(String unNombre, int unCodigo ,String unNombreDirector){
        this.setNombre(unNombre);
        this.setCodigo(unCodigo);
        this.setNombreDirector(unNombreDirector);
        equipo= new Investigador[50];
        dl=0;
    }
    public void agregarInvestigador(Investigador ins){
        if (dl<50){
            equipo[dl]=ins;
            dl++;
        }
        else
            System.out.println("No se pueden agregar mas porque el pryecto ya tiene 50 investigadores");
    }
    public void otorgarTodos (String unNombre){
        int i=0;
        while ((i<dl)&&(equipo[i].getNombre().equals(unNombre)==false)){
            i++;
        }
        if (i!=dl)
            equipo[i].otorgarTodos2();
        else
            System.out.println("El investigador no se encuentra en el proyecto");
    }
    @Override
    public String toString(){
        String aux="Nombre del proyecto: "+this.getNombre()+" codigo: "+this.getCodigo()+" nombre del director: "+this.getNombreDirector()+" total de dinero otorgado al proyecto: "+this.dinertoTotalOtorgado();   
        int i;
        for (i=0;i<dl;i++){
            aux=aux+"\n"+"-Insvestigador "+(i+1)+" "+equipo[i].toString();
        }
        return aux;
    }
    public double dinertoTotalOtorgado (){
        int i;
        double aux=0;
        for (i=0;i<dl;i++){
            aux=aux+equipo[i].dineroDeInvestigador();
        }
        return aux;
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

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }
    

    
}
