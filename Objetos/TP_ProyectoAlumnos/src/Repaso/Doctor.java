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
public class Doctor extends Persona {
    private int matricula;
    private String especializacion;
    private String consultorio;
    
    public Doctor (String unNombre,int unaEdad,double unPeso,int unaMatricula,String unaEspecializacion, String unConsultorio){
        super (unNombre,unaEdad,unPeso);
        this.setMatricula(unaMatricula);
        this.setEspecializacion(unaEspecializacion);
        this.setConsultorio(unConsultorio);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }
    @Override
    public String toString (){
        String aux= super.toString()+" DOCTOR - matricula: "+this.getMatricula()+" especializacion: "+this.getEspecializacion()+" consultorio: "+this.getConsultorio();
        return aux;
    }
}
