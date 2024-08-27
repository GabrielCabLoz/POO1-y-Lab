import java.util.*;;
public class po36_comprarPizza {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner t =new Scanner(System.in);
        
        float costo=0,pago=0,total=0,total1;
        String op;
        System.out.println("Elige el tipo de piza que quieres");

        System.out.println("C - Costo $5");
        System.out.println("M - Costo $10");
        System.out.println("G - Costo $20");
        System.out.println("Elige una de las opciones ca    bro");
        op = t.nextLine();
        System.out.print("cuantas quieres ? ");
        pago=t.nextFloat(); 

        switch (op) {
            case "C" :costo=5 ;break;
            case "M" :costo=10;break;
            case "G" :costo=20 ;break;
            default : System.out.println("Opción Inválida !!!");break;
        }

        
        total=pago*costo;
        
        if(total>2000){
            float descuento =total*0.15f;
            total1=total-descuento;
            System.out.println("Felicidades por comprar mas de $2000 tienes un descuento del 15% este es tu total : "+total1);
        }
        else
        System.out.println("Lo siento cabro no tienes descuento tu total es de :"+total);
       

        
    }

    

    
    
}
