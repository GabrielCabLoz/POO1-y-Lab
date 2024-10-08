
public class Circulo {
    
    private Punto Centro;
    private double Radio;

    public Circulo() {
        
    }

    public Circulo(Punto centro, double radio) {
        Centro = centro;
        Radio = radio;
    }

    public Punto getCentro() {
        return Centro;
    }

    public void setCentro(Punto centro) {
        Centro = centro;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        Radio = radio;
    }

    public double getArea(){
        Double Area = Math.PI * Math.pow(Radio, 2);
        return Area;
    }

    public double getCircunferencia(){
        Double Circunferencia = 2 * Math.PI * Radio;
        return Circunferencia;
    }

    @Override
    public String toString() {
        return "Circulo [Centro=" + Centro + ", Radio=" + Radio + "]";
    }

}
