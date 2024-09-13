
import java.util.Scanner;
import static java.lang.System.out;


public class p66_PromedioNumeros {
    

    public static float Promedio(float num1, float num2, float num3){
        System.out.print("\033[H\033[2J");System.out.flush();
        float suma, promedio;
        suma = num1 + num2 + num3;
        promedio = suma/3;
        return promedio;
    }       

    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);
        float n1, n2, n3, promedio;

        out.println("dame numero 1"); n1 = t.nextFloat();
        out.println("dame numero 2"); n2 = t.nextFloat();
        out.println("dame numero 3"); n3 = t.nextFloat();
        t.close();

        promedio = Promedio(n1, n2, n3);
        out.println("el promedio es: " + promedio);
        out.println("el promedio de 10.5, 20.5, 30.5 es: "+Promedio(10.5f, 20.5f, 30.5f));//aqui en los 3 numeros desde el codigo ya le damos un valor en los parametros
        
    }
}
