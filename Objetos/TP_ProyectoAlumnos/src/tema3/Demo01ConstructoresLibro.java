/*
Demo que crea objetos Libro invocando a los constructores definidos. 
 */
package tema3;

/**
 *
 * @author vsanz
 */
public class Demo01ConstructoresLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autor autor1=new Autor ("Nicolas Cage");
        Autor autor2= new Autor ("Pancho Perez Pereira");
        Libro libro1= new  Libro( "Java: A Beginner's Guide","Mcgraw-Hill", 2014,autor1, "978-0071809252", 21.72);
        Libro libro2= new Libro("Learning Java by Building Android Games","CreateSpace Independent Publishing",autor2, "978-1512108347");
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println("Precio del libro2: " +libro2.getPrecio());
        System.out.println("Año edición del libro2: " +libro2.getAñoEdicion());
        Libro libro3= new Libro(); 
        libro3.setTitulo("La concha de tu hermana");
        Estante coleccion=new Estante();
        coleccion.agregarLibro(libro1);
        coleccion.agregarLibro(libro2);
        System.out.println ("La cantidad de libros en el estante es de "+coleccion.cantLibros());
        coleccion.agregarLibro(libro3);
        System.out.println (coleccion.chequeoLleno());
        Libro libro4=new Libro();
        Autor escritor=new Autor("Pato Donald");
        libro4.setAñoEdicion(2004);
        libro4.setEditorial("ECC Argentina");
        libro4.setISBN("777");
        libro4.setPrecio(420);
        libro4.setPrimerAutor(escritor);
        libro4.setTitulo("Mujercitas");
        //libro4.setTitulo("Hombrecitos");
        coleccion.agregarLibro(libro4);
        System.out.println (coleccion.BuscarMujercitas());
        
    }
    
}
