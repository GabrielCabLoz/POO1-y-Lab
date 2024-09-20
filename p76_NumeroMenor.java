//Programa que lee 4 numeros y devuelve el mayor

import java.util.*;
public class p76_NumeroMenor {

    public static int numMayor(int num1,int num2,int num3,int num4){
       
        int mayor=0;

        if(num1>num2&&num1>num3&&num1>num4)mayor=num1;
        else if(num2>num1&&num2>num3&&num2>num4)mayor=num2;
        else if(num3>num1&&num3>num2&&num3>num4)mayor=num3;
        else if(num4>num1&&num4>num2&&num4>num3)mayor=num4;
        return mayor;
    }
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");System.out.flush();

        int num1,num2,num3,num4;
        Scanner t=new Scanner(System.in);

        System.out.println("Dame el primer numero");
        num1=t.nextInt();
        System.out.println("Dame el segundo numero");
        num2=t.nextInt();
        System.out.println("Dame el tercer numero");
        num3=t.nextInt();
        System.out.println("Dame el cuarto numero");
        num4=t.nextInt();
        t.close();

        System.out.println("El numero mayor es "+numMayor(num1,num2,num3,num4));
    }
    
}
