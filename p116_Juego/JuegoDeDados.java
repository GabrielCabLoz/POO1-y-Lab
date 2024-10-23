package p116_Juego;
 import java.util.*;
public class JuegoDeDados implements Juego{

    private int dado1,dado2;
    private String jugador1,jugador2;
    private Scanner t;

    public JuegoDeDados(){
        t=new Scanner(System.in);

    }
    
    public void iniciarJuego(){

        System.out.print("Jugador 1: "); jugador1 = t.nextLine();
        System.out.print("Jugador 2: "); jugador2 = t.nextLine();

    }

    public void Jugar(){

       dado1 = 1 + (int) (Math.random() * 6);
       dado2 = 1 + (int) (Math.random() * 6);
       System.out.println(jugador1 + " El dado callo en el numero " + dado1);
       System.out.println(jugador2 + " El dado callo en el numero"  + dado2);

    }

    public void DetenerJuego(){
        if(dado1 > dado2) System.out.println("Gano "+jugador1+" con un numero de "+dado1);
        else if(dado2>dado1) System.out.println("Gano "+jugador2+" con un numero de "+dado2);
        else System.out.println("Empataron los jugadores con numero "+dado1);

    }
    
}
