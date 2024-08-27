import java.util.Scanner;

public class p30_javaDiasemana {

    public static void main(String[] args) {


        
        int dia;
        Scanner t = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Dame número entre 1 y 7 para decirte con letra ");
        dia = t.nextInt();
        t.close();
   
        switch (dia) {
            case '1':
                System.out.printf("Lunes");
                break;
            case '2':
                System.out.printf("Martes");
                break;
            case '3':
                System.out.printf("Miercoles");
                break;
            case '4':
                System.out.printf("jueves");
                break;
            case '5':
                System.out.printf("Viernes");
                break;
            case '6':
                System.out.printf("Sabado");
                break;  
            case '7':
                System.out.printf("Domingo");
                break;   
            default:
                System.out.printf("\nQuieres irte temprano a desyunar o no ?");
             break;

        }
        System.out.println("");
        System.out.println("Gracias por utilizar este programa");
        
    }

    
}