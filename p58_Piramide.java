import java.util.*;
public class p58_Piramide {

    public static void main(String[] args) {
        int i,j,r;
        char c ;
        Scanner obj = new Scanner(System.in);
        

        System.out.print("\033[H\033[2J");System.out.flush();
        
        System.out.print("Cuantos renglones ? "); r = obj.nextInt();
        
        System.out.print("De que caracter quiere su piramide ? "); c = obj.next().charAt(0);
        for(i=1; i<=r; i++) {
        for(j=1; j<=i; j++) {
        
        System.out.print(c);
        
        }
        System.out.println();
        }
      
    
}
}

