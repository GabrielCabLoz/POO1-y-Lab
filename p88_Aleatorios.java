import java.util.Random;

public class p88_Aleatorios{
    public static void main(String[] args) {
        Random generador = new Random();

        int numeroPositivo = Math.abs(generador.nextInt());
        int numeroRango30 = generador.nextInt(31);  
        int numeroRango50a99 = generador.nextInt(50) + 50; 

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.printf("Número aleatorio positivo: %d", numeroPositivo);
        System.out.printf("Número aleatorio entre 0 y 30: %d", numeroRango30);
        System.out.printf("Número aleatorio entre 50 y 99: %d", numeroRango50a99);
    }
}
