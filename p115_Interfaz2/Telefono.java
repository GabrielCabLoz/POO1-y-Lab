package p115_Interfaz2;

public class Telefono implements Radio,Gps{

    public void obtenerCordenadas(){
        System.out.println("Obteniendo cordenadas");

    }

    public void iniciarRadio()  {
        System.out.println("Iniciando radio en 3...2...1 ");
        System.out.println("radio iniciada");

    }

    public void deterRadio(){
        System.out.println("Deteniendo radio....");
        System.out.println("Radio detenida");

    }



    
}
