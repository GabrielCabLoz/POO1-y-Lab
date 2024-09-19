import java.util.Scanner;

public class p73_SumaDeParesImpares {

    public static int calcularSuma(int inicio, int fin, char tipo) {
        int suma = 0;
        for (int i = inicio; i <= fin; i++) {
            if (tipo == 'P' && i % 2 == 0) {
                System.out.printf("%d ", i);  // Imprime pares
                suma += i;
            } else if (tipo == 'I' && i % 2 != 0) {
                System.out.printf("%d ", i);  // Imprime impares
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Introduce el valor inicial: ");
        int inicio = t.nextInt();
        System.out.print("Introduce el valor final: ");
        int fin = t.nextInt();
        
        System.out.print("\nSelecciona [P]ares o [I]mpares: ");
        char seleccion = Character.toUpperCase(t.next().charAt(0));
        t.close();

        int sumaTotal = calcularSuma(inicio, fin, seleccion);
        System.out.printf("\nLa suma total es: %d\n", sumaTotal);
    }
}
