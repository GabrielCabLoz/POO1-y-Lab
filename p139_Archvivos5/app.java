package p139_Archvivos5;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Procesa procesa = new Procesa();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Capturar datos de estudiante");
            System.out.println("2. Grabar datos en archivo");
            System.out.println("3. Leer datos desde archivo");
            System.out.println("4. Mostrar datos de estudiantes");
            System.out.println("5. Calcular promedio de calificaciones");
            System.out.println("6. Calcular promedio de edades");
            System.out.println("7. Contar hombres");
            System.out.println("8. Contar mujeres");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> procesa.capturaDatos();
                case 2 -> procesa.grabarDatos();
                case 3 -> procesa.leerDatos();
                case 4 -> procesa.mostrarDatos();
                case 5 -> procesa.calcularPromedioCalificaciones();
                case 6 -> procesa.calcularPromedioEdades();
                case 7 -> procesa.contarHombres();
                case 8 -> procesa.contarMujeres();
                case 9 -> System.out.println("Saliendo del programa.");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 9);

        scanner.close();
    }
}