import java.util.Scanner;
public class p10_Hipotenusa{
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        double lonT1,lonT2,Hipotenusa;
        Scanner t =new Scanner(System.in);
        
        System.out.println("Dame la longitud del lado 1");
        lonT1=t.nextInt();
        System.out.println("Dame la longitud del lado 2");
        lonT2=t.nextInt();
        t.close();

        Hipotenusa=Math.sqrt(lonT1*lonT1+lonT2*lonT2);
        System.out.println("La hipotenusa es : "+Hipotenusa);




    }
}