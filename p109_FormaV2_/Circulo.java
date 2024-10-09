package p109_FormaV2_;

class Circulo extends Forma {
    private double radio;

    public Circulo() {
        this.radio = 0.0;
    }

   
    public Circulo(double radio, String color, boolean relleno) {
        super(color, relleno);
        this.radio = radio;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    
    @Override
    public String toString() {
        return "Circulo [" + super.toString() + ", Radio=" + radio + "]";
    }
}
