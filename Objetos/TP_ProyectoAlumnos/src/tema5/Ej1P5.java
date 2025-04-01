/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;
import PaqueteLectura.Lector;
/**
 *
 * @author tamam
 */
public class Ej1P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proyecto pro= new Proyecto ("Papitas gratis",777,"Ezequiel Tamame");
        Investigador ins1= new Investigador ("Ezequiel Tamame",3,"Informatico");
        pro.agregarInvestigador(ins1);
        Investigador ins2= new Investigador ("El negro",1,"Fiambrero");
        pro.agregarInvestigador(ins2);
        Investigador ins3= new Investigador ("Spotti",2,"Ñoqui");
        pro.agregarInvestigador(ins3);
        Subsidio sub1= new Subsidio(20000,"Para el asado");
        Subsidio sub2= new Subsidio(10000,"Para el desfibrilador");
        Subsidio sub3= new Subsidio (5000,"Para el ventilador");
        Subsidio sub4= new Subsidio (20000,"Para el asado");
        Subsidio sub5= new Subsidio (10000,"Para el desfibrilador");
        Subsidio sub6= new Subsidio (5000,"Para el ventilador");
        ins1.agregarSubsidio(sub1);
        ins1.agregarSubsidio(sub2);
        ins2.agregarSubsidio(sub3);
        ins2.agregarSubsidio(sub4);
        ins3.agregarSubsidio(sub5);
        ins3.agregarSubsidio(sub6);
        pro.otorgarTodos(Lector.leerString());
        pro.otorgarTodos("El negru");
        System.out.println(pro.toString());
    }
    
}
