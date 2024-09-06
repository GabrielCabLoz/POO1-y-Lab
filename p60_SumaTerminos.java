import java.util.Scanner;

public class p60_SumaTerminos {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int i, j, n;
        double s, r;

        System.out.print("\033[H\033[2J"); 
        System.out.flush();
        r = 0;

        System.out.print("¿Cuántos números? ");
        n = t.nextInt();

        for (i = 1; i <= n; i++) {
            s = 1; 
            for (j = 1; j <= i; j++) {
                    s *= j; 
                }
                System.out.printf(" 1 / %.0f +", s);
                r += (1 / s); 
            }

        System.out.printf("\nResultado: %.10f\n", r);

           

        t.close();
    }
}
