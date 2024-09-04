import java.util.Scanner;

public class p53_NumerosNa1 {

    public static void main(String[] args) {
        int j,n,p;

        Scanner t =new Scanner(System.in);
        System.out.println("Desde donde deseas decender ? "); n=t.nextInt();
        System.out.println("En decrementos de ?");
        p=t.nextInt();
        t.close();

        for(j=n; j>=1;j-=p)
        System.out.print(j+" ");

        System.out.println("El ciclo ha terminado vete a comer chilaquiles");
    }
    
}
