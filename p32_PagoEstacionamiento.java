import java.util.*;;

public class p32_PagoEstacionamiento {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner t =new Scanner(System.in);
        
        float tasa=0,pago=0,impuesto=0,total=0;
        String op;
        System.out.println("Elige el tipo de estacionamiento que usaste");

        System.out.println("N - Estacionamiento norte 3%");
        System.out.println("S - Estacionamiento sur 5%");
        System.out.println("E - Estacionamiento este 10%");
        System.out.println("O - Estacionamiento oeeste 15%");
        System.out.println("Elige una de las opciones cabro");
        op = t.nextLine();
        System.out.print("cuanto pagaste ? ");
        pago=t.nextFloat();
        t.close();

        switch (op) {
            case "N" : tasa = 0.03f;break;
            case "S" : tasa = 0.05f;break;
            case "E" : tasa = 0.10f;break;
            case "O" : tasa = 0.15f;break;
            default : System.out.println("Opción Inválida !!!");break;
        }

        impuesto=pago*tasa;
        total=pago+impuesto;
        System.out.println(" Pagaste "+pago+" con un impuesto de "+op+" En total pagaste : "+total);

        


        
    }

    
}