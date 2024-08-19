import java.util.Scanner;
public class p15_ConvertirADolares{

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        float peso,dolar;
        Scanner t =new Scanner(System.in);
        System.out.println("Dame la cantidad en pesos para cotizarte a dolares ");
        peso=t.nextFloat();
        t.close();
        
        dolar=peso/20;

        System.out.println("Ingresaste "+peso+" Pesos Mx "+" Lo que es igual a "+dolar+" Dolares");

        
    }
    
}