import java.util.Scanner;

public class p57_TablasMultiplicar {

    public static void main(String[] args) {
        int i, j, n, m;
        char respuesta;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("¿Hasta qué tabla? "); 
            n = obj.nextInt();
            System.out.print("¿Hasta dónde? "); 
            m = obj.nextInt();

            for (i = 1; i <= n; i++) {
                System.out.printf("Tabla del %d\n", i);
                for (j = 1; j <= m; j++) {
                    System.out.printf("%d x %d = %d\n", i, j, i * j);
                }
                System.out.println(); 
            }

            System.out.print("\n¿Deseas continuar (S/N)? ");
            respuesta = Character.toUpperCase(obj.next().charAt(0));
        } while (respuesta == 'S');

        System.out.println("\nProceso terminado");
        obj.close();
    }
}

