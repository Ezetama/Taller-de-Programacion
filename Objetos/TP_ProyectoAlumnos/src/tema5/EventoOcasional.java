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
public class EventoOcasional extends Recital {
    private String motivo;
    private String contratante;
    private int dia;
    
    public EventoOcasional (String nombreBanda, int cantCan,String unMotivo, String unContratante, int unDia){
        super(nombreBanda,cantCan);
        this.setMotivo(unMotivo);
        this.setContratante(unContratante);
        this.setDia(unDia);
    }
    
    @Override
    public String actuar (){
        String aux;
        if (this.getMotivo().equals("beneficio"))
            aux="Recuerden colaborar con la donacion de alimentos no pedecederos";
        else{
            if (this.getMotivo().equals("show de TV"))
                aux="Saludos amigos televidentes";
            else
                aux="Un feliz cumpleanos para"+this.getContratante();
        }
        aux=aux+super.actuar();
        return aux;
    }
    @Override
    public double calcularCosto(){
        double aux;
        if (this.getMotivo().equals("beneficio"))
            aux=0;
        else{
            if (this.getMotivo().equals("show de TV"))
                aux=50000;
            else
                aux=150000;
        }
        return aux;
    }
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getContratante() {
        return contratante;
    }

    public void setContratante(String contratante) {
        this.contratante = contratante;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
}
