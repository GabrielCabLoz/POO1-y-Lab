package p139_Archvivos5;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
class Procesa {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private final String archivo = "estudiantes.dat";

    public void capturaDatos() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        
        System.out.print("Promedio: ");
        double promedio = scanner.nextDouble();
        
        System.out.print("Sexo (M/F): ");
        char sexo = scanner.next().charAt(0);
        
        estudiantes.add(new Estudiante(nombre, edad, promedio, sexo));
        System.out.println("Estudiante capturado exitosamente.");
    }

    public void grabarDatos() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(estudiantes);
            System.out.println("Datos guardados en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al grabar datos: " + e.getMessage());
        }
    }

    public void leerDatos() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            estudiantes = (ArrayList<Estudiante>) in.readObject();
            System.out.println("Datos cargados del archivo.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer datos: " + e.getMessage());
        }
    }

    public void mostrarDatos() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay datos para mostrar.");
        } else {
            for (Estudiante est : estudiantes) {
                System.out.println(est);
            }
        }
    }

    public void calcularPromedioCalificaciones() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes para calcular el promedio.");
            return;
        }
        
        double suma = 0;
        for (Estudiante est : estudiantes) {
            suma += est.getPromedio();
        }
        
        System.out.println("Promedio de calificaciones: " + (suma / estudiantes.size()));
    }

    public void calcularPromedioEdades() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes para calcular el promedio de edades.");
            return;
        }

        int suma = 0;
        for (Estudiante est : estudiantes) {
            suma += est.getEdad();
        }

        System.out.println("Promedio de edades: " + (double) suma / estudiantes.size());
    }

    public void contarHombres() {
        int count = 0;
        for (Estudiante est : estudiantes) {
            if (est.getSexo() == 'M' || est.getSexo() == 'm') {
                count++;
            }
        }
        System.out.println("Cantidad de hombres: " + count);
    }

    public void contarMujeres() {
        int count = 0;
        for (Estudiante est : estudiantes) {
            if (est.getSexo() == 'F' || est.getSexo() == 'f') {
                count++;
            }
        }
        System.out.println("Cantidad de mujeres: " + count);
    }
    
}
