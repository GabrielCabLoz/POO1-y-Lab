package p99_Rectangulo;

public class Rectangulo {
    float largo;
    float ancho;

    //Constructor
    public Rectangulo(float largo,float ancho){
        this.largo=largo;
        this.ancho=ancho;

    }
    //Constructor vacio
    public Rectangulo(){

    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getArea(){
        return ancho*largo;
    }

    public float getPerimetro(){
        return (ancho*2)+(largo*2);
    }

    public String toString() {
        return "Rectangulo [largo=" + largo + ", ancho=" + ancho + "]";
    }

    


    


    
}
