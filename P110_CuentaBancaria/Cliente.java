package P110_CuentaBancaria;

public class Cliente {

    private String Nombre;
    private cuentaBancaria Cuenta;


    public Cliente( String nombre,cuentaBancaria cuenta) {
        
        Nombre = nombre;
        Cuenta = cuenta;
    }


    public String getNombre() {
        return Nombre;
    }


    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public cuentaBancaria getCuenta() {
        return Cuenta;
    }


    public void setCuenta(cuentaBancaria cuenta) {
        Cuenta = cuenta;
    }


    @Override
    public String toString() {
        return "Cliente [nombre=" + Nombre + ", cuenta Saldo =" + Cuenta +Cuenta.getSaldo()+ "]";


    }

    
    


    
}