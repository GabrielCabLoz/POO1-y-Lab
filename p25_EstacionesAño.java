import java.util.Scanner;
public class p25_EstacionesAño {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        Scanner t =new Scanner(System.in);
        int n;
        System.out.println("Ingresa un numero del 1 al 4 para mostrar la estacion del año segun el numero elegido");
        n=t.nextInt();
        t.close();

        if(n==1)System.out.println("Primavera");
        if(n==2)System.out.println("Verano");
        if(n==3)System.out.println("Otoño");
        if(n==4)System.out.println("inviero");
        if(n==1)System.out.println("Proceso terminado");

        
    }

    
}