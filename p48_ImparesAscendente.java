import java.util.Scanner;
public class p48_ImparesAscendente   {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char fin;

            System.out.print("\033[H\033[2J");
            System.out.flush();
    
    
            do {
                System.out.print("Introduce el número límite: ");
                int n = scanner.nextInt();
                int suma = 0;
                int cont = 0;
                int i = 1;
    
                System.out.print("Números impares entre 1 y " + n + ": ");
                while (i <= n) {
                    System.out.print(i + " ");
                    suma += i;
                    cont++;
                    i += 2;
                }
    
                System.out.println("\nSuma: " + suma);
    
                double promedio;
                if (cont == 0) {  
                    promedio = 0;
                } else {  
                    promedio = suma / cont;
                }
    
                System.out.println("Promedio: " + promedio);
    
                System.out.print("¿Deseas continuar (S/N)? ");
                fin = scanner.next().charAt(0);
            } while (fin == 'S' );
    
            scanner.close();
        }
    }
    