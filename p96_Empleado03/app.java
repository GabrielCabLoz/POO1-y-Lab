package p96_Empleado03;

public class app {

    public static void main(String[] args) { 
        System.out.print("\033[H\033[2J"); System.out.flush();
        Empleado empleado1 = new Empleado("Juan Perez",35); 
        System.out.println(empleado1.juntarNombreYEdad()); 
        Empleado empleado2 = new Empleado("Maria de Jesus",16); 
        System.out.println(empleado2.juntarNombreYEdad()); 
        Empleado empleado3 = new Empleado(); 
        empleado3.setNombre("Dario Jimenez"); 
        empleado3.setEdad(33); 
        System.out.println(empleado3.juntarNombreYEdad()); 
        System.out.println(" Nombre : " + empleado1.getNombre()); 
        System.out.println(" Edad : " + empleado1.getEdad()); 
        } 
        }
        

