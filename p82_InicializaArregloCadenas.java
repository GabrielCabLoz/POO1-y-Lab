import java.util.Scanner;

public class p82_InicializaArregloCadenas {

    public static void main(String[] args) {


        String[]Estados=new String[10];//inicializar arreglo[0]

        Estados[0]="Apozol";
        Estados[1]="Apuloc";
        Estados[2]="Cañitas";
        Estados[3]="Jerez";
        Estados[4]="Fresnillo";
        Estados[5]="Rio Grande";
        Estados[6]="Sain Alto";
        Estados[7]="Sombrerete";
        Estados[8]="Teul de gonzales Ortega";
        Estados[9]="Zacatecas";

        Scanner t =new Scanner(System.in);
        System.out.println("primer elemento "+Estados[0]);
        System.out.println("Ultimo elemento "+Estados[9]);
        System.out.println(" ");
        System.out.println("todos los elementos con un for en base al indice ");
        for(int i=0;i<Estados.length;i++)
            System.out.println(Estados[1]+", ");
        System.out.println("Todos los elementos del arreglo con un for sin indice");
        for (String m:Estados)
         System.out.println(m+" ");
        System.out.println("Proceso terminado");
        t.close();




        
    }
    
}
