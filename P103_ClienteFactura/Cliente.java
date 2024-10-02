package P103_ClienteFactura;

public class Cliente {
    private int id;
    private String nombre;
    private float descuento;

    public Cliente() {}

    public Cliente(int id, String nombre, float descuento) {
        this.id = id;
        this.nombre = nombre;
        this.descuento = descuento;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Cliente{id=" + id + ", nombre='" + nombre + "', descuento=" + descuento + '}';
    }
}
