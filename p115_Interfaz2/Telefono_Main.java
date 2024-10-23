package p115_Interfaz2;

public class Telefono_Main {

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");System.out.flush();
        
        Telefono Telefono1=new Telefono();
        Telefono1.obtenerCordenadas();
        Telefono1.iniciarRadio();
        Telefono1.deterRadio();
    }
    
    
}
