import java.util.Scanner;
public class p03_Area_triangulo{
    
    public static void main (String[]args){
        int b;
        int a;
        Scanner t =new Scanner(System.in);
        System.out.println("Calculando el area de un triangulo");
        System.out.println("Ingresa la longitud en cm de la base");
        b=t.nextInt();
        System.out.println("Ingresa la longitud de la altura en cm  ");
        a=t.nextInt();
        t.close();
        double Area=(a*b)/2;
        System.out.println(String.format("El triángulo tiene como base %d cm, de altura %d cm, por lo tanto su área es: %.2f cm²", b, a, Area));
        



    }

}
