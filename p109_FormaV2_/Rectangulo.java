package p109_FormaV2_;

class Rectangulo extends Forma {
    private double largo;
    private double ancho;

    // Constructor por defecto
    public Rectangulo() {
        super();
        this.largo = 0.0;
        this.ancho = 0.0;
    }

    // Constructor con parámetros
    public Rectangulo(double largo, double ancho, String color, boolean relleno) {
        super(color, relleno);
        this.largo = largo;
        this.ancho = ancho;
    }

    // Getters y Setters
    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public double getArea() {
        return largo * ancho;
    }

    @Override
    public double getPerimetro() {
        return 2 * (largo + ancho);
    }

  
    @Override
    public String toString() {
        return "Rectangulo [" + super.toString() + ", Largo=" + largo + ", Ancho=" + ancho + "]";
    }
}
