
import java.util.Scanner;

public class p68_SumaRango {

    public static float SumaRango(float ini, float fin) {
        float s=0;

        for(float i=ini; i <= fin ;i++){
            s+=i;
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        float ini, fin, res;
        Scanner t = new Scanner(System.in);

        do {

        System.out.print("Dame inicio : "); ini = t.nextFloat();
        System.out.print("Dame fin : "); fin = t.nextFloat();
        t.close();

        } while( ini > fin);

        res = SumaRango(ini, fin);
        System.out.printf("\nLa suma del rango es %.2f",res);

    }

}