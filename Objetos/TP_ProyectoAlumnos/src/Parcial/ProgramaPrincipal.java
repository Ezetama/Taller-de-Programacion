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
package Parcial;

/**
 *
 * @author tamam
 */
public class ProgramaPrincipal {

    /**
     * @param args the command line arguments
     *///int unCodigo, String unNombre, String unaMarca, int unaCant, double unPrecio
    public static void main(String[] args) {
        Supermercado miSuper= new Supermercado ("Elchino","30 718",5,3);
        Producto produ1= new Producto (777,"Oreos","Mondelev",22,950);
        Producto produ2= new Producto (777,"pepitos","Mondelev",22,9530);
        Producto produ3= new Producto (777,"sonrisas","terrabusi",22,950);
        Producto produ4= new Producto (777,"leche","Mondelev",22,910);
        Producto produ5= new Producto (777,"jabon","avon",22,950);
        Producto produ6= new Producto (777,"Atun","xxx",0,1302);
        Producto produ7= new Producto (777,"Oreos","xxx",2,321);
        Producto produ8= new Producto (777,"Carambolas","xxdasd",0,950);
        Producto produ9= new Producto (7727,"error","xxdasd",9,950);
        miSuper.agregarProducto(produ1, 1, 1);
        miSuper.agregarProducto(produ2, 2, 2);
        miSuper.agregarProducto(produ3, 3, 1);
        miSuper.agregarProducto(produ4, 2, 1);
        miSuper.agregarProducto(produ5, 3, 2);
        miSuper.agregarProducto(produ6, 5, 2);
        miSuper.agregarProducto(produ7, 5, 1);
        miSuper.agregarProducto(produ8, 5, 3);
        miSuper.agregarProducto(produ9, 5, 3);
        System.out.println("PRUEBAAAA");
        System.out.println(miSuper.vaciarGondola(5));
        System.out.println(miSuper.toString());
        System.out.println("El numero de gonodola que exhibe mas de la marca x es: "+miSuper.marcaRepetida("Mondelev"));
        
        
    }
    
}
