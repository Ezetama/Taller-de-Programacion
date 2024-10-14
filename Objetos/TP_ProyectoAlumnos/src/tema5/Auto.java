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
public class Auto {
    private String nombreD;
    private String patente;
    
    public Auto (String unNombre, String unaPatente){
        this.setNombreD(unNombre);
        this.setPatente(unaPatente);
    }
    public boolean estaONoEsta (String paten, boolean esta){
        if (this.getPatente().equals(paten))
                esta=true;
        return esta;
    }


    @Override
    public String toString (){
        String aux;
        aux= "Nombre del dueño "+this.getNombreD()+" patente: "+this.getPatente()+" ";
        return aux;
    }
    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
}
