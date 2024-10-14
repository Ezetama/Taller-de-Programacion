/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author tamam
 */
public class Circulo extends Figura {
    private double radio;
    
    public Circulo (String r, String l, double unRadio){
        super(r,l);
        this.setRadio(unRadio);
    }
    public void setRadio (double unRadio){
        radio=unRadio;
    }
    public double getRadio (){
        return radio;
    }
    @Override
    public String toString (){
        String aux= (super.toString()+" y su radio es "+this.getRadio());
        return aux;
    }
    @Override
    public double calcularPerimetro (){
        double aux=2*radio*Math.PI;
        return aux;
    }
    @Override
    public double calcularArea (){
        double aux=radio*radio*Math.PI;
        return aux;
    }
}
