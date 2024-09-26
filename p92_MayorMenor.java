import java.util.Scanner;

public class p92_MayorMenor {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.print("¿Cuántos números deseas capturar? ");
        int n = t.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = t.nextInt();
            t.close();
        }
        System.out.println("Números capturados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        int mayor = numeros[0];
        for (int i = 1; i < n; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        int menor = numeros[0];
        for (int i = 1; i < n; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
