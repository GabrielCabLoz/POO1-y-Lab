import java.util.Scanner;

public class p72_SumaDeDigitos {

    public static int sumarDigitos(int numero) {
        int suma = 0;
        while (numero != 0) {
            suma += numero % 10;  // Agrega el último dígito a la suma
            numero /= 10;  // Elimina el último dígito del número
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Introduce un número entero: ");
        
        int numeroIngresado = t.nextInt();
        t.close();
        
        int resultado = sumarDigitos(numeroIngresado);
        System.out.printf("\nLa suma de los dígitos es: %d\n", resultado);
    }
}
