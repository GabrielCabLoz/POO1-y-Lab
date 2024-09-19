import java.util.Scanner;

public class p74_CalcularFactorial {

    public static double calcularFactorial(int numero) {
        double factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;  
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Introduce un número: ");
        int numero = t.nextInt();
        t.close();
        
        double resultadoFactorial = calcularFactorial(numero);
        System.out.printf("\nEl factorial de %d es %.0f\n", numero, resultadoFactorial);
    }
}
