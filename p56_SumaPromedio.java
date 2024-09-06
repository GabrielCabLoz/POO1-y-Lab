import java.util.*;
public class p56_SumaPromedio {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        
        Scanner t=new Scanner(System.in);
        float cal=0,sum=0,prom=0;
        int n;
        boolean repit=true;//con el bulean podemos podemos guardar mas de 1 caracter

       while (repit) {

        System.out.println("Suma y promedio de n calificaciones");
        System.out.println(" ");
        cal=sum=prom;
        System.out.println("Cuantas calificaciones ?");
        n=t.nextInt();
        for(int x=1;x<=n;x++){
        System.out.println("Calificaion "+x+" ? ");
        cal=t.nextFloat();
        sum+=cal;
        }
    

        prom=sum/n;
        System.out.println("La suma es :"+sum);
        System.out.println("El promedio es : "+prom);
        System.out.println("deseas repetir (si/no)");
        String resp=t.next().toLowerCase();
        repit=resp.equals("si");
       }
       System.out.println("Proceso terminado");
        t.close();
        
    }
    
}
