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
public class Autor {
    private String nombre;
    private String biografia;
    private String origen;
    
    public Autor (){
    }
    public Autor (String unNombre){
        nombre=unNombre;
        biografia="Sin biografia";
        origen="Marte";
    }
    public void setNombre (String unNombre){
        nombre=unNombre;
    }
    public void setBiografia (String unaBiografia){
        biografia=unaBiografia;
    }
    public void setOrigen (String unOrigen){
        origen=unOrigen;
    }
    public String getNombre (){
        return nombre;
    }
    public String getBiografia(){
        return biografia;
    }
    public String getOrigen(){
        return origen;
    }
    @Override
    public String toString() {
        String aux= ("nombre= " + nombre + ", biografia= " + biografia + ", origen= " + origen);
        return aux;
    }
    
}
