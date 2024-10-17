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
public class Medico extends Persona{
    private String especialidad;
    private int matricula;
    
    public Medico (int unDNI, String unApellido, String unNombre, int unTelefono, String unaEspecialidad, int unaMatricula){
        super (unDNI,unApellido,unNombre,unTelefono);
        this.setEspecialidad(unaEspecialidad);
        this.setMatricula(unaMatricula);
    }

    @Override
    public String toString (){
        String aux=super.toString()+"Especialidad: "+this.getEspecialidad()+" Matricula: "+this.getMatricula();
        return aux;
    }
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
