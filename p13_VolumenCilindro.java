import java.util.Scanner;

public class p13_VolumenCilindro {

    
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J"); System.out.flush();

        double altura,radio,volumen;
        Scanner t =new Scanner(System.in);

        System.out.println("Dame el radio  ");
        radio=t.nextInt();

        System.out.println("Dame la altura  ");
        altura=t.nextInt();
        t.close();

        volumen=3.1416*(radio*radio)*altura;

        System.out.println("El volumen del cilindro es : "+volumen);


    



        
    }
    
}
