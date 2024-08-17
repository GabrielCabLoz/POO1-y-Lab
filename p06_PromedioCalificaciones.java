import java.util.Scanner;
public class p06_PromedioCalificaciones {

    public static void main(String[]args){
        System.out.print("\033[H\033[2J"); System.out.flush();

        float max;
        float min;
        float Promedio;
        float suma;
        float cal1;
        float cal2;
        float cal3;

        Scanner t=new Scanner(System.in);

        System.out.println("Dame la primer calificacion");
        cal1=t.nextFloat();
        System.out.println("Dame la Segunda calificacion");
        cal2=t.nextFloat();
        System.out.println("Dame la Tercer calificacion");
        cal3=t.nextFloat();
        t.close();

        suma=cal1+cal2+cal3;
        Promedio=suma/3;
        min=Math.min(Math.min(cal1, cal2),cal3);
        max=Math.max(Math.max(cal1, cal2),cal3);

        System.out.println("Las calificaciones dadas son : "+cal1+" , "+cal2+" , "+cal3);
        System.out.println(" ");
        System.out.println("El promedio es : "+Promedio);
        System.out.println(" ");
        System.out.println("La calificacion minima es : "+min);
        System.out.println(" ");
        System.out.println("La calificacion maxima es : "+max);
        



    }

}