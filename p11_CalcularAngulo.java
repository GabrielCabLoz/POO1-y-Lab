import java.util.Scanner;
public class p11_CalcularAngulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        int angulo1,angulo2,angulo3;
        Scanner t =new Scanner(System.in);
        System.out.println("Dame el Angulo 1");
        angulo1=t.nextInt();
        System.out.println("Dame el Angulo 1");
        angulo2=t.nextInt();
        t.close();

        angulo3=180-(angulo1+angulo2);
        System.out.println("La longitud del angulo 3 es : " + angulo3);

        
    }
    
}
