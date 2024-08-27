import java.util.Scanner;

public class p31_Numerosromanos {

     public static void main(String[] args) {


        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Dame número entre 1 y 10 para convertirlo a numeros romanos ");
        int dia = new Scanner(System.in).nextInt();
        
   
        switch (dia) {
            case 1:
                System.out.printf("I");
                break;
            case 2:
                System.out.printf("II");
                break;
            case 3:
                System.out.printf("III");
                break;
            case 4:
                System.out.printf("IV");
                break;
            case 5:
                System.out.printf("V");
                break;
            case 6:
                System.out.printf("VI");
                break;  
            case 7:
                System.out.printf("VII");
                break;   
                case 8:
                System.out.printf("VIII");
                break;  
                case 9:
                System.out.printf("IX");
                break;  
                case 10:
                System.out.printf("X");
                break;  
            default:
                System.out.printf("\nnumero invalido");
             break;

        }
        System.out.println("");
        System.out.println("Gracias por utilizar este programa de conversion tan complejo que hemos elaborado");
        
    }
    
}
