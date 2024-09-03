import java.util.*;
public class p42_TablaMultiplicar {
    public static void main(String[] args) { 
        int c,t,n; 
        Scanner tec = new Scanner(System.in); 
        System.out.print("\033[H\033[2J");System.out.flush(); 
        System.out.print("Que tabla quieres ? "); 
        t = tec.nextInt(); 
        System.out.print("Hasta donde ? "); 
        tec.close();
        n = tec.nextInt(); 
        c = 1; 
        while( c <= n ) { 
        System.out.printf("%d x %d = %d\n", c, t, c*t); 
        c++; 
        } 
        System.out.println("\n ya te acabaste los chilaquiles ..."); 
  
    } 
}

        
    

