import java.util.*;
public class p77_DiaSemana {

    public static String diaSemana(int numero){

        String dia;

        switch (numero) {
            case 1:
             dia="Lunes";
             break;
            case 2:;
             dia="Martes";
             break;
            case 3:;
             dia="Martes";
             break;
            case 4:;
             dia="Martes";
             break;
            case 5:;
             dia="Martes";
             break;
            case 6:;
             dia="Martes";
             break;
            case 7:;
             dia="Martes";
             break;
            default:
             dia="No la chin solo existen 7 dias mi amigo";
                break;
        }
        return dia;
    }
    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J");System.out.flush();

        Scanner t =new Scanner(System.in);
        int numero;

        System.out.println("Ingresa un numero de del 1 al 7 para saber que dia de la semana es ");
        numero=t.nextInt();
        t.close();
        
        if(numero>=1&&numero<=8)
        System.out.println("El dia de la semana segun el numero que ingresaste es: "+diaSemana(numero));
        else System.out.println(diaSemana(numero));
        
    }
    
}
