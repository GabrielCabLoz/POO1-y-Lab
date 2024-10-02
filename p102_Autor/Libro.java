package p102_Autor;

public class Libro {

    private String ISBN;
    private String nombre;
    private double precio;
    private Autor autor;
    public Libro() {
    }
    public Libro(String iSBN, String nombre, double precio, Autor autor) {
        ISBN = iSBN;
        this.nombre = nombre;
        this.precio = precio;
        this.autor = autor;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    @Override
    public String toString() {
        return "Libro [ISBN=" + ISBN + ", nombre=" + nombre + ", precio=" + precio + ", autor=" + autor + "]";
    }

    
   




    
}
