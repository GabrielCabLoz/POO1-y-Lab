public class p86_ArregloMostrar {
    public static void mostrarArreglo(int[] arreglo) {
        for (int indice = 0; indice < arreglo.length; indice++) {
            System.out.print(arreglo[indice] + " ");
        }
    }

    public static void elevarCuadrado(int[] arreglo) {
        for (int indice = 0; indice < arreglo.length; indice++) {
            arreglo[indice] = arreglo[indice] * arreglo[indice];
        }
    }
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush(); 
        int[] numeros = {2, 4, 6, 8, 3, 5, 7};
        System.out.println("\nElementos del arreglo originales:");
        mostrarArreglo(numeros);

        System.out.println("\nElementos del arreglo elevados al cuadrado:");
        elevarCuadrado(numeros);
        mostrarArreglo(numeros);
    }
}
