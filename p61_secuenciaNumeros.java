import java.util.*;
public class p61_secuenciaNumeros {

    public static void main(String[] args) {
        int i,j,r;
        
        Scanner t = new Scanner(System.in);
    
        System.out.print("\033[H\033[2J");System.out.flush();
        
        System.out.print("Cuantos renglones ? "); 
        r = t.nextInt();
        
       
       for(i=1; i<=r; i++) {
        for(j=1; j<=i; j++) {
            System.out.print(i+" ");
        
       
        
        }
        System.out.println();
        }
    
    
    }
}

