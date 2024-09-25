import java.util.Random;

public class p89_ArregloAleatoriosMod {

    // Método para mostrar los valores de un arreglo con formato
    public static void mostrarArreglo(float[] nums) {
        for (float n : nums) {
            System.out.printf("%.2f ", n);
        }
        System.out.println("\n");
    }

    public static void generarAleatorios(float[] nums) {
        float min = 10.5f, max = 41.5f;
        Random generador = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = min + generador.nextFloat() * (max - min);
        }
    }

    public static void sumarArreglos(float[] a1, float[] a2, float[] a3) {
        for (int i = 0; i < a1.length; i++) {
            a3[i] = a1[i] + a2[i];
        }
    }

    public static void main(String[] args) {
        int tamaño = 15;
        float[] A = new float[tamaño];
        float[] B = new float[tamaño];
        float[] C = new float[tamaño];

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Arreglos con números aleatorios generados:\n");

        generarAleatorios(A);
        generarAleatorios(B);
        mostrarArreglo(A);
        mostrarArreglo(B);

        System.out.println("Resultado de la suma de los arreglos A y B:\n");
        sumarArreglos(A, B, C);
        mostrarArreglo(C);
    }
}
