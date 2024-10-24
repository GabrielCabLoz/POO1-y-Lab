package p119_Organismo;

public class Organismo_Main {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        
        Perro miperro = new Perro("Lassie");
        System.out.println("Mi perro " + miperro.getNombre() + ", en acción:");
        miperro.respiracion();
        miperro.movimiento();
        miperro.crecimiento();
        miperro.multiCelular();
        miperro.sangreCaliente();
        miperro.correr();
        miperro.cuatroPatas();
        System.out.println();

        perico miperico = new perico("Sparrow");
        System.out.println("Mi perico " + miperico.getNombre() + ", en acción:");
        miperico.respiracion();
        miperico.movimiento();
        miperico.crecimiento();
        miperico.multiCelular();
        miperico.sangreCaliente();
        miperico.volar();
        miperico.dosPatas();
        System.out.println();
        }
    
}
