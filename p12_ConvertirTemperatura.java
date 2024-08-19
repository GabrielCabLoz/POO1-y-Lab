import java.util.Scanner;
public class p12_ConvertirTemperatura{
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J"); System.out.flush();

        double celsius,fahrenheit;
        Scanner t =new Scanner(System.in);

        System.out.println("Dame los grados en fahrenheit ");
        fahrenheit=t.nextFloat();
        t.close();

        celsius=((fahrenheit-32)*(5.0/9.0));

        System.out.println("Los grados en celsius son : " + celsius);



        
    }
}