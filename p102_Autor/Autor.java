package p102_Autor;

public class Autor {

    private String nombre;
    private int edad;
    private String correo;
    
    public Autor() {
    }

    public Autor(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String toString() {
        return "Autor [nombre=" + nombre + ", edad=" + edad + ", correo=" + correo + "]";
    }

    
    

    
}
