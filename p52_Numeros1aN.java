import java.util.*;
public class p52_Numeros1aN {

    public static void main(String[] args) {

        Scanner t =new Scanner(System.in);
        int p=0;

        System.out.println("Imprime los numeros de 1 al 100 usando for");
        System.out.println("Hasta donde vas a llegar?");int n=new Scanner(System.in).nextInt();
        System.out.println("De cuanto quieres que incremente ? ");
        p=t.nextInt();
        t.close();


        for(int i=0;i<=n;i+=p)
        System.out.println(i+" ");

        
    }

    
}