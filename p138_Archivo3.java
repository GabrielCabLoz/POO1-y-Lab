import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class p138_Archivo3 {

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");System.out.flush();
        
        String archivo = "materias.txt"; 
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> materias = new ArrayList<>();

      
        File file = new File(archivo);
        if (file.exists()) {
            System.out.println("El archivo '" + archivo + "' ya existe.");
        }

       
        System.out.println("Ingrese las materias (una por línea, deje una línea en blanco para terminar):");
        String materia;
        while (!(materia = scanner.nextLine()).isEmpty()) {
            materias.add(materia);
        }

        try {
            
            grabarDatos(archivo, materias);
            System.out.println("Materias grabadas en el archivo " + archivo + " correctamente.");

            
            ArrayList<String> materiasLeidas = leerDatos(archivo);
            System.out.println("\nMaterias leídas del archivo:");
            for (String materiaLeida : materiasLeidas) {
                System.out.println(materiaLeida);
            }
        } catch (IOException e) {
            System.err.println("Error al procesar el archivo: " + e.getMessage());
        }
    }

    public static void grabarDatos(String archivo, ArrayList<String> datos) throws IOException {
        BufferedWriter fdatos = new BufferedWriter(new FileWriter(new File(archivo)));
        for (String dato : datos) {
            fdatos.write(dato + "\n");
        }
        fdatos.close();
    }

    public static ArrayList<String> leerDatos(String archivo) throws IOException {
        ArrayList<String> datos = new ArrayList<>();
        BufferedReader fdatos = new BufferedReader(new FileReader(new File(archivo)));
        String dato;
        while ((dato = fdatos.readLine()) != null) {
            datos.add(dato);
        }
        fdatos.close();
        return datos;
    }
    

}