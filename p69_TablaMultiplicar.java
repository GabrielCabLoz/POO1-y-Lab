// Tabla de multiplicar

import java.util.Scanner;

public class p69_TablaMultiplicar {

    public static void Tabla(int q, int n) {

        System.out.printf("\nTabla del %d\n",q);
        for(int i=1; i <= n; i++){
            System.out.printf("%d x %d = %d\n",q,i,q*i);
        }
        
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        int q,n;
        Scanner t = new Scanner(System.in);

        System.out.print("Que tabla quieres ? "); q = t.nextInt();
        System.out.print("Hata donde la quieres ? "); n = t.nextInt();
        t.close();

        Tabla(q,n);

    }

}