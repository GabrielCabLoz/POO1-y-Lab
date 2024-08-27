import java.util.Scanner;

public class p38_AceptarEstudiante {

     public static void main(String[] args) {

        int edad,calf1,calf2,calf3,promedio,gen;
        String nombre;
        
        Scanner t =new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Ingresa tu sexo ");
        System.out.println("(1)Hombre (2)Mujer");
        gen=t.nextInt();
        if(gen==1){System.out.println("Solo aceptamos mujeres");
        return;}
        
        System.out.println("Ingresa el nombre del alumno ");
        nombre=t.nextLine();
        System.out.println("Por favor ingrese la edad del alumno");
        edad=t.nextInt();

        
        

        if( edad >= 21 ) {
            System.out.println("Bienvenida continuamos ");
            System.out.println("Dame tres calificaciones separadas por Enter:");
            calf1 = t.nextInt();
            calf2 = t.nextInt();
            calf3=t.nextInt();
            t.close();
            promedio=calf1+calf2+calf3/3;
            if( promedio>=8 && calf2 >=8)
            System.out.printf("\nBIENVENIDO %s tienes %d y calificaciones %.2f,%.2f ... ACEPTADO\n",nombre,edad,calf1,calf3);
            else
            System.out.println("\nSolo aceptamos estudiantes con calificaciones de 8 en adelante");
            
        }
        else 
        System.out.println("Solo aceptamos estudiantes mayores de edad ");
        System.out.println("Proceso terminado....");
      

        
        
    }

    
}