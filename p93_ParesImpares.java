import java.util.Random;
import java.util.Scanner;

public class p93_ParesImpares {
    public static void main(String[] args) {
        Scanner t= new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("¿Cuántos elementos deseas en los arreglos? ");
        int n = t.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(21);  
        }
        System.out.println("Elementos del arreglo a[]:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int countPares = 0;
        System.out.println("Elementos pares del arreglo a[]:");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                countPares++;
            }
            t.close();
        }
        System.out.println("\nCantidad de números pares: " + countPares);

        int countImpares = 0;
        System.out.println("Elementos impares del arreglo a[]:");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
                countImpares++;
            }
        }
       
        System.out.println("\nCantidad de números impares: " + countImpares);
    }
}
