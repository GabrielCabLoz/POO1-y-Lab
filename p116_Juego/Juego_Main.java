package p116_Juego;

public class Juego_Main {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("\nJuego de dados ...");
        JuegoDeDados juego1 = new JuegoDeDados();
        juego1.iniciarJuego();
        juego1.Jugar();
        juego1.DetenerJuego();
        System.out.println("\nJuego de adivinar número ...");
        JuegoAdivina juego2 = new JuegoAdivina();
        juego2.iniciarJuego();
        juego2.Jugar();
        juego2.DetenerJuego();
    }
    

    
}
