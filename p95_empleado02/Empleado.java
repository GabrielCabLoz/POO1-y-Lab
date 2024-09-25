package p95_empleado02;

public class Empleado {

    private String nombre;
    private int edad;

    public int getEdad(){
        return edad;
    }

    public void setEdad(int Edad){
        Edad=edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String Nombre){
        Nombre=nombre;
    }

    public String juntarNombreYEdad(){
        return (nombre+","+edad);
    }
    
}
