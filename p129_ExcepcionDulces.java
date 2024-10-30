import java.util.*;
public class p129_ExcepcionDulces {

    public static void main(String[] args) {
        
       int niños;
       int dulces;
    
        Scanner t =new Scanner(System.in);
        System.out.println("Hola es Hallowen ");
        System.out.println("Repartiremos dulces pero deben ser las mismas cantiadades ");


        try {
            System.out.println("Numero de los santos niños del barrio ");
            niños=t.nextInt();

            System.out.println("Numero de golosinas disponibles");
            dulces=t.nextInt();
            t.close();

            int repartir=dulces/niños;
            
            if(repartir<1)System.out.println("No se puede partir un dulce en 2 cabro");
            System.out.println(" ");
            System.out.println("A cada morrillo le toca de "+repartir+ " dulces ");
            
        } catch (InputMismatchException e) {
            System.out.println("Los niños y los dulces deben ser cantidades numericas");
            
        }catch(ArithmeticException e ){
            System.out.println("Los niños y los dulces deben ser cantidades numericas");

        }
    }
    
}
