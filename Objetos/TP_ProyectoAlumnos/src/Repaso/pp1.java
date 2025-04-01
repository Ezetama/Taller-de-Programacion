/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso;
import PaqueteLectura.Lector;
/**
 *
 * @author tamam
 */
public class pp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proyecto mc= new Proyecto ("MC donalds",7777,"mr.burger");
        Investigador eze= new Investigador ("Ezequiel Tamame",3,"freidor de churros");
        Investigador negro= new Investigador ("Negro",2,"Panadero");
        Investigador spo= new Investigador ("Spotti",4,"Ñoqui");
        Subsidio sub1= new Subsidio (13000,"exceso de grasa");
        Subsidio sub2= new Subsidio (1005,"Estudiante");
        Subsidio sub3= new Subsidio (5012,"Robado");
        Subsidio sub4= new Subsidio (13000,"exceso de grasa");
        Subsidio sub5= new Subsidio (1005,"Estudiante");
        Subsidio sub6= new Subsidio (5012,"Robado");
        mc.agregarIns(spo);
        mc.agregarIns(eze);
        mc.agregarIns(negro);
        eze.agregarSub(sub1);
        eze.agregarSub(sub2);
        negro.agregarSub(sub4);
        negro.agregarSub(sub3);
        spo.agregarSub(sub5);
        spo.agregarSub(sub6);
        System.out.println("Ingrese 2 nombres para otorgales sus subsidios");
        mc.otorgatTodos(Lector.leerString());
        mc.otorgatTodos(Lector.leerString());
        System.out.println(mc.toString());
    }
    
}
