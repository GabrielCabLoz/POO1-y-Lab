
import java.util.*;

import javax.swing.JOptionPane;
public class practica_Switch {


// Programa que de una calificacion A,B,C,D,F
// dependiendo de 0 a 100


public static void main(String[] args) {

    int calf;

    Scanner t=new Scanner(System.in);

    System.out.println("Ingresa tu calificacion ");
    calf=t.nextInt();
    t.close();

    switch(calf){
        case 1: JOptionPane.showMessageDialog(null,"Tu nota es F");//con esto se puede generar una ventana con el mensaje
        break;
        case 2: System.out.println("Tu nota es F");
        break;
        case 3: System.out.println("Tu nota es F");
        break;
        case 4: System.out.println("Tu nota es F");
        break;
        case 5: System.out.println("Tu nota es F");
        break;
        case 6: System.out.println("Tu nota es D");
        break;
        case 7: System.out.println("Tu nota es C");
        break;
        case 8: System.out.println("Tu nota es B");
        break;
        case 9: System.out.println("Tu nota es A");
        break;
        case 10: System.out.println("Tu nota es A+");
        break;
       

    }




    
}
    
    
}
