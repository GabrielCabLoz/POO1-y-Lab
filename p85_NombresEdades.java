import java.util.Scanner;

public class p85_NombresEdades {
    public static void main(String[] args) {
        
        int n, s = 0, p = 0;
        Scanner t = new Scanner(System.in);  
        
        System.out.print("¿Cuántos elementos deseas procesar? ");
        n = t.nextInt();
        
        String[] nombres = new String[n];
        int[] edades = new int[n];
        
        
        System.out.println("Dame los nombres y edades:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = t.next();  
            
            System.out.print("Edad " + (i + 1) + ": ");
            edades[i] = t.nextInt();  
        }
        
       
        System.out.println("\nLos nombres y edades capturados son:");
        for (int i = 0; i < n; i++) {
            System.out.println("Nombre: " + nombres[i] + ", Edad: " + edades[i]);
            s=s+edades[i];
        }
        p=s/n;
        System.out.println("El promedio es "+p);
        t.close();  
    }
}
