/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

package tema5;

/**
 *
 * @author tamam
 
public class Estacionamiento {
   private String nombre;
   private String direc;
   private String horaApertura;
   private String horaCierre;
   private int pisos;
   private int plazas;
   private Auto[][] lugares;
   
   public Estacionamiento (String unNombre, String unaDirec){
       this.setNombre(unNombre);
       this.setDirec(unaDirec);
       this.setHoraApertura("8:00");
       this.setHoraCierre("21:00");
       this.setPisos(5);
       this.setPlazas(10);
       lugares= new Auto [pisos][plazas];
   }
   public Estacionamiento (String unNombre, String unaDirec, String unaHoraA, String unaHoraC, int cantPisos, int cantPlazas){
       this.setNombre(unNombre);
       this.setDirec(unaDirec);
       this.setHoraApertura(unaHoraA);
       this.setHoraCierre(unaHoraC);
       this.setPisos(cantPisos);
       this.setPlazas(cantPlazas);
       lugares= new Auto [pisos][plazas];
       int i,j;
       for (i=0;i<this.getPisos();i++){
           for (j=0;j<this.getPlazas();j++){
               lugares[i][j]= new Auto();
           }
       }
   }
   public void agregarAuto (Auto a,int piso, int plaza ){
       lugares[piso-1][plaza-1]=a;
       lugares[piso-1][plaza-1].setOcupado(true);
   }
   public int chequearPlaza (int p){
       int i,cant=0;
       for (i=0;i<this.getPisos();i++){
           if (lugares[i][p-1].isOcupado()==true) {
               System.out.println("prueba aumenteeee");
               cant++;
           }
       }
       return cant;
   }
   @Override
   public String toString (){
       String aux="";
       int i,j;
       for (i=0;i<this.getPisos();i++){
           for (j=0;j<this.getPlazas();j++){
               aux=aux+"Piso "+(i+1)+" Plaza "+(j+1)+": ";
               if (lugares[i][j].isOcupado()) 
                    aux=aux+lugares[i][j].toString();
               else
                   aux= aux+"libre"+"\n";
               
           }
       }
       return aux;
   } 
   public String estaPatente (String paten){
       int i=0,j=0;
       String aux;
       while ((i<this.getPisos())&&(lugares[i][j].getPatente().equals(paten)==false)){
           while ((j>this.getPlazas())&&(lugares[i][j].getPatente().equals(paten)==false)){
               j++;
            }
           i++;
       }
       if (i<pisos)
           aux="Se encuentra en el piso "+(i+1)+" plaza "+(j+1);
       else
           aux= "El auto no se encuentra en el estacionamiento";
       return aux;
   }
    /*public String estaPatente (String Paten){
       int i=0,j=0;
       String aux;
       boolean esta= false;
       while ((i<pisos)&&(esta==false)){
           while ((j<plazas)&&(esta==false)){
               esta= lugares[i][j].estaONoEsta(Paten, esta);
               j++;
            }
           i++;
       }
       if (esta==true)
           aux="Se encuentra en el piso"+(i)+" plaza "+(j);
       else
           aux= "El auto no se encuentra en el estacionamiento";
        return aux;
   }*/
/*
    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plzas) {
        this.plazas = plzas;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public String getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(String horaApertura) {
        this.horaApertura = horaApertura;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }
   
}*/
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
public class Estacionamiento {
   private String nombre;
   private String direc;
   private String horaApertura;
   private String horaCierre;
   private int pisos;
   private int plazas;
   private Auto[][] lugares;
   
   public Estacionamiento (String unNombre, String unaDirec){
       this.setNombre(unNombre);
       this.setDirec(unaDirec);
       this.setHoraApertura("8:00");
       this.setHoraCierre("21:00");
       this.setPisos(5);
       this.setPlazas(10);
       lugares= new Auto [pisos][plazas];
   }
   public Estacionamiento (String unNombre, String unaDirec, String unaHoraA, String unaHoraC, int cantPisos, int cantPlazas){
       this.setNombre(unNombre);
       this.setDirec(unaDirec);
       this.setHoraApertura(unaHoraA);
       this.setHoraCierre(unaHoraC);
       this.setPisos(cantPisos);
       this.setPlazas(cantPlazas);
       lugares= new Auto [pisos][plazas];
   }
   public void agregarAuto (Auto a,int piso, int plaza ){
       lugares[piso-1][plaza-1]=a;
   }
   public int chequearPlaza (int p){
       int i,cant=0;
       for (i=0;i<this.getPisos();i++){
           if (lugares[i][p-1]!=null)
               cant++;
        }
       return cant;
   }
   @Override
   public String toString (){
       String aux="";
       int i,j;
       for (i=0;i<this.getPisos();i++){
           for (j=0;j<this.getPlazas();j++){
               aux=aux+"Piso "+(i+1)+" Plaza "+(j+1)+": ";
               if (lugares[i][j]!=null)
                    aux=aux+lugares[i][j].toString();
               else
                   aux= aux+"libre"+"\n";
               
           }
       }
       return aux;
   } 
   public String estaPatente (String paten){
       int i=0,j=0;
       String aux;
       boolean encontre=false;
       while ((i<this.getPisos())&&(encontre==false)){
           j=0;
           while ((j<this.getPlazas())&&(encontre==false)){
               if (lugares[i][j]==null)
                   j++;
               else {
                    if (lugares[i][j].getPatente().equals(paten)){
                         encontre=true;
                    }
                    else{
                        j++;
                    }
               }
           }
           if (encontre==false)
                i++;
       }
       if (encontre==true)
           aux="Se encuentra en el piso "+(i+1)+" plaza "+(j+1);
       else
           aux= "El auto no se encuentra en el estacionamiento";
       return aux;
   }
    /*public String estaPatente (String Paten){
       int i=0,j=0;
       String aux;
       boolean esta= false;
       while ((i<pisos)&&(esta==false)){
           while ((j<plazas)&&(esta==false)){
               esta= lugares[i][j].estaONoEsta(Paten, esta);
               j++;
            }
           i++;
       }
       if (esta==true)
           aux="Se encuentra en el piso"+(i)+" plaza "+(j);
       else
           aux= "El auto no se encuentra en el estacionamiento";
        return aux;
   }*/

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plzas) {
        this.plazas = plzas;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public String getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(String horaApertura) {
        this.horaApertura = horaApertura;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }
   
}

