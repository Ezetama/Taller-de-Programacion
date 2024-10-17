/*
 Se desea representar una empresa de Informática y sus programadores. La empresa tiene: nombre, un programador lider y a lo sumo N programadores. De los programadores se conoce: nombre, DNI, sueldo básico, cantidad de líneas de código por hora y lenguaje de preferencia. Adicionalmente, del programador líder se conoce: antigüedad en años y cantidad de proyectos dirigidos.
1- Genere las clases necesarias. Provea constructores para Iniciar: el programador líder y programadores a partir de toda su información; la empresa a partir de un nombre, un programador líder, con capacidad para un máximo de N programadores (Inicialmente sin programadores).
2- Implemente los métodos necesarios, en las clases que corresponda, para:
a) Dado un programador, agregarlo a la empresa.
b) Calcular el monto total en sueldos a abonar por la empresa, sabiendo que es la suma de los sueldos finales de todos los programadores de la empresa (incluido el líder). Para cualquier programador, el sueldo final es el sueldo básico adicionando 50.000$ si supera las 200 líneas de código por hora. Además de eso, para el programador líder, se adiciona $10.000 por año de antigüedad y $20.000 por proyecto dirigido.
c) Dado un monto M, aumentar el sueldo básico de todos los programadores en M (incluido el líder).
d) Retornar la representación String de la empresa, siguiendo el ejemplo:
"Empresa: nombre.
Programador líder: (nombre, DNI, lenguaje de preferencia, sueldo final}
Programador 1:
(nombre, DNI, lenguaje de preferencia, sueldo finals
Programador 2: (nombre, DNI, lenguaje de preferencia, sueldo final}
...
Monto total en sueldos a abonar por la empresa: ..."
3- Realice un programa que instancle una empresa informática con un líder. Agregue algunos programadores a la empresa. Aumente los sueldos básicos de todos los programadores de la empresa en un monto. Muestre la representación String de la empresa.
 */
package Parcial_8_10_24;

/**
 *
 * @author tamam
 */
public class ProgramaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lider miLider= new Lider ("Pancho",45538839,60000,224,"Java",3,1);
        Empresa miEmpresa= new Empresa ("Facebook",miLider,3);
        Programador pro1= new Programador ("Eze",46269110,34000,201,"Pascal");
        Programador pro2= new Programador ("Oli",44169110,31000,192,"Pascalito");
        Programador pro3= new Programador ("papa",22269110,37000,173,"HTML");
        Programador pro4= new Programador ("Juan",4624310,33000,2031,"Pascal");
        miEmpresa.agregarProgramador(pro4);
        miEmpresa.agregarProgramador(pro2);
        miEmpresa.agregarProgramador(pro1);
        miEmpresa.agregarProgramador(pro3);
        System.out.println(miEmpresa.toString());
        miEmpresa.incrementarSueldos(5231);
        System.out.println(miEmpresa.toString());
    }
    
}
