package p108_Vehiculo1.V;

import java.util.ArrayList;

public class Vehiculo_Main {


public static void main(String[] args) {

    System.out.print("\033[H\033[2J"); System.out.flush();
    
    Vehiculo vehiculo1=new Camioneta("90288483", "ford", 2004, 20000, 4, 2);
    Vehiculo vehiculo2=new Compacto("90288483", "BMW", 2011, 40000, 4, 2);
    Vehiculo vehiculo3=new Camioneta("90288483", "Toyota", 2010, 90000, 4, 2);
    Vehiculo vehiculo4=new Compacto("90288483", "Ferrari", 2020, 300000, 2, 2);

    ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    vehiculos.add(vehiculo1);
    vehiculos.add(vehiculo2);
    vehiculos.add(vehiculo3);
    vehiculos.add(vehiculo4);
    
    System.out.println("\nDatos de los Vehiculos de la flota  :\n");
        
    for ( Vehiculo vehiculo : vehiculos) {
        System.out.println(vehiculo.toString());
        
    }

    int sumaTotal = 0;

    for (Vehiculo vehiculo : vehiculos) {
        sumaTotal += vehiculo.getPrecio(); 
    }

    System.out.println("Calculando el precio de todos los Vehiculos");
    System.out.println(" ");

    System.out.println("la suma de los precios es "+sumaTotal);
    
}
    
}
