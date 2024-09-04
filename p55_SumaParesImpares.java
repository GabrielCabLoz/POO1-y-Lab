import java.util.Scanner;

public class p55_SumaParesImpares {

    public static void main(String[] args) {

        int op, s = 0;
        Scanner t = new Scanner(System.in);

        System.out.println("Numeros de 1 a n impares (1)");
        System.out.println("Numeros de n a 1 pares   (2)");
        System.out.println("Salir                    (3)");
        System.out.println("Elige");
        op = t.nextInt();

        switch (op) {
            case 1:
                System.out.println("Imprimiendo de 1 a n");
                System.out.println("Hasta donde? ");
                int n = t.nextInt();
                for (int i = 1; i <= n; i += 2) {
                    System.out.print(i + " ");
                    s += i;
                }
                System.out.println("\nSuma de impares: " + s);
                break;

            case 2:
                System.out.println("Imprimiendo de n a 1");
                System.out.println("Desde donde?");
                int p = t.nextInt();
                for (int i = p; i >= 1; i -= 2) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                        s += i;
                    }
                    t.close();
                }
                System.out.println("\nSuma de pares: " + s);
                break;

            case 3:
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opcion invalida");
                break;
        }
    }
}
