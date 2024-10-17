/*
Se desea representar un sistema que registre los streams realizados en vivo en una plataforma de streaming. De esta plataforma se conoce el nombre, la cantidad de usuarios activos, y una estructura que representa la agenda de streams del mes (1..C, 1..31), que almacenará un stream por canal y día del mes. De cada stream se conoce el nombre, el tipo de contenido, la cantidad de visualizaciones y la información del streamer principal. De cada streamer se conoce el nombre, la cantidad de seguidores y horas de streaming
acumuladas
 1. Provea constructores para inicializar los objet
plataforma a partir de un nombre, cantidad de usuarios activos, una cantida streams registrados.
2. Implemente los métodos necesarios, en las clases que corresponda, para:
a) Registrar un stream S en la agenda para un canal X y un día D. Asuma que el día D para el Apelide y canal X no está ocupado. Módulo Objeto TURNO D
a crean
b) Retornar la cantidad de visualizaciones acumuladas del canal C.
comprima
p.
16/10/2024
argare del proyecto y guardelo i just chatting" en el día D. PORTAL c) Retornar la cantidad de streams de tipo "Just chatting" en d) Obtener un String que represente la plataforma siguiendo el ejemplo: erantur un sistema que registra (cs traums real addo, on vive en un plataforma de streaming "Plataforma: nombre, cantidad de usuários activos: activos, y una estructure que representa i agenda dolaram del mes (1..C, 1..31), que alm.iconará un stream per canal y día cel inas. De cede straam conce Canal 1 - Cant Visualizaciones acumuladas del canal: <cant Visualizaciones> ción del street incipi, De cada streamer se conoce el riombre, la cantidad de seguidores y horas de strenning
Dia
Proves Día 2: Sin Stream asignador los objetos a partir de la información necesaria. En particular le fir de un nombre cantidad de usuarios activos, una cantidad, de canales Cain Día 3: Nombre, tipo de contenido, cantidad de visualizaciones, todos los datos del Streamer og strades.
mplemente los métodos necesarios, en las clases que corresponds, para
Canal C:- Cant Visualizaciones acumuladas del canal: <cantVisualizaciones>
a) Registrar en stream S en la agenda para un cans y un dia D. Asuma que el dia D para el sonal X no esté cocupado.
3. Realice un programa que
e un programa que simule el registro de algunos streams en la agenda y compruebe el correcto funcionamiento de los métodos implementados.
 */
package Parcial_16_10_2024_Streams;

/**
 *
 * @author tamam
 */
public class ProgramaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Plataforma twitch= new Plataforma ("Twitch",120007,4);
        Streamer st1= new Streamer ("Fernanflo",1234,1);
        Streamer st2= new Streamer ("bruno",40000,72);
        Streams s1= new Streams ("Comiendo panchos","games",31,st1);
        Streams s2= new Streams ("Comiendo oreos","Just chatting",31,st2);
        Streams s3= new Streams ("hablando con pepe","Just chatting",31,st2);
        Streams s4= new Streams ("Comiendo ","Just chatting",31,st2);
        Streams s5= new Streams (" panchos por doquier","games",31,st1);
        Streams s6= new Streams ("Comidasdadawa","games",31,st1);
        
        twitch.registrarStream(s1, 1, 1);
        twitch.registrarStream(s2, 3, 1);
        twitch.registrarStream(s3, 3, 2);
        twitch.registrarStream(s4, 3, 4);
        twitch.registrarStream(s5, 4, 1);
        twitch.registrarStream(s6, 4, 3);
        
        System.out.println("La cantidad de streams de la categoria JC es: "+twitch.contarJustChatting(3));
        System.out.println(twitch.toString());
        
    }
    
}
