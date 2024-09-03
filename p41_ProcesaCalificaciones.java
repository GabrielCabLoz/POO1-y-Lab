import java.util.Scanner;

public class p41_ProcesaCalificaciones {

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        //Procesa n calificaciones, calcula la suma y el promedio 

        int n,c;
        float calif,suma=0,prom;
        Scanner t =new Scanner(System.in);
        calif = suma=prom=0;

        System.out.println("Procesa n calificaiones , calcula la suma,y el promedio");
        System.out.println("Cuantas calificaciones?");
        n=t.nextInt();
        c=1;


        while (c<=n){
        System.out.printf("ingresa tu calificacion ? ",c++);
        System.out.println(" ");
        calif=t.nextFloat();
        t.close();
        suma=suma+calif;
        }

        prom=suma/n;
        System.out.println("La suma es : "+suma);
        System.out.println("El promedio es : "+prom );




        
    }
    
}
