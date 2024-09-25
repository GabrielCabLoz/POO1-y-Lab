package p95_empleado02;

public class app { 
    public static void main(String[] args) { 
    
    System.out.print("\033[H\033[2J"); System.out.flush();
    
    Empleado empleado1 = new Empleado(); 
    empleado1.setNombre("Martina"); 
    empleado1.setEdad(35); 
    System.out.println(empleado1.juntarNombreYEdad()); 
    
    Empleado empleado2; 
    empleado2 = new Empleado(); 
    empleado2.setNombre("Roberta"); 
    empleado2.setEdad(16); 
    System.out.println(empleado2.juntarNombreYEdad()); 

    System.out.println("Nombre : " + empleado1.getNombre()); 
    System.out.println("Edad : " + empleado1.getEdad()); 
    System.out.println("Nombre : " + empleado2.getNombre()); 
    System.out.println("Edad : " + empleado2.getEdad()); 
    } 
    } 
    
    