import java.util.*;
public class p54_ArribaAbajo {

    public static void main(String[] args) {

        int op;
        Scanner t =new Scanner(System.in);

        System.out.println("Numeros de 1 a n (1)");
        System.out.println("Numeros de n a 1 (2) ");
        System.out.println("Salir            (3)");
        System.out.println("Elige");
        op=t.nextInt();

        switch (op) {
            case 1:
             System.out.println("Imprimiendo de 1 a n");
             System.out.println("Hasta donde ? "); int n=t.nextInt();
             for(int  i=1; i<=n; i++)System.out.println(i+" ");
                
                break;

            case 2:
             System.out.println("Imprimiendo de 1 a n");
             System.out.println("Desde donde ?"); int p=t.nextInt();
             for(int i=p; i>=1; i--)System.out.println(i+" ");
                   
                break;

            case 3:
             System.out.println("Imprimiendo de 1 a n");
                
                break;
        
            default:
             System.out.println("Opcion invalida");
                break;
        }

    
        
    }
    
}
