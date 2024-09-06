import java.util.Scanner;

public class p63_SumaTerminos1 {

    public static void main(String[] args) {
        int i, n;
        double suma = 0.0;

        Scanner t = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Cuantos términos ? ");
        n = t.nextInt();
        t.close();

        System.out.print("Salida: ");
        for (i = 1; i <= n; i++) {
            // Calcular el término armónico
            double term = 1.0 / i;

            // Imprimir el término armónico
            if (i == 1) {
                System.out.print("1");
            } else {
                System.out.print(" + 1/" + i);
            }

            // Sumar el término armónico a la suma total
            suma += term;
        }

        // Imprimir la suma total
        System.out.printf("\nSuma: %.12f\n", suma);
    }
}


