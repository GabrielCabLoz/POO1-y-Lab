

import java.io.*;
import java.util.ArrayList;

public class p137_Archivo4 {

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");System.out.flush();
        
        String archivo = "deportes.txt";
        ArrayList<String> deportes = new ArrayList<>(); 

        deportes.add("Fútbol");
        deportes.add("Béisbol");
        deportes.add("Ciclismo");
        deportes.add("Atletismo");
        deportes.add("Natación");
        deportes.add("Motociclismo");

        try {
           
            File file = new File(archivo);
            if (file.exists()) {
                System.out.println("El archivo " + archivo + " ya existe.");
            } else {
                grabarDatos(archivo, deportes);
                System.out.println("Datos grabados en el archivo " + archivo + " correctamente.");
            }

            
            ArrayList<String> datosLeidos = leerDatos(archivo);
            System.out.println("\nDatos leídos del archivo:");
            for (String deporte : datosLeidos) {
                System.out.println(deporte);
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