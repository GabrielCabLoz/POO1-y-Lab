import java.util.*;

public class p79_SumaMultiplos {

    public static int sumaMultiplos(int ini, int constante, int fin) {
        int suma = 0;

        for (int i = ini; i <= fin; i++) {
            if (i % constante == 0) {
                suma += i;
            }
        }

        return suma;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        
        int constante;
        Scanner t= new Scanner(System.in);

        System.out.println("Programa para sumar múltiplos en un rango");
        System.out.println("1. Sumar múltiplos de 3");
        System.out.println("2. Sumar múltiplos de 4");
        System.out.print("Elige una opción (1 o 2): ");
        int opcion = t.nextInt();
 
        if (opcion == 1) {
            constante = 3;
        } else if (opcion == 2) {
            constante = 4;
        } else {
            System.out.println("Opción no válida.");
            return;
        }

        System.out.print("Ingresa el valor inicial del rango: ");
        int ini = t.nextInt();
        System.out.print("Ingresa el valor final del rango: ");
        int fin = t.nextInt();
        t.close();

        
        if (ini >= fin) {
            System.out.println("El valor inicial debe ser menor que el valor final.");
            return;
        }

        
        int resultado = sumaMultiplos(ini, constante, fin);
        System.out.println("La suma de los múltiplos de " + constante + " entre " + ini + " y " + fin + " es: " + resultado);
    }
}
