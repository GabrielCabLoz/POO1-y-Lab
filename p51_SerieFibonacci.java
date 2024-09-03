import java.util.Scanner;

public class p51_SerieFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Ingrese el valor máximo (n): ");
            int n = scanner.nextInt();

            
            int a = 0, b = 1, c;
            int cont = 0;  

            System.out.print("La sucesión Fibonacci de los chilaquiles es: ");

            
            while (cont < n) {
                if (cont == 0) {
                    System.out.print(a + " ");
                } else if (cont == 1) {
                    System.out.print(b + " ");
                } else {
                    c = a + b;
                    System.out.print(c + " ");
                    a = b;
                    b = c;
                }
                cont++;
            }

            System.out.println();

            
            System.out.print("¿Deseas realizar otra operación (S/N)? ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' );

        scanner.close();
    }
}
