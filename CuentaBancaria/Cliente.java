package CuentaBancaria;

public class Cliente extends cuentaBancaria {

    private String nombre;
    private cuentaBancaria cuenta;


    public Cliente(int saldo, String nombre, cuentaBancaria cuenta) {
        super(saldo);
        this.nombre = nombre;
        this.cuenta = cuenta;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public cuentaBancaria getCuenta() {
        return cuenta;
    }


    public void setCuenta(cuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }


    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", cuenta=" + cuenta + "]";
    }

    
    


    
}