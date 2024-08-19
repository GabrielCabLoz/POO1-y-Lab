import java.util.Scanner;
public class p14_CalcularTiempo{

    public static void main(String[] args) {

        double dias,segundos,minutos,h;
        System.out.print("\033[H\033[2J"); System.out.flush();
        Scanner t =new Scanner(System.in);

        System.out.println("Dame la cantidad de horas");
        h=t.nextDouble();
        t.close();

        dias=h/24;
        minutos=(dias*24)*60;
        segundos=minutos*60;

        System.out.println("En dias : " +dias);
        System.out.println("En minutos : "+minutos);
        System.out.println("En segundos : "+segundos );

        
    }

}


