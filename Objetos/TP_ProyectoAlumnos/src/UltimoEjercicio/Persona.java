
package UltimoEjercicio;

/**
 *
 * @author tamam
 */
public abstract class Persona {
    private String nombre;
    private int dni;
    private int edad;
    
    public Persona (String unNombre,int unDNI, int unaEdad){
        this.setNombre(unNombre);
        this.setDni(unDNI);
        this.setEdad(unaEdad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString(){
        String aux= this.getNombre()+" edad: "+this.getEdad()+" dni: "+this.getDni();
        return aux;
    }
}