import java.util.Scanner;
public class p02_Circulo_Area {

    public static void main(String []args){

        double radio,area;
        Scanner t=new Scanner(System.in);
        System.out.println("\nCalculando area de un circulo con su radio\n");
        System.out.print("Dame el radio del circulo");
        radio=t.nextDouble();
        t.close();
        area=Math.PI*Math.pow(radio,2);
        System.out.println("El circulo tiene un radio de "+radio+" Por lo tanto su area es : " +area);
        
    }
    
}
