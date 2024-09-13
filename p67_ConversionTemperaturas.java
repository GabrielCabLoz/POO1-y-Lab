
    // Conversion de temperaturas usando funciones

import java.util.Scanner;
import static java.lang.System.out;

public class p67_ConversionTemperaturas {
    
    public static float Farenheit(float t) {
        float far = (t*9/5)+32;
        return far;
    }

    public static float Celcius(float t) {
        float cel = (t-32)*5/9;
        return cel;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int op;
        float temp, res;
        Scanner t = new Scanner(System.in);

        out.println("[1] farenheit\n[2] celcius\nElige ? "); op = t.nextInt();
        if(op == 1) {
            out.println("\nDame la temperatura ? "); temp = t.nextFloat();
            res = Farenheit(temp);
            out.printf("\n%.2f grados celcius equivale a %.2f grados farenheit ..", temp, res);
        }else if(op == 2) {
            out.println("\nDame la temperatura ? "); temp = t.nextFloat();
            t.close();
            res = Celcius(temp);
            out.printf("\n%.2f grados farenheit equivale a %.2f grados celcius ..", temp, res);
        }else out.println("Opción inválida");

    }    
    
}

    

