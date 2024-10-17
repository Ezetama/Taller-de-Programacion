/*
Se desea modelar un supermercado. Un supermercado tiene nombre, dirección y mantiene una estructura que para cada góndola (1..G) y cada estante de la góndola (1..E) almacena el producto a exhibir. De cada producto a exhibir se guarda código, nombre, marca, cantidad de unidades exhibidas y precio por unidad.
1. Genere las clases necesarias. Provea constructores para iniciar: los productos a partir de la información necesaria; el supermercado a partir de un nombre, una dirección, una cantidad de góndolas G y una cantidad de estantes por góndola E. Inicialmente la estructura no tiene productos a exhibir.
2. Implemente los métodos necesarios, en las clases que corresponda, para:
a. Registrar un producto a exhibir en la góndola X, estante Y. Asuma que X e Y están en rango 1..Gy 1..E respectivamente.
b. Liberar todos los estantes de la góndola X que estén ocupados por productos con cantidad de unidades exhibidas en 0 y devolver un String con las representaciones de los productos eliminados. La representación de un producto sigue el formato:
C.
"Producto(Código - nombre - marca - cantidad de unidades exhibidas - precio}" Obtener el número de góndola que exhibe más productos de la marca M. d. Obtener un String que represente el supermercado siguiendo el ejemplo: "Supermercado: Nombre; Dirección
Gondola 1:
Estante 1: Producto Código- nombre marca - cantidad de unidades exhibidas - precio} Estante 2: Producto{Código - nombre - marca - cantidad de unidades exhibidas - precio}
Gondola G:
3. Realice un programa que instancie un supermercado. Registre productos en distintas góndolas y estantes. Compruebe el correcto funcionamiento de los métodos implementados.
 */
package Parcial_15_10_2014;

/**
 *
 * @author tamam
 */
public class ProgramaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Supermercado chino= new Supermercado ("Chino","SAN MARTIN AL 90",3,4);
        Producto p1= new Producto (777,"oreo","mondelev",3,950);
        Producto p2= new Producto (777,"pepito","mondelev",3,950);
        Producto p3= new Producto (777,"chips Ahoy","mondelev",3,950);
        Producto p4= new Producto (777,"blem","vour",3,950);
        Producto p5= new Producto (777,"mouso","logi",0,950);
        Producto p6= new Producto (777,"pan","caserito",3,950);
        chino.exhibir(p1, 2, 1);
        chino.exhibir(p2, 2, 2);
        chino.exhibir(p3, 1, 1);
        chino.exhibir(p4, 3, 1);
        chino.exhibir(p5, 1, 2);
        chino.exhibir(p6, 1, 2);
        System.out.println("La gondola que mas posee productos de la marca es "+chino.buscarMarca("mondelev"));
        System.out.println(chino.toString());
        System.out.println("LIBERAR"+chino.liberarGondola(1));
        System.out.println(chino.toString());
    }
    
}
