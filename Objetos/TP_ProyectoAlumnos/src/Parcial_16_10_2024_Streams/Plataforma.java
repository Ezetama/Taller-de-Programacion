/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial_16_10_2024_Streams;

/**
 *
 * @author tamam
 */
public class Plataforma {
    private String nombre;
    private int usuarios;
    private Streams[][] agenda;
    private int canales;
    
    public Plataforma (String unNombre, int cantU, int cantCanales){
        this.setNombre(unNombre);
        this.setUsuarios(cantU);
        canales=cantCanales;
        agenda= new Streams[31][canales];
        int i,j;
        for (i=0;i<31;i++){
            for (j=0;j<canales;j++){
                agenda[i][j]=null;
            }
        }
    }
    public void registrarStream (Streams s,int dia, int canal){
        if ((dia>0)&&(dia<32)&&(canal>0)&&(canal<canales+1)){
            agenda[dia-1][canal-1]=s;
        }
        else
            System.out.println("Los datos ingresados son incorrectos");
    }
    public int sumarVistas (int c){
        int aux=0,i;
        for (i=0;i<31;i++){
            if (agenda[i][c]!=null)
                aux=aux+agenda[i][c].getVistas();
        }
        return aux;
    }
    public int contarJustChatting (int d){
        int aux=0,i;
        for (i=0;i<canales;i++){
            if ((agenda[d-1][i]!=null)&&(agenda[d-1][i].chequearTipo("Just chatting")==true)){
                aux++;
            }
        }
        return aux;
    }
    @Override
    public String toString (){
        String aux="Plataforma: "+this.getNombre()+", "+this.getUsuarios()+"\n";
        int i,j;
        for (i=0;i<canales;i++){
            aux=aux+"Canal "+(i+1)+" - "+this.sumarVistas(i)+"\n";
            for (j=0;j<31;j++){
                aux=aux+"dia "+(j+1)+": ";
                if (agenda[j][i]!=null)
                    aux=aux+agenda[j][i].toString()+"\n";
                else
                    aux=aux+"Sin Stream asignado"+"\n";
            }
        }
        
        return aux;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(int usuarios) {
        this.usuarios = usuarios;
    }
    
}
