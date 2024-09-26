package p97_Empleado04;

public class Empleado {
    private String nombre;
    private int edad;
    private char sexo;
    private boolean Estado_civil;
    
    public Empleado() {

    }

    

    public Empleado(String nombre, int edad, char sexo, boolean Estado_civil) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.Estado_civil=Estado_civil;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }



    public boolean getEstado_civil() {
        return Estado_civil;
    }



    public void setEstado_civil(boolean estado_civil) {
        Estado_civil = estado_civil;
    }

    

    



    
}
