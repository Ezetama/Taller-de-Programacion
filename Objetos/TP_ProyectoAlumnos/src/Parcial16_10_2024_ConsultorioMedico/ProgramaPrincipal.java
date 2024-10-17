/*
Se requiere representar la información de un consultorio médico. Del consultorio se conoce el nom bre, la dirección, la información del Médico y la información de los pacientes que han reservado un turno para la próxima semana. Los turnos de la semana se organizan en 5 dias y N turnos (1..N) por día. De cada Paciente se conoce: DNI, apellido y nombre, número de teléfono y obra social. Del médico se conoce DNI, apellido y nombre, número de teléfono, especialidad y número de matricula.
Genere las clases necesarias y provea constructores para iniciarlas con la información necesaria. En particular el consultorio se crea con un médico M, para N turnos por día y sin reservas de pacientes.
2. Implemente los métodos necesarios, en las clases que corresponda, para:
a
Reservar un turno para un paciente P en el turno T del día de la semana D. Asumir que el turno solicitado está disponible.
Obtener la cantidad de pacientes con una Obra Social X que se recibe como parámetro.
b
Obtener el cla de la semana con más turnos disponibles.
d
Obtener la representación en String del consultorio, siguiendo el ejemplo:
"Consultorio: <nombre>-<dirección> Dia de la semana con más turnos disponibles: <cont>
Médico: DNI: DND <Apellido y Nombrex-Te: teléfono>- Especialidad: cespecialidad>-Matricula:<mat>.
Dia #3:
Turno 1: Paciente: DNI: <DNI> <Apellido y Nombre> -Te: <teléfono. OS: cobrasocial> Turno 2: disponible
Turno 3: Paciente: DNI: <DNI> <Apellido y Nombre>-Te: <teléfono>, 05: cobrosocial>
Dis #2:
Turno 1 disponible
Turno 2: disponible
+
Turno 3: Paciente: DNI: <DNI> <Apellido y Nombre>-Te: <teléfono>. OS: cobrosocial>
3. Realice un programa cue instancie un consultorio con sus datos. Reserve algunos turnos y compruebe el correcto funcionamiento de los métodos implementados..
 */
package Parcial16_10_2024_ConsultorioMedico;

/**
 *
 * @author tamam
 */
public class ProgramaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Medico elpapu=new Medico (45538839,"canguillen","Juan",221319,"urologo",222777);
        Consultorio con= new Consultorio ("medicine plus","calle 30 y 47",elpapu,3);
        Paciente p1= new Paciente (222111,"Perez","Pancho",221411,"IOMA");
        Paciente p2= new Paciente (222111,"Perez","Pancho",221411,"IOMA");
        Paciente p3= new Paciente (222111,"Perez","Pancho",221411,"IOMA");
        Paciente p4= new Paciente (222111,"Perez","Pancho",221411,"OSDE");
        Paciente p5= new Paciente (222111,"Perez","Pancho",221411,"OSDE");
        Paciente p6= new Paciente (222111,"Perez","Pancho",221411,"sin obra social");
        con.reservarTurno(p1, 1, 1);
        con.reservarTurno(p2, 1, 2);
        con.reservarTurno(p3, 1, 3);
        con.reservarTurno(p4, 2, 1);
        con.reservarTurno(p5, 3, 1);
        con.reservarTurno(p6, 4, 1);
        System.out.println(con.toString());
        System.out.println("La cantidad de pacientes con la obra social ingresada es: "+con.chequearObrasSociales("OSDE"));
        
    }
    
}
