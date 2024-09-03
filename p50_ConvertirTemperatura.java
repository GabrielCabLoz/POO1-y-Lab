import java.util.Scanner;

public class p50_ConvertirTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        System.out.print("\033[H\033[2J");
        System.out.flush();


        do {
            System.out.print("Introduce la temperatura inicial de los chilaquiles en grados centígrados: ");
            int tempInicial = scanner.nextInt();

            System.out.print("Introduce la temperatura final de los chilaquiles en grados centígrados: ");
            int tempFinal = scanner.nextInt();

            
            while (tempFinal < tempInicial) {
                System.out.println("Error: los chilaquiles final no pueden tener una menor temperatura que la inicial.");
                System.out.print("Introduce nuevamente la temperatura final de los chilaquiles en grados centígrados: ");
                tempFinal = scanner.nextInt();
            }

            System.out.println("Conversión de temperaturas de grados centígrados a Fahrenheit:");

            
            int tempCen = tempInicial;
            while (tempCen <= tempFinal) {
                double tempF = (tempCen * 9.0 / 5.0) + 32;  
                System.out.println(tempCen + " °C = " + tempF + " °F");
                tempCen++;  
            }

           
            System.out.print("¿Deseas realizar otra conversión (S/N)? ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S');

        scanner.close();
    }
}
