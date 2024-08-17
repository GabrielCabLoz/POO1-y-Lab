import java.util.Scanner;

public class p09_Dividir_en_cifras {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
         
        int num,unidades,decenas,centenas;
        Scanner t=new Scanner(System.in);

        System.out.println("Dame un numero entero de 3 cifras:");
        num=t.nextInt();
        t.close();
    
        centenas = num / 100 ;
        decenas =  num / 10 ;
        unidades = num/1;
        System.out.println("El número introducido fue: " + num);
        System.out.println("Centenas: " + centenas);
        System.out.println("Decenas: " + decenas);
        System.out.println("Unidades: " + unidades);
        
       
        
    }
    
}
