package p113_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador {

     
    private int Subordinados,Proyectos;

   
    public JugadorEntrenador(String nombre, char sexo, String descripcion, double salario, double total,
        int subordinados, int proyectos) {
        super(nombre, sexo, descripcion, salario);
        Subordinados = subordinados;
        Proyectos = proyectos;
    }

    public int getSubordinados() {
        return Subordinados;
    }

    public void setSubordinados(int subordinados) {
        Subordinados = subordinados;
    }

    public int getProyectos() {
        return Proyectos;
    }

    public void setProyectos(int proyectos) {
        Proyectos = proyectos;
    }

    public double getBono(){

        double bono=(Salario * 0.15) + (Proyectos * 100)+ (Subordinados * 10);
        return bono;
    }

    @Override
    public String toString() {
        return "JugadorEntrenador [Nombre=" + Nombre + ", Subordinados=" + Subordinados + ", Sexo=" + Sexo
        + ", Proyectos=" + Proyectos + ", Descripcion=" + Descripcion + ", Salario=" + Salario + ", Total="
        + "]";
    }

    
    



   
    

    



    

    
}