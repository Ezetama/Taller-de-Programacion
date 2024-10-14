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
public class Triangulo extends Figura {
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo (double ladoa, double ladob,double ladoc, String r,String l){
        super(r,l);
        this.setLado1(ladoa);
        this.setLado2(ladob);
        this.setLado3(ladoc);
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    @Override
    public String toString (){
        String aux;
        aux= (super.toString()+" lado 1: "+this.getLado1()+" lado 2: "+this.getLado2()+" lado 3: "+this.getLado3());
        return aux;
    }

    @Override
    public double calcularArea() {
        double s=(this.getLado1()+this.getLado2()+this.getLado3())/2.0;
        double area= Math.sqrt(s*(s-this.getLado1())*(s-this.getLado2())*(s-this.getLado3()));
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double peri = this.getLado1()+this.getLado2()+this.getLado3();
        return peri;
    }

}
