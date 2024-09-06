import java.util.Scanner;

public class p34_NumeroMayor {

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

        if(num1>num2&&num1>num3)System.out.println("El numero mayor es "+num1);
        if(num2>num1&&num2>num3)System.out.println("El numero mayor es "+num2);
        if(num3>num1&&num3>num2)System.out.println("El numero mayor es "+num3);
        
        else System.out.println("Error hijo los numeros no son consecutivos");
        t.close();



        
    }

    
}