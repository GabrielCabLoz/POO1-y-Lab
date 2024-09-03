import java.util.*;
public class p39_Numeros1a100 {

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        int c,n,s;
        c=0;
        n=1;
        s=0;
        Scanner t =new Scanner(System.in);
        System.out.println("Ingresa hasta que numero quieres que se impriman");
        n=t.nextInt();
        System.out.println("De cuantos quiere que avance");
        s=t.nextInt();
        t.close();
        
        while(c<=n){
            System.out.println(c+" Chilaquiles  ");
            c=c+s;

        }

        System.out.println("Ya terminamos el ciclo");
        

        
    }

    
}
