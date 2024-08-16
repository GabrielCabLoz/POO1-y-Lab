import java.util.Scanner;
public class OperadoresAsignacion {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Scanner t =new Scanner(System.in);
        int num;

        System.out.println("Dame un numero entero ");
        num=t.nextInt();
        t.close();

        System.out.println("El numero original es: "+num);
        System.out.println("Incrementar 1: "+(++num));// Incrementarlo
        System.out.println("El numero original mas 80: "+(num+=80));//sumar 80
        System.out.println("El numero original menos 35: "+(num-=35));
        System.out.println("El numero original multiplicado por 15: "+(num*=15));
        System.out.println("El numero original multiplicado por dividido entre 4: "+(num/=4));
        System.out.println("decrementar 1: "+(--num));

        
    }
}
