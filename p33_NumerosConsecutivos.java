import java.util.*;
public class p33_NumerosConsecutivos  {

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner t =new Scanner(System.in);

        int num1,num2,num3;
        
        
        System.out.println("Dame el primer numero");
        num1=t.nextInt();
        System.out.println("Dame el segundo numero");
        num2=t.nextInt();
        System.out.println("Dame el tercer numero");
        num3=t.nextInt();

        if(num1<num2&&num1<num3){System.out.println("Los numeros  "+num1+" "+num2+" "+num3+"  "+"Son Consecutivos");
        
        }else System.out.println("Error hijo los numeros no son consecutivos");



        
    }

    
}