import java.util.Scanner;

public class p75_ImprimirCuadro {

    public static void imprimirCuadro(int filas, int columnas, char caracter) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%c ", caracter); 
            }
            System.out.println();  
        }
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Número de filas: ");
        int filas = t.nextInt();
        System.out.print("Número de columnas: ");
        int columnas = t.nextInt();
        System.out.print("Caracter a usar: ");
        char caracter = t.next().charAt(0);
        t.close();

        imprimirCuadro(filas, columnas, caracter);
    }
}
