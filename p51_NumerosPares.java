import java.util.Scanner;

public class p51_NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Ingrese el número final (n): ");
            int n = scanner.nextInt();
            int suma = 0;
            int cont = 0;
            int numero = 100; 

            System.out.print("Números pares entre 100 y " + n + ": ");

           
            while (numero >= n) {
                if (numero % 2 == 0) { 
                    System.out.print(numero + " ");
                    suma += numero;
                    cont++;
                }
                numero--;
            }

            
            double promedio;
            if (cont == 0) {
                promedio = 0; 
            } else {
                promedio = (double) suma / cont; 
            }

            
            System.out.println();
            System.out.println("La suma: " + suma);
            System.out.println("El promedio: " + promedio);

            
            System.out.print("¿Deseas realizar otra operación (S/N)? ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' );

        scanner.close();
    }
}
