import java.util.*;
public class p40_Numeros100a1 {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.flush();
         
        int c,num;
        c=0;
        num=1;
        Scanner t =new Scanner(System.in);
        System.out.println("Desde donde quieres deseas desender");
        num=t.nextInt();
        System.out.println("De cuanto quieres que decremente");



        while (num>=c) {
            System.out.print(c+" ");
            c--;

            
        }
        System.out.println(c);

        
        
    }
    
}
