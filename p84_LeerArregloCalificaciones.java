import java.util.*;
public class p84_LeerArregloCalificaciones {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        int n=0;
        float suma=0,promedio=0;
        Scanner t =new Scanner(System.in);

        System.out.println("Cuantas calificaciones ?");
        n=t.nextInt();

        float[]calificaciones=new float[n];
        System.out.println("Introduce las "+n+calificaciones);
            for(int i=0;i<calificaciones.length;i++){
            System.out.println("Calificacion "+(i+1)+" = ");
            calificaciones[i]=t.nextFloat();
            t.close();
        }

        System.out.println("Las calificaciones capturadas son : ");
        for(float cal:calificaciones){
            System.out.println(cal+" ");
            suma=suma+cal;
            
        }
        
        promedio=suma/calificaciones.length;
        System.out.println("la suma es "+suma);
        System.out.println("El promedio es "+promedio);
        
    }
    
}
