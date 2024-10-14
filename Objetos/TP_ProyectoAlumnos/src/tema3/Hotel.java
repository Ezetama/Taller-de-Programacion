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
public class Hotel {
    private int cantHabitaciones;
    private Habitacion[] habitaciones;
    
    public Hotel (int cant){
        cantHabitaciones=cant;
        habitaciones= new Habitacion[cant];
        int i;
        for (i=0;i<cantHabitaciones;i++)
            habitaciones[i]=new Habitacion();
    }
    public void agregarHospedaje (int numeroHabitacion, Cliente persona){
        habitaciones[numeroHabitacion].cargarCliente(persona);
    }
    public void aumentarPrecio (double aumento){
        int i;
        for (i=0;i<cantHabitaciones;i++)
            habitaciones[i].aumentar(aumento);
    }
    public void informar (){
        int i;
        String aux;
        for (i=0;i<cantHabitaciones;i++){
            aux= ("Habitacion "+(i+1)+": "+habitaciones[i].informe());
            System.out.println (aux);
        }
    }
    public int getcantHabitaciones(){
        return cantHabitaciones;
    }
    
}
