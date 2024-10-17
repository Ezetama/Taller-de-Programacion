/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial16_10_2024_ConsultorioMedico;

/**
 *
 * @author tamam
 */
public class Consultorio {
    private String nombre;
    private String direccion;
    private Medico profesional;
    private Paciente[][] agenda;
    private int turnos;
    
    public Consultorio (String unNombre, String unaDireccion, Medico med, int n){
        this.setNombre(unNombre);
        this.setDireccion(unaDireccion);
        this.setProfesional(med);
        turnos=n;
        agenda= new Paciente[5][turnos];
        int i,j;
        for (i=0;i<5;i++){
            for (j=0;j<turnos;j++){
                agenda[i][j]=null;
            }
        }
    }
    public void reservarTurno (Paciente p, int dia, int turno){
        if ((dia>0)&&(dia<6)&&(turno>0)&&(turno<turnos+1))
            agenda[dia-1][turno-1]=p;
    }
    public int diaMenosOcupado (){
        int aux=-1,i,j,suma,maximo=-1;
        for (i=0;i<5;i++){
            suma=0;
            for (j=0;j<turnos;j++){
                if (agenda[i][j]==null){
                    suma++;
                }
            }
            if (suma>maximo){
                maximo=suma;
                aux=i+1;
            }
        }
        return aux;
    }
    public int chequearObrasSociales (String obra){
        int aux=0,i,j;
        for (i=0;i<5;i++){
            for (j=0;j<turnos;j++){
                if ((agenda[i][j]!=null)&&(agenda[i][j].checkObra(obra)==true))
                    aux++;
            }
        }
        return aux;
    }
    @Override
    public String toString (){
        String aux="Consultorio: "+this.getNombre()+" - "+this.getDireccion()+" Dia de la semana con mas turnos disponibles: "+this.diaMenosOcupado()+"\n"
                +"Medico: "+profesional.toString()+"\n";
        int i,j;
        for (i=0;i<5;i++){
            aux=aux+"dia #"+(i+1)+"\n";
            for (j=0;j<turnos;j++){
                aux=aux+"Turno "+(j+1)+": ";
                if (agenda[i][j]==null)
                    aux=aux+"disponible"+"\n";
                else
                    aux=aux+"paciente: "+agenda[i][j].toString()+"\n";
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Medico getProfesional() {
        return profesional;
    }

    public void setProfesional(Medico profesional) {
        this.profesional = profesional;
    }
    
}
