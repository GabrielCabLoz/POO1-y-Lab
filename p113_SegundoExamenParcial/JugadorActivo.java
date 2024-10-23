package p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador {

    private int Partidos,Goles;

    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, double total, int partidos,
        int goles) {
        super(nombre, sexo, descripcion, salario);
        Partidos = partidos;
        Goles = goles;
    }

    public int getPartidos() {
        return Partidos;
    }

    public void setPartidos(int partidos) {
        Partidos = partidos;
    }

    public int getGoles() {
        return Goles;
    }

    public void setGoles(int goles) {
        Goles = goles;
    }


    @Override
    public double getBono() {
        double bono = (Salario * 0.15) + (Partidos * 50)+ (Goles * 5);
        
        return bono;
    }

    @Override
    public String toString() {
        return "JugadorActivo [Partidos=" + Partidos + ", Goles=" + Goles + ", toString()=" + super.toString() + "]";
    }
    
    
    
}
