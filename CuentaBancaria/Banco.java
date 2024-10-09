package CuentaBancaria;

import java.util.ArrayList;

public class Banco  {


    private String nombre;
    private String Ubicacion;


    public Banco() {
    }


 // INVOCA AL CONTRUCTOR VACIO Y TOMA LOS DATOS Y LOS ASIGNA

    public Banco(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.Ubicacion = ubicacion;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getUbicacion() {
        return Ubicacion;
    }


    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }


    //Un arreglo de clientes 



    public ArrayList<Cliente> getClientes() { 
    return getClientes(); 
    } 


    //Metodo para agregsar clientes


    public void agregarCliente(Cliente cliente){


    }


    @Override
    public String toString() {
        return "Banco [nombre=" + nombre + ", Ubicacion=" + Ubicacion + "]";
    }


    










    



    
}
