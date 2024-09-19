import java.util.Scanner;

public class p71_MayorTresNumeros {

    public static float calcularMayor(float n1, float n2, float n3) {
        float mayor = n1; 
        if (n2 > mayor) {
            mayor = n2;  
        }
        if (n3 > mayor) {
            mayor = n3;  
        }
        return mayor;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.print("Introduce tres números separados por espacio: ");
        
        float num1 = t.nextFloat();
        float num2 = t.nextFloat();
        float num3 = t.nextFloat();
        t.close();
        
        float mayor = calcularMayor(num1, num2, num3);
        System.out.printf("\nEl número mayor es: %.2f\n", mayor);
    }
}
