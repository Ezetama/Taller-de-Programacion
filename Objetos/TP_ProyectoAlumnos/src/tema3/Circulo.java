/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author New User
 */
public class Circulo {
    private double radio;
    private String relleno;
    private String linea;

public Circulo (double unRadio,String unRelleno, String unaLinea){
    radio=unRadio;
    relleno=unRelleno;
    linea=unaLinea;
}
public Circulo (){
    
}
public double calcularPerimetro(){
    double aux;
    aux=2*radio*Math.PI;
    return aux;
}
public double calcularArea(){
    double aux;
    aux=radio*radio*Math.PI;
    return aux;
}
public void setRadio(double unRadio){
    radio=unRadio;
}
public void setRelleno (String unRelleno){
    relleno=unRelleno;
}
public void setLinea (String unaLinea){
    linea=unaLinea;
}

    public double getRadio() {
        return radio;
    }

    public String getRelleno() {
        return relleno;
    }

    public String getLinea() {
        return linea;
    }

}