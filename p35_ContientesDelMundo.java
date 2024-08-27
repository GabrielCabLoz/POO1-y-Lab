import java.util.Scanner;

public class p35_ContientesDelMundo {

    public static void main(String[] args) {
        
    

    System.out.print("\033[H\033[2J");
        System.out.flush();
        
        Scanner t =new Scanner(System.in);
        int cont1;

        System.out.println("Dame un  numero para darte un contienente del mundo ");
        cont1=t.nextInt();
        t.close();

        

       switch (cont1) {
        case 1: System.out.println("Asia");
                 break;
        case 2:System.out.println("Africa ");
                break;
        case 3: System.out.println("America del Norte ");
                break;
        case 4:System.out.println("America del sur ");
               break;
        case 5:System.out.println("Europa");
               break;
                    
       
        default:System.out.println("Solo un numero del 1 al 5");
            break;
       }
   }
    

    
}