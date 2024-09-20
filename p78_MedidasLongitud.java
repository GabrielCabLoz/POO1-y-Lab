import java.util.*;

public class p78_MedidasLongitud {

    public static double convertirCentimetros(double Pulgadas){
        
        double totalCm=Pulgadas*2.54;
        return totalCm;
    
    }
    public static double convertirMetros (double metros){
        
        double totalM=metros*3.28084;
        return totalM;
    
    }

    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J");System.out.flush(); 
        double Pulgadas,metros;
        Scanner t=new Scanner(System.in);
        int op=0;
        System.out.println("Ingresa que quieres convertir pulgadas a centimertros(1) o Metros a pies(2)");
        op=t.nextInt();
        
        switch (op) {
            case 1:System.out.println("Ingresa las pulgadas");Pulgadas=t.nextDouble();
            System.out.println("Las pulgadas ingresadas son: "+Pulgadas+" En Cm son "+convertirCentimetros(Pulgadas)+" Cm ");
                
                break;

           case 2:System.out.println("Ingresa los metros ");metros=t.nextDouble();
           t.close();

           System.out.println("Los metros ingresados son: "+metros+" En pies son "+convertirMetros(metros)+" pies ");
                
             break;
        
        
            default:System.out.println("Caso invalido");
                break;
        }
    }
    




    
}
