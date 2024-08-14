import java.util.Scanner;
public class pagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga , tasa,impuesto ,pagaBruta,pagaNeta;
        Scanner t =new Scanner(System.in);

        System.out.println("Ingresa el nombre del trabajador ");
        nombre=t.nextLine();
        System.out.println("Ingresa las horas trabajadas");
        horas=t.nextInt();
        System.out.println("Ingresa la paga por hora");
        paga=t.nextFloat();
        t.close();
        tasa=0.3;

        pagaBruta=horas*paga;
        impuesto=pagaBruta*tasa;
        pagaNeta=pagaBruta-impuesto;

        System.out.println("\nResumne de pagos\n");
        System.out.println(String.format("El trabjador %s , trabajo %d horas , a una paga de %.2f pesos la hora, con una tasa de impuesto de %.2f",nombre,horas,paga,tasa));
        System.out.println(String.format("Paga bruta=%.2f",pagaBruta));
        System.out.println(String.format("Impuestos=%.2f",impuesto));
        System.out.println(String.format("Paga neta=%.2f",pagaNeta));
        

    }

    
}
