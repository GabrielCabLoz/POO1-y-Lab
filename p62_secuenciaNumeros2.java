import java.util.*;
public class p62_secuenciaNumeros2 {

  public static void main(String[] args) {
    int i,j,r;
        
    Scanner obj = new Scanner(System.in);
        

    System.out.print("\033[H\033[2J");System.out.flush();
        
    System.out.print("Cuantos renglones ? "); 
    r = obj.nextInt();
        
       
    for(i=1; i<=r; i++) {
      for(j=1; j<=i; j++) {
        System.out.print(j+" ");
        
       
        
      }
      System.out.println();
    } 
  }  
}

