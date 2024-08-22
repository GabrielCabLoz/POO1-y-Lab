import java.util.*;
public class p27_AceptarEstudiante {

    public static void main(String[] args) {

        int edad,calf1,calf2;
        String nombre;
        Scanner t =new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Ingresa el nombre del alumno ");
        nombre=t.nextLine();
        System.out.println("Por favor ingrese la edad del alumno");
        edad=t.nextInt();

        if( edad >= 18 ) {
            System.out.println("Eres mayor de edad, continuamos ");
            System.out.println("Dame dos calificaciones separadas por Enter:");
            calf1 = t.nextInt();
            calf2 = t.nextInt();
            t.close();
            if( calf1 >= 8 && calf2 >= 8)
            System.out.printf("\nBIENVENIDO %s tienes %d y calificaciones %.2f,%.2f ... ACEPTADO\n",nombre,edad,calf1,calf2);
            else
            System.out.println("\nSolo aceptamos estudiantes con calificaciones de 8 en adelante");
            
        }
        else 
        System.out.println("Solo aceptamos estudiantes mayores de edad ");
        System.out.println("Proceso terminado....");
      

        
        
    }

    
}