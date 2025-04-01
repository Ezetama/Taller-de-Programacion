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
public class Paciente extends Persona {
    private String obraSocial;
    
    public Paciente (int unDNI, String unApellido, String unNombre, int unTelefono, String unaObra){
        super (unDNI,unApellido,unNombre,unTelefono);
        this.setObraSocial(unaObra);
    }
    public boolean checkObra (String obra){
        boolean ok= false;
        if (this.getObraSocial().equals(obra))
            ok=true;
        return ok;
    }

    @Override
    public String toString (){
        String aux= super.toString()+"Obra social: "+this.getObraSocial();
        return aux;
    }
    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }
    
}
