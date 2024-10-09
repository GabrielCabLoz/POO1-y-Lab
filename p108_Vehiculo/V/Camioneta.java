package p108_Vehiculo.V;

public class Camioneta extends Vehiculo {

    private double capacidad;
    private int ejes;
    
    

    public Camioneta(String serie, String marca, int año, double precio, double capacidad, int ejes) {
        super(serie, marca, año, precio);
        this.capacidad = capacidad;
        this.ejes = ejes;
    }
    public double getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
    public int getEjes() {
        return ejes;
    }
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
    @Override
    public String toString() {
        return super.toString()+ "Camioneta [capacidad=" + capacidad + ", ejes=" + ejes + "]";
    }

    
    
}
