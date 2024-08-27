import java.util.*;
public class p37_CalculoNotas {
    
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        Scanner t =new Scanner(System.in);
        int calf1,calf2,calf3,calf4,calf5,prom;

        System.out.println("Dame la primera calificacion");
        calf1=t.nextInt();

        System.out.println("Dame la segunda calificacion  ");
        calf2=t.nextInt();
        
        System.out.println("Dame la tercera calificacion");
        calf3=t.nextInt();
        
        System.out.println("Dame la cuarta calificacion");
        calf4=t.nextInt();

        System.out.println("Dame la quinta calificacion");
        calf5=t.nextInt();

        prom=(calf1+calf2+calf3+calf4+calf5)/5;

        
       if(prom>0&&prom<=6)
       System.out.println("Quedas reprobado");
       else if(prom>6&&prom<=7)System.out.println("Pasas de panzazo ");
       if(prom>7&&prom<=8)System.out.println("Muy bien, pues mejorar");
       if(prom>8&&prom<=9)System.out.println("Excelente sigue así ");
       if(prom>9&&prom<=10)System.out.println("Perfecto tu esfuerzo valió la pena ");
        
        
    }

    
}
