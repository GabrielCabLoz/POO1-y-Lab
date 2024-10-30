import java.util.*;
public class p128_ExcepcionRaiz {

    

     
    public static void main(String[] args) {
        float Num1;
        Scanner t =new Scanner(System.in);

        try {
            System.out.println("Dame un numero flotante para sacar su raiz : ");
            Num1=t.nextFloat();
            t.close();

            double newNum=Math.sqrt(Num1);

            System.out.println("El resultado es "+newNum);

        } catch (Exception e) {

            System.out.println("Error no se pudo calcular su raiz ");
            
        }



    }
    


    
    
    
}
