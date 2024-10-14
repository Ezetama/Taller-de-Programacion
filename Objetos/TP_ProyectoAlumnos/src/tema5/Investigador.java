/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *
 * @author tamam
 */
public class Investigador {
    private String nombre;
    private int categoria;
    private String especialidad;
    private Subsidio[] apoyoEconomico;
    private int dl;
    
    public Investigador(String unNombre,int unaCategoria, String unaEspecialidad){
        this.setNombre(unNombre);
        this.setCategoria(unaCategoria);
        this.setEspecialidad(unaEspecialidad);
        apoyoEconomico= new Subsidio[5];
        dl=0;
    }
    public void agregarSubsidio(Subsidio sub){
        if (dl<5){
            apoyoEconomico[dl]=sub;
            dl++;
        }
        else    
            System.out.println("El inverstigador ha llegado al maximo de subsidios(5)");
    }
    public void otorgarTodos2(){
        int i;
        for (i=0;i<dl;i++){
            apoyoEconomico[i].setOtorgado(true);
        }
    } 
    @Override
    public String toString(){
        String aux="Nombre: "+this.getNombre()+" numero de categoria: "+this.getCategoria()+" especialidad: "+this.getEspecialidad()+" total de dinero de sus subsidios: "+this.dineroDeInvestigador();
        return aux;
    }
    
    public double dineroDeInvestigador (){
        int i;
        double aux=0;
        for (i=0;i<dl;i++){
            if (apoyoEconomico[i].isOtorgado()==true) {
                aux=aux+apoyoEconomico[i].getMonto();
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
    
}
