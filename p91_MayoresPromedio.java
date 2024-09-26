import java.util.Scanner;

public class p91_MayoresPromedio {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        // Permitir al usuario capturar la cantidad de calificaciones
        System.out.print("¿Cuántas calificaciones deseas capturar? ");
        int n = t.nextInt();

        float[] calificaciones = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa la calificación " + (i + 1) + ": ");
            calificaciones[i] = t.nextFloat();
        }


        System.out.println("Calificaciones capturadas:");
        for (float calificacion : calificaciones) {
            System.out.print(calificacion + " ");
        }
        System.out.println();
        t.close();

        float suma = 0;
        for (float calificacion : calificaciones) {
            suma += calificacion;
        }
        float promedio = suma / n;

        System.out.println("Suma de las calificaciones: " + suma);
        System.out.println("Promedio de las calificaciones: " + promedio);

        System.out.println("Calificaciones mayores al promedio:");
        int count = 0;
        for (float calificacion : calificaciones) {
            if (calificacion > promedio) {
                System.out.print(calificacion + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Cantidad de calificaciones mayores al promedio: " + count);
    }
}
