/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author tamam
 */
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String relleno;
    private String linea;
    
    public Triangulo (double ladoa,double ladob, double ladoc, String relle, String lin){
        lado1=ladoa;
        lado2=ladob;
        lado3=ladoc;
        relleno=relle;
        linea=lin;
    }
    public Triangulo (){
        
    }
    public void setLado1 (double ladoa){
        lado1=ladoa;
    }
    public void setLado2 (double ladob){
        lado2=ladob;
    }
    public void setLado3 (double ladoc){
        lado3=ladoc;
    }
    public void setRelleno (String relle){
        relleno=relle;
    }
    public void setLinea (String line){
        linea=line;
    }
    public double getLado1(){
        return lado1;
    }
    public double getLado2(){
        return lado2;
    }
    public double getLado3(){
        return lado3;
    }
    public String getRelleno(){
        return relleno;
    }
    public String getLinea(){
        return linea;
    }
    public double calcularPerimetro(){
        double perimetro=lado1+lado2+lado3;
        return perimetro;
    }
    public double calcularArea (){
        double s=(lado1+lado2+lado3)/2.0;
        double area= Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
        return area;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", relleno=" + relleno + ", linea=" + linea + '}';
    }
    
}
